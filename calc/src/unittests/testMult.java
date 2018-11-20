package unittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calc.calculator;

public class testMult {
	
	public int[] a;

	@BeforeClass
	public static void onceExec() {
		System.out.println("Execute Before");
		
	}
	// this is done before test
	@Before
	public void execBefore() {
		a = new int [200];
		for (int i= 0 ; i < 200; i++) a[i] = i*i;
	}
	//this is done after test
	@After
	public void execAfter() {
		 a = null;
	}
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals(25, calculator.mul(5, 5));
		for (int i = 0 ; i<100;i++) {
			assertEquals(i*i, calculator.mul(i, i));
		}
	}

}
