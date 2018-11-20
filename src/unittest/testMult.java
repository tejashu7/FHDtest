package unittest;

import static org.junit.Assert.*;
import org.junit.Test;
import calc.calculator;

public class testMult {
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(25, calculator.mult(5, 5));
		for(int i=0; i<100; i++) {
			assertEquals(i*i, calculator.mult(i, i));
		}
	}
}
