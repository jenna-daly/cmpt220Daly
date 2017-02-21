/**
 * file: Problem6_2.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem6_2 abstract data type.
 */

/**
 * Problem6_2
 * 
 * This class implements the prompting of the user to enter a number and 
 * then get returned the sum of the numbers.
 */

import java.util.Scanner;

public class Problem6_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //gather user input
    System.out.print("Enter an integer: ");
    long n = input.nextLong();

    System.out.println("The sum of the numbers in the integer is " + sumDigits(n));
  }

  public static int sumDigits(long n) {
  	int sum = 0;
  	//convert n to int for loop math
  	int n1 = (int) n;

    //loop to extract and remove digits
	while(n1 > 0){
		sum = sum + n1%10;
		n1 = n1/10;
	}
    return sum;
  }
}