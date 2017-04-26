/**
 * file: Problem10_2.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 7
 * due date: April 25, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem10_2 abstract data type.
 */

/**
 * Problem10_2
 * 
 * This class is designed to return a BMI evaluation given set values.
 */
import java.util.Scanner;

public class Problem10_2 {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yiang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() +
      " " + bmi1.getStatus());
    BMI bmi2 = new BMI("Susan King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() +
      " " + bmi2.getStatus());
  }
}

class BMI {
  private String name;
  private int age;
  private double weight;
  private double height;
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;
  public static final double INCHES_PER_FEET = 12;

  public BMI(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  public BMI(String name, double weight, double height) {
  	this(name, 20, weight, height);
  }
  //construct a BMI w specified name, age, weight, feet, inches
  public BMI(String name, double weight, double feet, double inches) {
    this(name, weight, inches + feet * 12);
  }

  public double getBMI() {
    double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * 
      (height * METERS_PER_INCH));
    return Math.round(bmi*100)/100.0;
  }

  public String getStatus(){
    double bmi = getBMI();
    if(bmi<18.5)
      return "Underweight";
    else if(bmi <25)
      return "Normal";
    else if(bmi<30)
      return "Overweight";
    else
      return "Obese";
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }
}