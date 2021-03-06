package it.marcotinacci.xturing.generator.staticstructure;

import java.util.Set;

public class TuringMachine {

	private Tape tape;
	private Set<State> states;
	private State begin;
	
	public TuringMachine(String string, Set<State> states, State begin){
		tape = new Tape();
		tape.writeAll(string);
		tape.goToFirst();
		this.states = states;
		this.begin = begin;
	}
	
	public void run() {
		State current = begin;
		while(true){
			System.out.println(tape);
			// for each transaction
			for (Transaction t : current) {
				// check transaction condition
				if(t.readSymbol == null || t.readSymbol.equals(tape.read())){
					// execute transaction
					if(t.writeSymbol != null) tape.write(t.writeSymbol);
					tape.move(t.direction);
					current = t.toState;
					break;
				}
			}
			// if the final state has been reached then terminate
			if(current.getName().equals("terminate")) break;
		}
		System.out.println(tape);
	}

	public Set<State> getStates() {
		return states;
	}
	
	@Override
	public String toString() {
		return "Tape: " + tape + "\nStates: " + states;
	}
	
}
