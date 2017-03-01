/**
 * file: Problem6_20.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem6_20 abstract data type.
 */

/**
 * Problem6_20
 * 
 * This class implements a prompt for a string and then the program outputs
 * the number of characters in the string.
 */

import java.util.Scanner;

public class Problem6_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //prompt user
    System.out.print("Enter a string to get the number of letters: ");
    String s = input.nextLine();

    //prints answer from countLetters method
    System.out.println("The length of the string is " + countLetters(s));
  }

  public static int countLetters(String s){
    int count = 0;
    //for loop counts # of letters
    for(int letters = 0; letters < s.length(); letters++) {
      count++;
    }
  //return final count to main method
  return count;
  }
}