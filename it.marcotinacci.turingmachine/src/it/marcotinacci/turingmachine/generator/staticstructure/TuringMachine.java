package it.marcotinacci.turingmachine.generator.staticstructure;

import java.util.Set;

public class TuringMachine {
	
	public static void main(String[] args) {
		TuringMachine tm = TuringMachineUtils.buildTuringMachine();
		System.out.println(tm);
		tm.run();
	}

	private Tape tape;
	private Set<State> states;
	
	public TuringMachine(String string, Set<State> states){
		tape = new Tape();
		TuringMachineUtils.writeOnTape(string, tape);
		this.states = states;
	}
	
	public void run() {
		State current;
		// find initial state
		for (State s : states) {
			if(s.getName().equals("s0")){
				current = s;
				break;
			}
		}
		
		// TODO
		
	}

	public Set<State> getStates() {
		return states;
	}
	
	@Override
	public String toString() {
		return "Tape: " + tape + "\nStates: " + states;
	}
	
}
