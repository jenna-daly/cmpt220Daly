/**
 * file: Problem8_13.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 5
 * due date: March 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem8_13 abstract data type.
 */

/**
 * Problem8_13
 * 
 * This class implements a prompt for the user to enter the size of the array, 
 * then the array, and returns the location of the largest number.
 */

import java.util.Scanner;

public class Problem8_13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    //matrix = new int[row][column];
    double[][] array1 = new double[row][column];

    System.out.println("Enter the array: ");
      //assigns array value
      for(int i=0; i< array1.length; i++) {
        for(int j=0; j<array1[i].length; j++) {
        array1[i][j] = input.nextInt();
      }
    }
    //takes largest number from other method and prints it out 
    //print ln didn't make new line though :O
    int[] location = locateLargest(array1);
    System.out.println("The location of the largest number is at: " + location[0] 
    + ", " + location[1] + "  .");
}

  public static int[] locateLargest(double[][] a) {
    double max = 0;
    int[] arr = new int[2];
    arr[0] = 0;
    arr[1] = 0;
      for(int i=0; i<a.length; i++){
        for(int j=0; j<a[i].length; j++) {
          if(max<a[i][j]) {
            arr[0] = i;
            arr[1] = j;
            max = a[i][j];
      	  }
        }
      }
    return arr;
    }
  }