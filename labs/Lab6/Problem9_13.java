/**
 * file: Problem9_13.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 6
 * due date: April 17, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem9_13 abstract data type.
 */

/**
 * Problem9_13
 * 
 * This class is designed to return a max value given user input of array.
 */
import java.util.Scanner;

public class Problem9_13 {
  public static void main(String[] args) {
    //gather user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    int x = input.nextInt();
    int y = input.nextInt();
    //assign array values
    double [][] array = new double [x][y];
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j<array[i].length; j++) {
        array[i][j] = input.nextDouble();
      }
    }
    //returns max and location
    Location max = locateLargest(array);
    System.out.println("The max value is " + max.maxValue + " at array location " 
    + max.row + "," + max.column);
  }

public static Location locateLargest(double[][] a) {
  return new Location(a);
  }
}

class Location {
  //data fields
  int row;
  int column;
  double maxValue;
  //method; picks out max and location
  Location(double[][] a) {
    maxValue = a[0][0];
    row = 0;
    column = 0;
    for (int i=0; i<a.length; i++) {
      for(int j=0; j<a[i].length; j++) {
        if(a[i][j]> maxValue) {
          maxValue = a[i][j];
          row = i;
          column = j;
        }
      }
    }
  }
}

/* UML Diagram

Location
---------
row: int
column: int
maxValue: double
----------
Location(double[][] a)
*/