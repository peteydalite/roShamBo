import java.util.Random;
import java.util.Scanner;

//Command line rock paper scissor application
//  rock > scissor, scisser > paper, paper > rock
public class RoShamBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initial prompt for user
		
		System.out.println("Ro Sham Bo! The game of rock, paper, scissor. Can you beat the computer?");
		System.out.println("Best 3 out of 5 wins!");
		System.out.println("");
		System.out.println("For your choice please enter in the following icons...");
		System.out.println("Rock: ()    Paper: []    Scissor: 8<");
		System.out.println("");
		System.out.println("");
		
		int userWins = 0;
		int compWins = 0;
		
		
		
		//Prompt for user input and save it
		String userInput = "";
		Scanner scanner = new Scanner(System.in);
		Boolean noWinners = true;
		
		
		while(noWinners) {
			
				
			System.out.print("Enter your choice: ");
			userInput = scanner.nextLine();
			
			
			/*
			 * 0 = rock
			 * 1 = paper
			 * 2 = scisser
			 * 
			 */
			
			//Convert user choice to numbers for easier evaluation
			int intUser = 0;
			if(userInput.equals("[]")){
				intUser = 1;
			}else if(userInput.equals("8<")) {
				intUser = 2;
			}
			
			
			//Generate comp choice
			Random randNum = new Random();
			int upperBound = 2;
			int compChoice = randNum.nextInt(upperBound);
			String compChoiceIcon = "";
			
			
			
			
			if(compChoice == 0) {
				compChoiceIcon = "()";
			}else if(compChoice == 1) {
				compChoiceIcon = "[]";
			}else
				compChoiceIcon = "8<";
			
	
			System.out.println("Ro..");
			System.out.println("Sham...");
			System.out.println("BO!");
			System.out.println("Your Choice: " + userInput + "      Comp Choice: " + compChoiceIcon);
			System.out.println("");
			
			//Evaluate winner
			if(intUser == compChoice) {
				System.out.println("Deadlock!");
			
			}else if(intUser == 0 && compChoice == 3) {
				userWins += 1;
			}else if(intUser == 1 && compChoice == 0) {
				userWins += 1;
			}else if(intUser == 2 && compChoice == 1) {
				userWins += 1;
			}else {
				compWins += 1;
			}
				
			//Display score
			System.out.println("");
			System.out.println("SCORE");
			System.out.println("User: " + userWins + "    Computer: " + compWins);
			
			
			//Display if we have a winner and exit while loop
			if(userWins == 3) {
				System.out.println("You Win!");
				noWinners = false;
			}else if(compWins == 3) {
				System.out.println("You Lose!");
				noWinners = false;
			}
		}
	}

}
