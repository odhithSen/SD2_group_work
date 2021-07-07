// Task 2

import java.util.Scanner;
import java.util.ArrayList;

public class PlayerSelection
{
	public static void main(String[] args)
	{
		ArrayList <Player> toyList = new ArrayList<Player>();
		String menuOption, playerName, playerType;
		int playerAge;
		double bowlingAverage, battingAverage;
		
		System.out.println("");
		System.out.println("Player Selection");
		System.out.println("");
		
		while (true)
		{
			System.out.println("");
			
			System.out.print("Enter menu option: ");
			menuOption = UserInput.next();
			
			System.out.println("");
			
			if (menuOption.equals("A"))// Add a player
			{
				System.out.print("Enter new player name: ");
				playerName = UserInput.next();
				
				System.out.print("Enter new player age: ");
				playerAge = UserInput.nextInt();
				
				System.out.print("Enter new player type: ");
				playerType = UserInput.next();
			}
			else if (menuOption.equals("B"))// Display two best batsmen
			{
				
			}
			else if (menuOption.equals("C"))// Display two best bowlers
			{
				
			}
			else if (menuOption.equals("D"))// Display the best keeper
			{
				
			}
			else if (menuOption.equals("E"))// Exit
			{
				
			}
			else
			{
				System.out.println("Invalid input!");
			}
			
			System.out.println("");
		}
	}
}
