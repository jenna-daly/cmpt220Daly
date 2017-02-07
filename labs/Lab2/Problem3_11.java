/**
 * file: Problem3_11.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem3_11 abstract data type.
 */

/**
 * Problem3_11
 * 
 * This class implements a prompt for a month and year,
 * in which the number of days in said month and year is
 * returned.
 */

import java.util.Scanner;

public class Problem3_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a month (as a number) and year (M YYYY): ");
    int month = input.nextInt();
    int year = input.nextInt();

    switch (month) {
      case 1: System.out.println("January " + year + " had 31 days");
              break;
      case 2: // used boolean to evaluate if February was a leap year
      	      boolean days = (year%4 == 0 && year%100 !=0) || (year%400 == 0);
      		    System.out.println("February " + year + " had 28 days: " + days);
              break;
      case 3: System.out.println("March " + year + " had 31 days");
              break;
      case 4: System.out.println("April " + year + " had 30 days");
              break;
      case 5: System.out.println("May " + year + " had 31 days");
              break;
      case 6: System.out.println("June " + year + " had 30 days");
              break;
      case 7: System.out.println("July " + year + " had 31 days");
              break;
      case 8: System.out.println("August " + year + " had 31 days");
              break;
      case 9: System.out.println("September " + year + " had 30 days");
              break;
      case 10: System.out.println("October " + year + " had 31 days");
              break;
      case 11: System.out.println("November " + year + " had 30 days");
              break;
      case 12: System.out.println("December " + year + " had 31 days");
              break;
    }
  }
}
