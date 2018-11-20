package calc;

public class calculator {

	public static int mult(int val1, int val2) {
		return val1 * val2;
	}

	public static float div(int val1, int val2) {
		return (float) (val1 / val2);
	}
	
	//New Change
	public static long fact(int val)
	{
		long temp = 1;
		
		for (int i = val; i > 0; i--)
		{
			temp *= val * (val - 1);
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
	}

}
