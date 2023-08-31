import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		
		
		//Koodin yläosassa on globaalit muuttujat.
		
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
		System.out.println("Hello " + playerName + " Are you ready to play the game? (write yes or no, to play bonus game type bonus)");
		ready = in.nextLine();
		
			//Arvauspelin koodi alkaa tästä.
		
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
							System.out.println("The right answer is " + rightAns + " You did not guess that on time. Game over.");
							play = false;
							
						}
					}
					
					
				}
				
			}
			
			else if(ready.equals("stop"))
			{
				System.out.println(playerName + " did not want to play\nGame over!");
			}
			
			//Tästä alkaa bonus Lucky 7 pelin koodi.
			
			
			else if(ready.equals("bonus")) 
			{
				System.out.println("Now playing bonus game. Press enter to continue");
				answer = in.nextLine();
				
				if(answer.equals("stop")) 
				{
					System.out.println(playerName + " did not want to play\nGame over!");
				}else {
					
					boolean winNum = false;
					int ranNum;
					System.out.println("Welcome to lucky number 7 bonus game");
					System.out.println("I will give you 3 numbers. If one or more of them is number 7, you win.\nPress enter to continue.");
					answer = in.nextLine();
					
					while(winNum == false)
					{
						System.out.println("Here are your numbers:");
						for(int i = 0; i < 3; i++) {
							ranNum = r.nextInt(8);
							if(ranNum == 7) 
							{
								winNum = true;
							}
							System.out.println(ranNum);
						}
						if(winNum == true) 
						{
							System.out.println("You win! Game over");
						}
						else 
						{
							System.out.println("No lucky number. Press enter to play again or type stop to stop the game.");
							answer = in.nextLine();
							if(answer.equals("stop")) {
								System.out.println("Game over");
								winNum = true;
							}
							else 
							{
								System.out.println("Playing again.");
							}
						}
					}
					
					
				}
				
			}
		
		
		
	}

}
