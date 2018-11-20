package unittest;

import static org.junit.Assert.*;
import org.junit.Test;
import calc.calculator;

public class testFact {
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(calculator.factorial(0)==1);	
	}
}
