/**
 * file: Driver_prj1.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 5
 * due date: March 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Driver_prj1 abstract data type.
 */

/**
 * Driver_prj1
 * 
 * This class implements a program to take in 2 arrays and convolve them.
 */

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // write your code here
    //test w manual entry
    System.out.print("Enter number in array x2, array x2");
    //use first two numbers as array size
    int el1 = input.nextInt();
    int el2 = input.nextInt();
    //create arrays
    double [] vFirst = new double[el1];
      for(int i = 0; i < vFirst.length; i++) {
        vFirst[i] = input.nextDouble();
      }
    double [] vSecond = new double[el2];
      for(int i = 0; i < vSecond.length; i++) {
        vSecond[i] = input.nextDouble();
      }
    double [] finalOutput = convolveVectors(vFirst, vSecond);
    //print out solution with correct rounding
    for(int x=0; x<finalOutput.length-1; x++) {
      System.out.printf("%d ", new Object[] {Long.valueOf(Math.round(finalOutput[x]))});
    }
      System.out.printf("%d ", new Object[] {Long.valueOf(Math.round(finalOutput[(finalOutput.length - 1)]))});
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here
    //for loop for convolution
    for(int i=0; i < vResult.length; i++) {
      vResult[i] = 0.0D;
      for(int j=0; j<vSecond.length; j++) {
        if((i-j>=0) && (i-j < vFirst.length)) {
          vResult[i] = vResult[i] + vFirst[(i-j)] * vSecond[j];
        }
      }
    }
    return vResult;  
  }
}