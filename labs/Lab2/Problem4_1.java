/**
 * file: Problem4_1.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem4_1 abstract data type.
 */

/**
 * Problem4_1
 * 
 * This class implements generates a program that
 * computes the area of a pentagon given the user's
 * input of radius. 
 */

import java.util.Scanner;

public class Problem4_1 {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);

  	//Prompt user input
  	System.out.print("Enter the length from the center of a pentagon to a vertex: ");
  	double pentRadius = input.nextDouble();

  	//Compute side
  	double s = (2 * pentRadius) * Math.sin(Math.PI/5);

  	//Compute Area
  	double a = (5 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/5));

  	//Display Area
  	System.out.println("The area of the pentagon is " + Math.round(a*100)/100.0);
  }
}