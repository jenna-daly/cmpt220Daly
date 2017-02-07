/**
 * file: Problem3_15.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem3_15 abstract data type.
 */

/**
 * Problem3_4
 * 
 * This class implements a program that generates a random lottery
 * number and tells the user if their guess has won any amount of money. 
 */

import java.util.Scanner;

public class Problem3_15 {
  public static void main(String[] args) {
    //test commenting out work: int lottery = (int)(Math.random()*100);
    //int max = 999;
    //int min = 100;

    //int lottery = random.nextInt(max - min + 1) + min;
    int lottery = 100 + (int)(Math.random() * 900);

    //Prompt user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();

    //Get digits from lotto
    int lotteryDigit1 = lottery/100;
    int testDigit = lottery%100;
    int lotteryDigit2 = testDigit/10;
    int lotteryDigit3 = testDigit%10;
    
    //Get digits from user
    int guessDigit1 = guess/100;
    int guessTest = guess%100;
    int guessDigit2 = guessTest/10;
    int guessDigit3 = guessTest%10;

    System.out.println("The lottery number is: " + lottery);

    //Check guess
    switch (guess) {
    	case 1: if(guess == lottery){
    		System.out.println("Exact match! You win $10,000");
    	}
    	case 2: if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2
            && guessDigit3 == lotteryDigit3){
            System.out.println("Match all digits: You win $3,000");
        }
        case 3: if(guess != lottery){
            System.out.println("Sorry, no match!");
        }
    }
  }
}


