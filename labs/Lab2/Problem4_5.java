/**
 * file: Problem4_5.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem4_5 abstract data type.
 */

/**
 * Problem4_5
 * 
 * This class implements a program that computes the area
 * of a polygon given the number of sides and length.
 */

import java.util.Scanner;

public class Problem4_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //prompts input
    System.out.print("Enter the number of sides: ");
    int numSides = input.nextInt();
    System.out.print("Enter the side: ");
    double sideLength = input.nextDouble();

    //calculates area
    double partOne = numSides*(sideLength*sideLength);
    double partTwo = 4 * Math.tan(Math.PI/numSides);
    double area = partOne/partTwo;

    System.out.println("The area of the polygon is " +area);
  }
}