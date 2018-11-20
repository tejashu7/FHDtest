/**
 * 
 */

/**
 * @author Tuan Nguyen
 *
 */
public class rollDice {
	
	public static int roDi() {
		double randomNumber = Math.random();
		
		randomNumber = randomNumber * 6;
		randomNumber = randomNumber + 1;
		int randomInt = (int) randomNumber;
		return randomInt;
	}
	
	public static int keepRolling() {
		int n1 = roDi();
		int n2 = roDi();
		int n3 = roDi();
		int n4 = roDi();
		int n5 = roDi();
				
		int count = 0;
		
		while ((n1 != n2) || (n2 != n3) || (n3 != n4) || (n4 != n5) || (n5 != n1)) {	
			n1 = roDi();
			n2 = roDi();
			n3 = roDi();
			n4 = roDi();
			n5 = roDi();
			count = count + 1;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(keepRolling());
	}
}
