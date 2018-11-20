package unittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calc.calculator;

public class TestMult {
	
	
	//@After, @Before, @BeforeClass, @AfterClass 
	
	public int[] a;
	
	@BeforeClass
	public static void oneExec()
	{
		System.out.println("Executed before");
	}
	
	@Before
	public void execBefore()
	{
		a = new int [200];
		for (int i = 0; i < 200; i++) a[i] = i*i;
	}
	
	@After
	public void execcAfter()
	{
		a = null;
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(25, calculator.mult(5, 5));
		
		for (int i = 0; i<200; i++) assertEquals(a[i], calculator.mult(i, i));
	}

}
