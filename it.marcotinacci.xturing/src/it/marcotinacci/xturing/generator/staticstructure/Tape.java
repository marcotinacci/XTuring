package it.marcotinacci.xturing.generator.staticstructure;

import java.util.HashMap;
import java.util.Set;

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
	
	@Override
	public String toString() {
		// find max and min
		Integer max = getMaxKey();
		Integer min = getMinKey();
		// compose output
		StringBuffer ret = new StringBuffer();
		for(Integer i = min; i <= max; i++){
			Character c = get(i);
			if(c == null)
				ret.append(' ');
			else
				ret.append(c);
		}
		ret.append('\n');
		for(Integer i = min; i <= max; i++){
			if(i.equals(_index)){
				ret.append('^');
			}else{
				ret.append(' ');
			}
		}
		return ret.toString();
	}
	
	public void goToFirst(){
		_index = getMinKey();
	}

	private Integer getMaxKey(){
		Set<Integer> keys = keySet();
		// find max
		Integer max = Integer.MIN_VALUE;
		for (Integer key : keys) {
			if(key > max)
				max = key;
		}
		return max;
	}
	
	private Integer getMinKey(){
		Set<Integer> keys = keySet();
		// find min
		Integer min = Integer.MAX_VALUE;
		for (Integer key : keys) {
			if(key < min)
				min = key;
		}
		return min;
	}
	
	public void writeAll(String str){
		for(int i = 0; i < str.length(); i++){
			write(str.charAt(i));
			move(Direction.RIGHT);
		}
	}
	
}
