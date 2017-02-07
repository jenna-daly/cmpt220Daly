/**
 * file: Problem3_8.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem3_8 abstract data type.
 */

/**
 * Problem3_8
 * 
 * This class implements a prompt for user to enter
 * 3 digits, which are then returned in nondecreasing order. 
 */

import java.util.Scanner;

public class Problem3_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Save three inputs from user
    System.out.print("Enter three numbers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    if (number1>number2) {
      	if(number2>number3){
    		System.out.println("The nondecreasing order is: " + number3 + number2 + number1);
    	}
    	if(number1>number3){
    		System.out.println("The nondecreasing order is: " + number2 + number3 + number1);
    	}
    	else{
    		System.out.println("The nondecreasing order is: " + number2 + number1 + number3);

    	}
    }
    else if(number2>number3){
    	if(number3>number1){
    		System.out.println("The nondecreasing order is: " + number1 + number3 + number2);
    	}
    	if(number2>number1){
    		System.out.println("The nondecreasing order is: " + number3 + number1 + number2);
        }
    	else{
    		System.out.println("The nondecreasing order is: " + number3 + number2 + number1);
    	}
    }
    else if(number3>number1){
    	if(number1>number2){
            System.out.println("The nondecreasing order is: " + number2 + number1 + number3);
    	}
    	if(number3>number2){
    		System.out.println("The nondecreasing order is: " + number1 + number2 + number3);
    	}
    	else{
            System.out.println("The nondecreasing order is: " + number1 + number3 + number2);
    	}
    }
  }
}