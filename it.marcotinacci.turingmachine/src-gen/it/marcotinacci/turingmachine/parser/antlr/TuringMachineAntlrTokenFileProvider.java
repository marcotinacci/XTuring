/*
* generated by Xtext
*/
package it.marcotinacci.turingmachine.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TuringMachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.tokens");
	}
}