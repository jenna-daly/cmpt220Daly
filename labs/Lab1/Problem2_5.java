/**
 * file: Problem2_5.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem2_5 abstract data type.
 */

/**
 * Problem1_3
 * 
 * This class implements a prompt for a bill total and gratuity rate. It then
 * calculates the subtotal, including gratuity, to be paid. 
 */
import java.util.Scanner;

public class Problem2_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the subtotal and gratuity rate: ");
    float initialTotal = input.nextFloat();
    float gratuity = input.nextFloat();

    float gratuityRate = initialTotal * (gratuity/100);
    float subtotal = initialTotal + gratuityRate;

    System.out.println("The gratuity is $" + gratuityRate + " and the subtotal is $" + subtotal);
  }
}