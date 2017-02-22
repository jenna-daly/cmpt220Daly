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

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x1 = input.nextDouble();
    //forms a loop that calculates p norm and stops if 0 is entered
    while(x1 != 0){
    //assign computer input coordinates and p value to variables
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double p = input.nextDouble();
    //print out p norm
    System.out.printf("%.10f", Math.pow(Math.pow(Math.abs(x1-x2), p) + Math.pow(Math.abs(y1-y2), p), 1/p));
    System.out.println("");
    //starts new x1
    x1 = input.nextDouble();
    }
    return;
  }
}