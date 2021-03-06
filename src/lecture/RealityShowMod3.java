package lecture;

import java.io.BufferedInputStream; 	// need this to get user input
import java.util.Scanner;			// this, too

/**
 * Anne Bracy & 131 students
 * Running lecture examples for CSE 131, Spring 2012  
 */

/**
 * This is a program that simulates the elimination rounds of two 
 * reality television shows: Survivor and Dancing with the Stars.
 * We assume there are two players: Andrea and Hank. 
 * One will be eliminated according to the rules of the respective
 * shows.
 */
public class RealityShowMod3 {

	// start the class with your constants
	static final int NUM_VOTES_REQD = 4;
	static final int NUM_JUDGES = 3;
	static final int INVALID_CHOICE = -1;
	
	// here are private instance variables
	private static RealityContestantMod3 player1, player2;
	
	// the scanner is a utility we will use to get input from the user.
	// it's okay if you don't understand this part just yet
	private static Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
	
	
	/* main()
	 * asks the user what they want to watch.
	 * calls the method for that show
	 */
	public static void main(String[] args) {
		int choice = INVALID_CHOICE;

		player1 = new RealityContestantMod3("Andrea");
		player2 = new RealityContestantMod3("Hank");
		
		while (choice == INVALID_CHOICE) {
			System.out.println("Welcome to the Reality Show Channel");
			System.out.println("what show do you want to watch?");
			System.out.println("1: Survivor, 2: Dancing with the Stars");
			choice = scanner.nextInt(); // get 1,2,etc. from the user
			scanner.nextLine(); // ignore the "Return" button
		
			switch(choice) {
			case 1:	watchSurvivor();
			    	break;
			case 2: watchDWTS();
					break;
			default: System.out.println("Sorry, that's not a valid option");
					choice = INVALID_CHOICE;
			}		
		}
	}	

	/* assumes there are 7 tribe members total.
	 * simulates a random drawing of 2 names, the first
	 * one to 4 votes is kicked out.
	 */
	public static void watchSurvivor() {
		
		System.out.println("One player will be eliminated.");
		
		while ((player1.getScore() < NUM_VOTES_REQD) && 
				(player2.getScore() < NUM_VOTES_REQD)) {
			System.out.println("Press enter to see next vote");
			scanner.nextLine();
			
			if (Math.random() < 0.5) { // 50/50 chances to vote either way
				player1.incrementScore();
				System.out.print(player1.getName()+". ");
			} else {
				player2.incrementScore();
				System.out.print(player2.getName()+". ");
			}
			System.out.println(player1.getScore()+" votes "+player1.getName()+", "+player2.getScore()+" votes "+player2.getName()+".");
		}
		
		System.out.println("I'm sorry. The tribe has spoken.");
	}
	
	/*
	 * Insert Comment
	 */
	public static void setTotalScore(RealityContestantMod3 player) {
		
		System.out.println(player.getName()+" you're up!");
		for (int i = 1; i <= NUM_JUDGES; i++) {
			System.out.println("Press enter to see judges score");
			scanner.nextLine();
			int score = (int)(10*Math.random())+1; // convert random double into an int from 1-10
			System.out.println(player.getName()+" gets a "+score);
			player.incrementScore(score);
		}
		System.out.println(player.getName()+" receives a total score of "+player.getScore());
	}
	
	/* collects the votes for each player (from 3 judges), 
	 * then announces the winner
	 */
	public static void watchDWTS() {
		
		System.out.println("One dancer will be eliminated.");

		setTotalScore(player1);
		setTotalScore(player2);

		if (player1.getScore()< player2.getScore())
			System.out.print(player1.getName());
		else
			System.out.print(player2.getName());
		System.out.println(", you have been eliminated from Dancing with the Stars.");
		
	}
	
}
