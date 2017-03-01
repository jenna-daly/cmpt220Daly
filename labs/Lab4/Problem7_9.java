/**
 * file: Problem7_9.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem7_9 abstract data type.
 */

/**
 * Problem7_9
 * 
 * This class implements a prompt for the user to enter 10 numbers
 * and is returned the min value.
 */

import java.util.Scanner;

public class Problem7_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter ten numbers: ");
    //create array of 10
    double [] ten = new double[10];
    //creates for loop to store user input in array
    for(int i = 0; i < 10; i++) {
      ten[i] = input.nextDouble();
    }
    //prints min
    System.out.println("The minimum number is: " + min(ten));
  }

  public static double min(double[] array) {
    double min = array[0];
    //for loop to check for min
    for(double i = array[0]; i < array.length; i++) {
      if(i < min){
        min = i;
      }
    }
  return min;
  }
}