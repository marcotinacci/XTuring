package it.marcotinacci.turingmachine.generator.staticstructure;

import java.util.Set;

public class TuringMachine {
	private Tape _tape;
	private Set<State> _states;
	
	public TuringMachine(String string, Set<State> states){
		_tape = new Tape();
		TuringMachineUtils.writeOnTape(string, _tape);
		_states = states;
	}
	
	
	
}
