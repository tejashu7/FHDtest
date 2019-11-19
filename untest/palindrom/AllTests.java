package palindrom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ palindromTest.class, PalindromTest1Test.class })

public class AllTests {

	@Test
	public void testIsPal1() {

		palindrom test = new palindrom();
		assertTrue(test.isPal(1221));
		for (int i = 0; i < 100; i++)
			assertTrue(test.isPal(i));
	}

}
