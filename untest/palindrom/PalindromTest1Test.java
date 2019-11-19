package palindrom;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromTest1Test {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before PalindromTest.class");
	}
	@AfterClass
	
	public static void AfterClass(){
		System.out.println("After PalindromTest.class");
	}
	@Before
	public  void initTest(){
	
	}	
	@Test
	public void testIsPal() {
		
		palindrom test = new palindrom();
		for(int i=0;i<10;i++)
		assertFalse(test.isPal(i));
	}

}
