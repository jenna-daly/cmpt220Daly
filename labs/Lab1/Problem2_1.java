/**
 * file: Problem2_1.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem2_1 abstract data type.
 */

/**
 * Problem2_1
 * 
 * This class implements a prompt for a temperature in Celsius that is then
 * converted to degrees farenheit using the conversion formula.
 */

import java.util.Scanner;

public class Problem2_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a temperature in Celsius: ");
    double celsius = input.nextDouble();

    double fahrenheit = (9.0 / 5) * celsius + 32;
    System.out.println("Celsius " + celsius + " degrees is " + fahrenheit 
    + " degrees in fahrenheit");
  }
}