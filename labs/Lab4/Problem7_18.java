/**
 * file: Problem7_18.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem7_18 abstract data type.
 */

/**
 * Problem7_18
 * 
 * This class bubble sorts the user's input of 10 numbers.
 */

import java.util.Scanner;

public class Problem7_18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter ten numbers: ");
    double [] user = new double[10];
      //creates for loop to store user input in array
    for(int i = 0; i < user.length; i++) {
      user[i] = input.nextDouble();
    }

    bubbleSorting(user);
    for (double e: user) {
      System.out.print(e + " ");
    }
    //System.out.print(bubbleSorting(user)); didn't work so changed to for loop
  }

  public static void bubbleSorting(double[] bubble) {
    double temporary;
    boolean test = true;

    while(test){
      test=false;
      for (int i=0; i<bubble.length-1; i++) {
        if(bubble[i]>bubble[i+1]) {
          temporary = bubble[i];
          bubble[i]=bubble[i+1];
          bubble[i+1]=temporary;
          test=true;
        }
      }
    }
  }
}
