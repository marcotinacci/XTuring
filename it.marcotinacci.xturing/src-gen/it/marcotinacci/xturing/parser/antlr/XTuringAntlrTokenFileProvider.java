/*
* generated by Xtext
*/
package it.marcotinacci.xturing.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XTuringAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("it/marcotinacci/xturing/parser/antlr/internal/InternalXTuring.tokens");
	}
}