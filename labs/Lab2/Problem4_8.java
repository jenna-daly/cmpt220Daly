/**
 * file: Problem4_8.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem4_8 abstract data type.
 */

/**
 * Problem4_8
 * 
 * This class implements a program that takes an ASCII 
 * integer and returns it as a value.
 */

import java.util.Scanner;

public class Problem4_8 {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);

    //user input
  	System.out.print("Enter an ASCII code: ");
    int a = input.nextInt();

    //character for code
  	System.out.println((char)a);
  }
}