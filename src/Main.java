import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int counter = 1;
		String hint = "yellow fruit";
		String rightAns = "Banana";
		String answer = "";
		String ready = "";
		String playerName = "";
		Boolean play = true;
		
		System.out.println("Hello and welcome to the game!\nPlease write your player name:");
		playerName = in.nextLine();
		System.out.println("Hello " + playerName + " Are you ready to play the game?");
		ready = in.nextLine();
		
			if(ready.equals("yes")) {
				
				System.out.println("Allright here we go. What is a " + hint);
				
				while(play == true) 
				{
					System.out.println(counter + ". try.");
					answer = in.nextLine();
					
					if(answer.equals(rightAns)) 
					{
						System.out.println("CORRECT! You did it on your " + counter + ". try!");
						System.out.println("Game over");
						play = false;
					}
					
					else if(answer.equals("stop")) 
					{
						System.out.println("You did not want to continue.");
						System.out.println("Game over");
						play = false;
					}
					
					else 
					{
						System.out.println("Wrong answer, try again.");
						counter += 1;
					}
					
					
				}
				
			}
			
			else 
			{
				System.out.println("You did not want to play\nGame over!");
			}
		
		
		
	}

}
