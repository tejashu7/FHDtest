package calc;

public class calculator{
	public static int mult(int a, int b){
		return a*b;
	}

	public static float div(int a, int b){
		return a/b;
	}

	public static int factorial(int a) {
		if(a==0) { 
			return 1;
		}
		else {
			int fact=a;
			
			for(int i=1; i<a; i++) {
				fact*=i;
			}
			return fact;
		}
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
	}
}