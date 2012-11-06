package it.marcotinacci.turingmachine.generator.staticstructure;

import java.util.Set;

public class TuringMachineUtils {
	
	public static void writeOnTape(String str, Tape tape){
		for(int i = 0; i < str.length(); i++){
			tape.write(str.charAt(i));
			tape.move(Direction.RIGHT);
		}
	}
	
	public static String readFromTape(Tape tape){
		Set<Integer> keys = tape.keySet();
		// find max and min
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;
		for (Integer key : keys) {
			if(key > max)
				max = key;
			if(key < min)
				min = key;
		}
		// compose output
		StringBuffer ret = new StringBuffer();
		for(Integer i = min; i <= max; i++){
			Character c = tape.get(i);
			if(c == null)
				ret.append(' ');
			else
				ret.append(c);
		}
		return ret.toString();
	}
}
