package palindrom;

import static org.junit.Assert.*;

import org.junit.*;


public class palindromTest {

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
		assertTrue(test.isPal(121));
		for(int i=0;i<10;i++)
		assertFalse(test.isPal(i));
	}
}
