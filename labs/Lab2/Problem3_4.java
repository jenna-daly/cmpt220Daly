/**
 * file: Problem3_4.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem3_4 abstract data type.
 */

/**
 * Problem3_4
 * 
 * This class implements the generation of a random number and
 * outputs the corresponding month. 
 */

import java.util.Scanner;

public class Problem3_4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Generate a random number b/w 1-12
    int number = (int)((Math.random()*12)+1);

    if(number == 1) {
  	  System.out.println("The number is " + number + ": January");
    }
    if(number == 2) {
  	  System.out.println("The number is " + number + ": February");
    }
    if(number == 3) {
  	  System.out.println("The number is " + number + ": March");
    }
    if(number == 4) {
  	  System.out.println("The number is " + number + ": April");
    }
    if(number == 5) {
  	  System.out.println("The number is " + number + ": May");
    }
    if(number == 6) {
  	  System.out.println("The number is " + number + ": June");
    }
    if(number == 7) {
  	  System.out.println("The number is " + number + ": July");
    }
    if(number == 8) {
  	  System.out.println("The number is " + number + ": August");
    }
    if(number == 9) {
  	  System.out.println("The number is " + number + ": September");
    }
    if(number == 10) {
  	  System.out.println("The number is " + number + ": October");
    }
    if(number == 11) {
  	  System.out.println("The number is " + number + ": November");
    }
    if(number == 12) {
      System.out.println("The number is " + number + ": December");
    }
  }
}