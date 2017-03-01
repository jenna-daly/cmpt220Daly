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
      int [] bubble = new int[10];
      //creates for loop to store user input in array
      for(int i = 0; i < bubble.length; i++) {
        bubble[i] = input.nextInt();
      }
      bubbleSorting(bubble);
    System.out.println("");
  }

public static void bubbleSorting(int[] bubble) {
  int temp = 0;
  boolean test=true;
    do{
      test=false;
      for(int i=0; i<bubble.length; i++){
      if(bubble[i]>bubble[i+1]){
      temp = bubble[i];
      bubble[i]=bubble[i+1];
      bubble[i+1]=temp;
      test=true;
      }	
    }
   }
  }
}


