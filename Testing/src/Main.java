
public class Main {
	
	//find smallest number
	public static int minValue(int [] number) {
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if(number[i] < min){
				min = number[i];
			}
		}
		return min;
	}
	
	//find longest name
	public static int[] maxName(String [] name) {
		
		int lengthName = name[0].length();
		int lengthString = name.length;
		
		
		for (int i = 1; i < lengthString; i++) {
			if(name[i].length() > lengthName){
				lengthName = name[i].length();
			}
		}
		int [] outputArray = {lengthName, lengthString};
		
		return outputArray;
	}
	
	public static void main(String[] args) {
		int [] num = {8,2,4,5};
		String [] inputName = {"Trang", "Tuan", "Ba", "Bon"};
		
		for(int i = 0; i < maxName(inputName).length; i++) {
			System.out.println(maxName(inputName)[i]);
		}
	}
}
