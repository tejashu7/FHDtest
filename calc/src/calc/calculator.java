package calc;

public class calculator {
	public static int mul( int a, int b) {
		return a*b;
	}

	public static int factorial(int a) {
		if (a==0) return 1;
		else {
			int res = 1; 
			for (int i = 1; i<=a; i++) {
				res = a*i;
			}
		return res;
		}
	}
	public static float div( int a, int b) {
		int c=0;
		try {
			 b = 0;
	         c = a/b;
	         System.out.println(c);
			
		} catch (ArithmeticException ae) {
			System.out.println(" ArithmeticException occured!");
		}
		return (float) c;
	}
	public static void main (String args[]) {
		
		
	}

}
