/**
 * file: Problem7_20.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 5
 * due date: March 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem7_20 abstract data type.
 */

/**
 * Problem7_20
 * 
 * This class implements a prompt for the user to enter 10 numbers
 * and then finds the max and swaps it with the last number repeatedly until
 * one element remains.
 */

import java.util.Scanner;

public class Problem7_20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter 10 numbers: ");
    //create array of 10 entered doubles
    double [] list = new double[10];
    //loop to store user numbers
    for(int i = 0; i < list.length; i++) {
      list[i] = input.nextDouble();
    }
    //invokes method and prints out sorted numbers
    selectionSort(list);
    for (double e: list) {
      System.out.print(e + " ");
    }
  }

  public static void selectionSort(double[] list) {
    for(int i=list.length - 1; i > 0; i--) {
      double currentMax = list[i];
      int currentMaxIndex = i;

      for(int j=i - 1; j>=0; j--) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }
      //swap if necessary
      if(currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  }
}