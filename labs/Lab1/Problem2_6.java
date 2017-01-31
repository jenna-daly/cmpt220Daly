/**
 * file: Problem2_6.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem2_6 abstract data type.
 */

/**
 * Problem2_6
 * 
 * This class implements a prompt for the user to enter a number and then
 * returns the sum of the indiviudal numbers in the user's input. 
 */

import java.util.Scanner;

public class Problem2_6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int enteredNumber = input.nextInt();

    int firstNumber = enteredNumber%10;
    int secondNumber = enteredNumber/10;
    int thirdNumber = secondNumber%10;
    int fourthNumber = secondNumber/10;
    //calculation doesn't include secondNumber calculation, but uses 
    //secondNumber in following calculations
    int sumTotal = firstNumber + thirdNumber + fourthNumber;

    System.out.println("The sum of the digits is " + sumTotal);
  }
}