package unittest;

import static org.junit.Assert.*;
import org.junit.Test;
import calc.calculator;

public class testDiv {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		try{
			assertEquals(5, calculator.div(5, 1));
		}catch(ArithmeticException e){
			
		}
	}

}
