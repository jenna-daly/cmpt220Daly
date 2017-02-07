/**
 * file: Problem4_26.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem4_26 abstract data type.
 */

/**
 * Problem4_26
 * 
 * This class implements a program that returns an amount
 * given its smaller incremental components. 
 */

import java.util.Scanner;

public class Problem4_26 {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);

  	System.out.print(
  		"Enter an amount in double, for example 11.56: ");
  	String amount = input.nextLine();

    //find number of one dollars
    String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));
  	//int numberOfOneDollars = remainingAmount / 100;
  	//remainingAmount = remainingAmount % 100;

    int coins = Integer.parseInt(amount.substring(3));
     
    //find number of quarters in remaining amount
  	int numberofQuarters = coins / 25;
  	coins = coins % 25;

  	//find number of dimes in remaining amount
  	int numberOfDimes = coins / 10;
  	coins = coins % 10;

  	//find number of nickels in remaining amount
  	int numberOfNickels = coins / 5;
  	coins = coins % 5;

  	//find number of pennies in remaining amount
  	int numberOfPennies = coins;

  	//results
  	System.out.println("Your amount " + amount + " consists of");
  	System.out.println("  " + numberOfOneDollars + " dollars");
  	System.out.println("  " + numberofQuarters + " quarters");
  	System.out.println("  " + numberOfDimes + " dimes");
  	System.out.println("  " + numberOfNickels + " nickels");
  	System.out.println("  " + numberOfPennies + " pennies");

  }
}