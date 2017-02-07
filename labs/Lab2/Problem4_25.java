/**
 * file: Problem4_25.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem4_25 abstract data type.
 */

/**
 * Problem4_25
 * 
 * This class implements a program that generates
 * a lisence plate with random letters and numbers. 
 */

import java.util.Random;

public class Problem4_25 {
  public static void main(String[] args) {

  	//Generate random letters
  	char randLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));
  	char randLetter2 = (char) ('a' + Math.random() * ('z'-'a' + 1));
  	char randLetter3 = (char) ('a' + Math.random() * ('z'-'a' + 1));

  	//Generate random numbers
  	int number1 = (int)(Math.random()*10);
  	int number2 = (int)(Math.random()*10);
  	int number3 = (int)(Math.random()*10);
  	int number4 = (int)(Math.random()*10);

  	//Output random combo
  	System.out.println("The random lisence plate arrangement is: " + randLetter 
  		+ randLetter2 + randLetter3 + number1 + number2+ number3 + number4);
  }
 }