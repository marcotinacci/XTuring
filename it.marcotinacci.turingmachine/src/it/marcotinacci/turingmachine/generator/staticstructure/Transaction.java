package it.marcotinacci.turingmachine.generator.staticstructure;

public class Transaction {
	public Character readSymbol;
	public Character writeSymbol;
	public Direction direction;
	public State toState;
	
	public Transaction(Character r, Character w, Direction d, State s) {
		readSymbol = r;
		writeSymbol = w;
		direction = d;
		toState = s;
	}
	
	@Override
	public String toString() {
		return "[" + readSymbol + "," +writeSymbol+ "," +direction.toString()+ "," +toState.getName()+ "]";
	}
}
