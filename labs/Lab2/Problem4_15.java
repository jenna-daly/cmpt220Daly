/**
 * file: Problem4_15.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem4_15 abstract data type.
 */

/**
 * Problem4_15
 * 
 * This class implements a program that gives you the
 * number a given letter corresponds to on phone buttons.
 */

import java.util.Scanner;

public class Problem4_15 {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);

  	System.out.print("Enter a letter: ");
  	String s1 = input.nextLine();
    char c1 = s1.charAt(0);
    c1 = Character.toUpperCase(c1);

    switch (c1) {
    	case 'A': 
    	case 'B':
    	case 'C': System.out.println("The corresponding number is 2");
    	  		  break;
    	case 'D':
    	case 'E':
    	case 'F': System.out.println("The corresponding number is 3");
    	          break;
    	case 'G':
    	case 'H':
    	case 'I': System.out.println("The corresponding number is 4");
    	          break;
    	case 'J':
    	case 'K':
    	case 'L': System.out.println("The corresponding number is 5");
    	          break;
    	case 'M':
    	case 'N':
    	case 'O': System.out.println("The corresponding number is 6");
    	          break;
    	case 'P':
    	case 'Q':
    	case 'R':
    	case 'S': System.out.println("The corresponding number is 7");
    	          break;
    	case 'T':
    	case 'U':
    	case 'V': System.out.println("The corresponding number is 8");
    	          break;
    	case 'W':
    	case 'X':
    	case 'Y':
    	case 'Z': System.out.println("The corresponding number is 9");
    	          break;
    }
  }
}