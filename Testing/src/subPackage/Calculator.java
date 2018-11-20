package subPackage;

public class Calculator {
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static double div(double a, double b) {
		double num = a;
		double den = b;
		double res = 0;
		try {
			res = num/den;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	
	public static int fact(int a) {
		int b = 1;
		for (int i = 1; i <=a; i++) {
			b = b*i;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println(div(4, 0));
	}
}
