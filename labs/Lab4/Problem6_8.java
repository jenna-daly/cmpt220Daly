/**
 * file: Problem6_8.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem6_8 abstract data type.
 */

/**
 * Problem6_8
 * 
 * This class converts from celsius to farenheit and vice versa for a set of values.
 */

import java.util.Scanner;

public class Problem6_8 {
  public static void main(String[] args) {
    System.out.println("Celsius  Farenheit | Farenheit  Celsius");
    System.out.println("_______________________________________");
    //for loop to be used in conversions
    for(double celsius = 40.0, farenheit = 120.0; celsius >= 31; celsius--, 
      farenheit = farenheit - 10){
      System.out.printf("%.1f", celsius);
      System.out.printf("     %.1f |\n", celsiusToFarenheit(celsius));
      System.out.printf("                 %.1f", farenheit);
      System.out.printf("     %.2f\n", farenheitToCelsius(farenheit));
    }
}
  //convert from Celsius to Farenheit 
  public static double celsiusToFarenheit(double celsius) {
      
    return (9.0/5) * celsius + 32;
    // couldn't get celsius = formula to return so moved to front of formula
    //return celsius;
  } 

  public static double farenheitToCelsius(double farenheit){

    return (5.0/9) * (farenheit - 32);
    //return farenheit;
  }
}