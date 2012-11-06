package it.marcotinacci.turingmachine.generator.staticstructure;

import java.util.HashSet;
import java.util.Set;

public class State extends HashSet<Transaction> {
	private Set<Transaction> _transactions;

	public State() {
		_transactions = new HashSet<Transaction>();
	}

	public Set<Transaction> get_transactions() {
		return _transactions;
	}
}
