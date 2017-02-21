/**
 * file: Problem6_3.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem6_3 abstract data type.
 */

/**
 * Problem6_3
 * 
 * This class implements the prompting of the user to enter an integer which is
 * then reversed and determined if it is a palindrome or not.
 */

import java.util.Scanner;

public class Problem6_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    System.out.println("The reversal of the integer " + number + " is " + reverse(number));

    if(isPalindrome(number)){
      System.out.println("The integer is a palindrome");
    }
  }

  public static int reverse(int number){
  	int reverse = 0;
    while(number > 0) {
    	reverse = reverse * 10;
    	reverse = reverse + number%10;
      number = number/10;
      }
    return reverse;	
  }

  public static boolean isPalindrome(int number){
  	if(number == reverse(number)) {
      return true;
    } 
    return false;
  }
}
