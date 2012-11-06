package it.marcotinacci.turingmachine.generator.staticstructure;

import java.util.HashMap;

public class Tape extends HashMap<Integer, Character> {
	
	private static final long serialVersionUID = 7241084988693512039L;
	
	private int _index = 0;
	
	public void move(Direction dir){
		switch (dir) {
		case LEFT:
			_index--;
			break;
		case RIGHT:
			_index++;
			break;
		case STAND:
			// do nonthing
			break;
		}
	}
	
	public void write(Character c){
		// if tilde remove current element
		if(c.equals('~'))
			remove(_index);
		put(_index,c);
	}
	
	public Character read(){
		Character ret = get(_index);
		// if null return tilde
		return ret == null ? '~' : ret;
	}

}
