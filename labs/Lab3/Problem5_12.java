/**
 * file: Problem5_12.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem5_12 abstract data type.
 */

/**
 * Problem5_12
 * 
 * This class implements the calculation of the smallest n so that n squared
 * is greater than 12,000. 
 */

import java.util.Scanner;

public class Problem5_12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = 0;
    //while loop to find value of n
    while(n*n < 12000) {
    	n++;
    }

    System.out.println("The smallest n such that n^2 >12,000 is " + n);
  }
}
