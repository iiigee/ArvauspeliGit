import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int counter = 0;
		String hint = "yellow fruit";
		String rightAns = "Banana";
		String answer = "";
		String ready = "";
		String playerName = "";
		Boolean play = true;
		
		System.out.println("Hello and welcome to the game!\nPlease write your player name:");
		playerName = in.nextLine();
		System.out.println("Hello " + playerName + "Are you ready to play the game?");
		ready = in.nextLine();
		
			if(ready.equals("yes")) {
				
				System.out.println("Allright here we go. What is a " + hint);
				
				do {
					System.out.println(counter + ". try.");
					answer = in.nextLine();
					
					
				}while(play = true);
				
			}
		
		
		
		
		
	}

}
