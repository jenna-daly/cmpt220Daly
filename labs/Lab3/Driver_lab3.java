/**
 * file: Driver_lab3.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Driver_lab3 abstract data type.
 */

/**
 * Driver_lab3
 * 
 * This class implements the p-norm equation.
 */

import java.util.Scanner.nextFloat();

public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float x1, x2, y1, y2, p, answer; 

      answer = (float)Math.pow(Math.pow(Math.abs(x1-x2), p) + Math.pow(Math.abs(y1-y2), p), 1/p);
      System.out.println(answer);
    
  }
}