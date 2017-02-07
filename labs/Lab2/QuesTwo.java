/**
 * file: QuesTwo.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * QuesTwo abstract data type.
 */

/**
 * QuesTwo
 * 
 * This class implementsa program that returns the user's
 * letter grade given percentage grades in various categories. 
 */

import java.util.Scanner;

public class QuesTwo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //gather user inputs
    System.out.println("Please enter the following as percentages... ");
    System.out.print("midterm exam: ");
    double midterm = input.nextDouble();

    System.out.print("final exam: ");
    double finalexam = input.nextDouble();

    System.out.print("projects: ");
    double projects = input.nextDouble();

    System.out.print("homework and labs: ");
    double homeworkLabs = input.nextDouble();
    //convert user inputs 
    double midterm1 = (midterm*.2);
    double finalexam1 = (finalexam*.2);
    double projects1 = (projects*.2);
    double homeworkLabs1 = (homeworkLabs*.4);

    //calc final grade
    double finalgrade = (midterm1 + finalexam1 + projects1 + homeworkLabs1);

    //convert to letter grade
    if(finalgrade>=95){
      System.out.println("Your final grade is: A");
    }
    else if(finalgrade>=90 && finalgrade<95){
      System.out.println("Your final grade is: A-");
    }
    else if(finalgrade>=87 && finalgrade<90){
      System.out.println("Your final grade is: B+");
    }
    else if(finalgrade>=83 && finalgrade<87){
      System.out.println("Your final grade is: B");
    }
    else if(finalgrade>=80 && finalgrade<83){
      System.out.println("Your final grade is: B-");
    }
    else if(finalgrade>=77 && finalgrade<80){
      System.out.println("Your final grade is: C+");
    }
    else if(finalgrade>=73 && finalgrade<77){
      System.out.println("Your final grade is: C");
    }
    else if(finalgrade>=70 && finalgrade<73){
      System.out.println("Your final grade is: C-");
    }
    else if(finalgrade>=65 && finalgrade<70){
      System.out.println("Your final grade is: D+");
    }
    else if(finalgrade>=60 && finalgrade<65){
      System.out.println("Your final grade is: D");
    }
    else if(finalgrade<60){
      System.out.println("Your final grade is: F");
    }
  } 
}