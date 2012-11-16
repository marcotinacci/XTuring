package it.marcotinacci.xturing.generator.staticstructure;

import java.util.HashSet;

public class Alphabet extends HashSet<String> {
	
	private static final long serialVersionUID = -3348123883789127257L;
	
	// Singleton class
	
	private Alphabet() { }
	
	private static Alphabet instance = null;
	
	public static Alphabet getInstance(){
		if(instance == null){
			instance = new Alphabet();
		}
		return instance;
	}
	
	// TODO add utilities methods
	
	
}