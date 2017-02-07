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
    
    String result = "0";
    //String resultString;

    //Check guess
    if(guess == lottery){
    		result = "1";
    	}
    else if(guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 
        && guessDigit3 == lotteryDigit1 || guessDigit1 == lotteryDigit2 
        && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3 
        || guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 
        && guessDigit3 == lotteryDigit2 || guessDigit1 == lotteryDigit2 
        && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1){
            result = "2";
        }
    else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 
        || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 
        || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit3
        || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
        || guessDigit3 == lotteryDigit3){
            result = "3";
    }
    else{
            result = "4";
        }

    switch(result){
        case "1": result = "Exact match! You win $10,000";
                break;
        case "2": result = "Match all digits: You win $3,000";
                break;
        case "3": result = "Match one digit: You win $1,000!";
                break;
        case "4": result = "Sorry, no match!";
                break;
      }
    System.out.println(result);
  }
}


