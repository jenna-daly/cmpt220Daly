/**
 * file: Problem5_13.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem5_13 abstract data type.
 */

/**
 * Problem5_13
 * 
 * This class implements the finding of the largest n such that
 * n cubed is less than 12,000.
 */

import java.util.Scanner;

public class Problem5_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = 0;
    //while loop to find largest n value
    while(Math.pow(n, 3) < 12000) {
    	n++;
    }
    
    System.out.println("The largest n such that n cubed is less than 12,000 is " + (n - 1));
  }
}