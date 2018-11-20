package subPackage;

/*
 * Example of using String
 */

import java.util.Scanner;

public class Character {
	
	//Create string of info
	private static String [] USA = {"Ash", "Thermite", "Pulse", "Castle"};
	private static String [] UK = {"Thatcher", "Sledge", "Smoke", "Mute"};
	private static String [] FRA = {"Montagne", "Twitch", "Rook", "Doc"};
	private static String [] GER = {"Blitz", "IQ", "Bandit", "Jaeger"};
	private static String [] RUS = {"Fuze", "Glaz", "Kapkan", "Tachanka"};
	
	//Initialize
	private static int [][] Option = new int[][]{
		{1, 2, 3},
		{4, 5, 6}
	};
	
	public static String[] character(String country) {
		String player[] = null;
		
		switch (country) {
			case "USA":player = USA;
				break;
			case "UK" : player = UK;
				break;
			case "FRA" : player = FRA;
				break;
			case "GER" : player = GER;
				break;
			case "RUS" : player = RUS;
				break;
			default: break;
		}
		//return the chosen string
		return player;
	}
	public static void main(String[] args) {
		System.out.print("Enter the Op's country: ");
		Scanner input = new Scanner(System.in);
		String chosen = input.nextLine();
		
		//print the info of the chosen string
		for(int i = 0; i < character(chosen).length; i++) {
			System.out.println(character(chosen)[i]);
		}
		
		//Print 2D Array info
		System.out.println(Option[0][2]);
	}
}
