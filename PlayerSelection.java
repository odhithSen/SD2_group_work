// Task 2

import java.util.Scanner;
import java.util.ArrayList;

public class PlayerSelection
{
	public static void main(String[] args)
	{
		ArrayList <Player> playerList = new ArrayList<Player>();
		String menuOption, playerName, playerType;
		int playerAge;
		int[] playerStats = new int[15];
		double bowlingAverage, battingAverage;
		
		System.out.println("");
		System.out.println("Player Selection");
		System.out.println("");
		
		while (true)
		{
			System.out.println("");
			
			System.out.print("Enter 'A' to add a player");
			System.out.print("Enter 'B' to display the best batsman");
			System.out.print("Enter 'C' to display the best blower");
			System.out.print("Enter 'D' to display the best keeper");
			System.out.print("Enter 'E' to Exit");


			
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
				
				for (int i = 0; i < playerStats.length; i++)
				{
					System.out.print("Enter new player type: ");
					playerStats[i] = UserInput.next();
				}
				
				Player newPlayer = new Player(playerName, playerAge, playerType, playerStats);
				playerList.add(newPlayer);
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
