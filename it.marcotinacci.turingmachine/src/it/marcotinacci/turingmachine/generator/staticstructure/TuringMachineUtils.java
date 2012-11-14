package it.marcotinacci.turingmachine.generator.staticstructure;

import java.util.HashSet;

public class TuringMachineUtils {
	
	public static TuringMachine buildTuringMachine(){
		HashSet<State> states = new HashSet<State>();
		State old = new State("s0");
		State begin = old;
		states.add(old);
		for (int i = 1; i < 7; i++) {
			State s = new State("s"+i);
			states.add(s);
			old.add(new Transaction('1', '2', Direction.RIGHT, s));
			old = s;
		}
		return new TuringMachine("11111", states, begin);
	}
}
