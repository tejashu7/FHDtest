package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import calc.calculator;

public class testDiv {

	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		ArrayList emptyList = new ArrayList();
	    Object o = emptyList.get(0);
	}

}
