/*
 * generated by Xtext
 */
package it.marcotinacci.xturing.generator

import it.marcotinacci.xturing.generator.staticstructure.Alphabet
import it.marcotinacci.xturing.xTuring.Machine
import it.marcotinacci.xturing.xTuring.Transaction
import java.util.HashSet
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class XTuringGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var Machine m = resource.contents.get(0) as Machine
		// get the alphabet
		m.symbols.forEach(sym | Alphabet::instance.add(sym.name))
		Alphabet::instance.add('~')
		// generate the builder class
		fsa.generateFile("TuringMachineBuilder.java", m.compile)
	}

	def CharSequence compile(Machine machine) { 
		'''
		package it.marcotinacci.xturing.generator.staticstructure;

		import java.util.HashSet;

		public class TuringMachineBuilder {

			public static void main(String[] args) {
				TuringMachine tm = TuringMachineBuilder.build();
				tm.run();
			}

			public static TuringMachine build(){
				HashSet<State> states = new HashSet<State>();
				State terminate = new State("terminate");
				states.add(terminate);
				�FOR state:machine.states�
					State �state.name�;
					�state.name� = new State("�state.name�");
					states.add(�state.name�);
					�IF state.beginState�State begin = �state.name�;�ENDIF�
				�ENDFOR�
				�FOR state:machine.states�
					�addTransactions(state.name, state.transactions)�
				�ENDFOR�
				return new TuringMachine("111+11", states, begin);
			}
		}
		'''
	}

	def addTransactions(String stateName, EList<Transaction> transactions) {
		var Transaction complementary = null
		var HashSet<String> usedSymbols = new HashSet<String>
		var ret = new StringBuffer
		
		
		for(Transaction transaction : transactions){
			// multeplicity of the transaction
			var Integer size = null
			if(transaction.reading) size = transaction.read.size
			else if (transaction.writing) size = transaction.write.size
	
			// parameters of single transaction
			var String toRead = null
			var String toWrite = null
			var dir = transaction.getDirection
			var nextState = transaction.getState(stateName)

			if(!transaction.reading){
				// there should exists a single complementary transaction at most
				complementary = transaction
			}else{
				var i = -1
				while((i=i+1) < size){
					toRead = transaction.getReadSymbol(i)
					if(transaction.writing)
						toWrite = transaction.getWriteSymbol(i)
					else
						toWrite = null
					ret.append(transactionToJava(stateName, toRead, toWrite, dir, nextState))
					usedSymbols.add(toRead)
				}
			}
		}
		if(complementary != null){
			var String toWrite = null
			var String dir = complementary.getDirection
			var String nextState = complementary.getState(stateName)
			for(String s : Alphabet::instance){
				if(!usedSymbols.contains("'"+s+"'")){
					if(complementary.writing)
						toWrite = complementary.getWriteSymbol(0)
					else
						toWrite = null
					ret.append(transactionToJava(stateName, "'"+s+"'", toWrite, dir, nextState))
				}
			}
		}
		ret.toString
	}

	def transactionToJava(String stateName, String toRead, String toWrite, String dir, String nextState) {
		new String(
			stateName + ".add(new Transaction(" + 
			toRead + "," + 
			toWrite + ", Direction."+
			dir + "," + 
			nextState + "));\n"
		)
	}

	def String getWriteSymbol(Transaction transaction, int i) {
		if(transaction.writing){
			if(transaction.write.get(i).empty)
				return new String("'~'")
			else
				return new String("'"+transaction.write.get(i).symbol.name+"'")
		}
		return null
	}

	def String getReadSymbol(Transaction transaction, int i) {
		if(transaction.reading){
			if(transaction.read.get(i).empty)
				return new String("'~'")
			else
				return new String("'"+transaction.read.get(i).symbol.name+"'")
		}
		return null
	}

	def getState(Transaction transaction, String stateName) { 
		if(transaction.next)
			return transaction.toState.name
		if(transaction.final)
			return new String("terminate")
		return stateName
	}

	def getDirection(Transaction transaction) { 
		if(transaction.moving)
			if(transaction.move.equals("left")) "LEFT"
			else "RIGHT"
		else "STAND"
	}
}