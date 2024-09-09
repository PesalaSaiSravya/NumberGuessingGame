package game;

import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int lowerBound = 1;
		int upperBound = 100;
		int maxAttempts = 5;
		int guessingNumber = r.nextInt(upperBound - lowerBound + 1) + lowerBound;
		
		System.out.println("Welcome to the Number Guessing Game...!");
		System.out.println("Enter a number between "+lowerBound +" and "+upperBound);
		System.out.println("You have 5 attempts left");
		
		int attemptsLeft = maxAttempts;
		boolean hasWon=false;
		
		while(attemptsLeft>0) {
			System.out.println("Enter your guess: ");
			int num = sc.nextInt();
			
			if(num<lowerBound || num>upperBound) {
				System.out.println("Enter the number between "+lowerBound+" and "+ upperBound);
			}
			attemptsLeft--;
			
			if(num==guessingNumber) {
				hasWon=true;
			}
			else {
				if(num>guessingNumber) {
					System.out.println("Too high...!");
				}
				else {
					System.out.println("Too low...!");
				}
			}
		}	
		if(hasWon) {
				System.out.println("You won...!");
			}
			else {
				System.out.println("No attempts left.\nThe number is "+guessingNumber);
			}	
	}
}
