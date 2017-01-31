/**
   * file: QuestionTwo.java
   * author: Jenna Daly
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.3
   * 
   * This file contains the declaration of the 
   * QuestionTwo abstract data type.
   */

import java.util.Scanner;

public class QuestionTwo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the following as percentages... ");
    System.out.print("midterm exam: ");
    float midterm = input.nextInt();

    System.out.print("final exam: ");
    float finalexam = input.nextInt();

    System.out.print("projects: ");
    float projects = input.nextInt();

    System.out.print("homework and labs: ");
    float homeworkLabs = input.nextInt();

    float finalgrade = (midterm + finalexam + projects + homeworkLabs)/5;

    System.out.println("Your final grade is " + finalgrade + "%");
  }
}