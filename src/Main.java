import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int counter = 1;
		String answerLetters = "";
		String hint = "yellow fruit";
		String rightAns = "Banana";
		String answer = "";
		String ready = "";
		String playerName = "";
		Boolean play = true;
		
		System.out.println("Hello and welcome to the game!\nPlease write your player name:");
		playerName = in.nextLine();
		System.out.println("Hello " + playerName + " Are you ready to play the game? (write yes or no)");
		ready = in.nextLine();
		
			if(ready.equals("yes")) {
				
				System.out.println("Allright here we go. What is a " + hint);
				
				while(play == true) 
				{
					System.out.println(counter + ". try.");
					answer = in.nextLine();
					
					if(answer.equals(rightAns)) 
					{
						System.out.println("CORRECT! Congratulations " + playerName + " You did it on your " + counter + ". try!");
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
						if(rightAns.length() >= counter) {
							System.out.println("Wrong answer, here is one letter for you.");
							answerLetters += rightAns.charAt(counter - 1);
							System.out.println(answerLetters);
							counter += 1;
							}
						else {
							System.out.println("The right answer is " + rightAns + " You did not guess that on time.");
							
						}
					}
					
					
				}
				
			}
			
			else
			{
				System.out.println(playerName + " did not want to play\nGame over!");
			}
		
		
		
	}

}
