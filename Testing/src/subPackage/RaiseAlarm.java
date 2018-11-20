package subPackage;

/*
 * Example of while loop and for loop
 */

public class RaiseAlarm {
	public static void raiseAlarm(int numOfWarnings) {
		
		int count = 0;
		while (count < numOfWarnings) {
			count = count + 1;
			System.out.println(count +".Warning");
		}
	}
	
	public static void raiseAlarm2 (int numOfWarnings2) {
		
		int i;
		for (i = 1; i <= numOfWarnings2; i++) {
			System.out.println(i+".Warning2");
		}
	}
	
	public static void main(String[] args) {
		raiseAlarm(2);
		raiseAlarm2(2);
	}
}
