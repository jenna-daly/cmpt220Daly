/**
 * file: Problem5_7.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem5_7 abstract data type.
 */

/**
 * Problem5_7
 * 
 * This class implements the calculation of tuition given information at 10
 * years and at 4 years past the 10 year mark. 
 */

import java.util.Scanner;

public class Problem5_7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double tuition = 10000;
   
    for (int year = 1; year <= 14; year ++) {
      tuition = tuition * 1.05;

      if(year == 10){
        System.out.printf("The tuition at year 10 is: $%4.2f", tuition);
        System.out.println(" ");
      }

    }
    
    System.out.printf("Tuition will be $%4.2f four years after the tenth year.", tuition);
	System.out.println(" ");
  }
}