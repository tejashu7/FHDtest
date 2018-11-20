package subPackage;

/*
 * Example of "break" for while loop and for loop
 */

public class Martingale {
	
	public static boolean play() {
		double a = Math.random();
		a = a*10+1;
		int i = (int) a;
			if(i%2 == 0) {
				//System.out.println("1."+i);
				return true;
			}
			else {
				//System.out.println("1."+i);
				return false;
			}			
	}
	
	public static int martingale() {
		int money = 1000;
		int target = 12000;
		int bet = 10;
		int count = 0;
		
		while (money < target) {
			boolean win = play();
			
			if(win) {
				money += bet;
				bet = 10;
				count += 1;
			}
			else {
				money-=bet;
				bet*=2;
				count += 1;
			}
			
			if (money >= target){
				System.out.println("You win with "+ count);
				break;
			}
		}
		return money;
	}
	
	public static void main(String[] args) {
		System.out.println(martingale());
	}

}
