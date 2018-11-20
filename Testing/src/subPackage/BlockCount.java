package subPackage;

import java.util.Scanner;
/*
 * Example of for loop
 */

public class BlockCount {
	public static int blockCount(int number) {
		
		int total = 0;
		for(int i = 1; i <= number; i++) {
			total = total + (i*i);
		}
	
		return total;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number of layer: ");
		Scanner scan = new Scanner(System.in);
		int layer = scan.nextInt();
		System.out.println(blockCount(layer));
	}
}
