package Internship;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int attempts = 0;
        int score = 0;

        do {
            int numberToGuess = rand.nextInt(max - min + 1) + min;
            int guess;
            System.out.println("Guess a number between 1 and 100:");
            
            do {
                guess = input.nextInt();
                attempts++;
                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    score += 100 - (attempts * 10);
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            } while (guess != numberToGuess && attempts < 5);

            System.out.println("Your score: " + score +" in attempts of "+attempts);
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = input.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
            	score=0;
                break;
            }
            attempts = 0;
        } while (true);

        System.out.println("Thanks for playing!");
        input.close();
	}

}
