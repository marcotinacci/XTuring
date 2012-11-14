package it.marcotinacci.turingmachine.generator.staticstructure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TapeTest {

	private Tape _tape;
	
	@Before
	public void setUp() throws Exception {
		_tape = new Tape();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		_tape.writeAll("111+1111");
		System.out.println(_tape.read());
	}
	
	
}
