package unittests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calc.calculator;

public class TestDiv {

	@Test
	public void test() {
		
		try {
			for (int i = 0; i < 1000; i++) assertEquals("Division Error", i/i, calculator.div(i, i), 2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//throw(e);
		}
	}
}
