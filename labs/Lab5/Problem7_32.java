/**
 * file: Problem7_32.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 5
 * due date: March 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem7_32 abstract data type.
 */

/**
 * Problem7_32
 * 
 * This class implements a prompt for the user to enter the number of list
 * items, then the list, and partitions the list using the first number or pivot.
 */

import java.util.Scanner;

public class Problem7_32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //gather list from user input into array of size n-- the first digit entered
    System.out.print("Enter a list: ");
    int n = input.nextInt();
    int[] list = new int[n];
    //for loop creates array
    for(int i=0; i<n; i++) {
      list[i] = input.nextInt();
    }
    //invoke method and print out answer
    partition(list);
    for (double e: list) {
    System.out.print(e + " ");
  }
}

  public static int partition(int[] list) {
    int i = 0;
      //arrange array given pivot
      for(int j =1; j< list.length; j++) {
        if(list[j]<list[i]) {
        int temp = list[j];
        System.arraycopy(list, i, list, i + 1, j - i);
        list[i] = temp;
        i++;
      }
    }
  return i;
  }
}