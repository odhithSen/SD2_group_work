// Task 2

import java.util.Scanner;
import java.util.ArrayList;

public class PlayerSelection
{
	public static void main(String[] args)
	{
		ArrayList <Player> toyList = new ArrayList<Player>();
		String menuOption, playerName, playerAge, playerType;
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
				
			}
			else if (menuOption.equals("B"))// Display to best batsmen
			{
				
			}
			else if (menuOption.equals("C"))// Display to best bowlers
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
