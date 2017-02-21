/**
 * file: Problem5_1.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem5_1 abstract data type.
 */

/**
 * Problem3_4
 * 
 * This class implements the prompting of the user to enter integers and
 * the program will return the number of positives, negatives, the sum 
 * and average until the integer 0 is reached. 
 */

import java.util.Scanner;

public class Problem5_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //create integers and float
    int data;
    int positive = 0;
    int negative = 0;
    int sum = 0;
    float count = 0;
    float avg = 0;
    System.out.print("Enter an integer, the input ends if it is 0: ");

    //do while loop to read user input and perform calculations
    do {
      data = input.nextInt();

      if (data > 0)
      	positive++;
      else if (data < 0)
      	negative++;

      sum = sum + data;
      count++;
      avg = sum/(count-1);
    } while (data != 0);

    //output negatives, positives, sum, average
    System.out.println("The number of positives is: " + positive);
    System.out.println("The number of negatives is: " + negative);
    System.out.println("The sum of the integers is: " + sum);
    System.out.printf("The average of the integers is: " + avg);
    System.out.println("");
  } 
}

