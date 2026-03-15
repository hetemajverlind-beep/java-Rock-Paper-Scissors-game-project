import java.util.Scanner;
import java.util.Random;
public class Game{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	String myChoise; 
	String computerChoise;
	String playAgain = "yes";
	String[] choise = {"rock","paper","scissors"};
	
	System.out.println("**************************");
	System.out.println("ROCK-PAPER-SCISSORS GAME ");
	System.out.println("**************************");
	
	do{
	System.out.print("What is your choise (rock,paper,scissors) : ");
	myChoise = scan.next().toLowerCase();
	
	computerChoise = choise[random.nextInt(3)];
	System.out.println("computer choise is : "+computerChoise);
	
	if((!myChoise.equals(choise[0]) && !myChoise.equals(choise[1])) && !myChoise.equals(choise[2])){
		System.out.println("Invalide choise!!!!");
	}
	else{
		if(myChoise.equals(computerChoise)){
			System.out.println("It's a tie!");
		}
		else if((myChoise.equals(choise[0]) && computerChoise.equals(choise[2])) ||
				(myChoise.equals(choise[1]) && computerChoise.equals(choise[0])) ||
				(myChoise.equals(choise[2]) && computerChoise.equals(choise[1])) )
				{
				System.out.println("YOU WIN!!");	
				}
		else{
			System.out.println("YOU LOSE!!");
		}
		
		
		
	}
	
	System.out.print("DO YOU WHANT TO PLAY AGAIN (yes/no): ");
	playAgain = scan.next().toLowerCase();
	}
	while(playAgain.equals("yes"));
	
	
	System.out.println("Thanks for playing! Have a nice day!! ");
	
	
	
	}



}