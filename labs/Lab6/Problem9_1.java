/**
 * file: Problem9_1.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 6
 * due date: April 17, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem9_1 abstract data type.
 */

/**
 * Problem9_1
 * 
 * This class is designed to represent a rectangle.
 */

public class Problem9_1 {
  public static void main(String[] args) {

    Rectangle data1 = new Rectangle(4, 40);
    Rectangle data2 = new Rectangle(3.5, 35.9);

    System.out.println("For rectangle 1: the width is " + data1.width + 
    ", the height is " +data1.height + ", the area is " + data1.getArea()
    + " and the perimeter is " + data1.getPerimeter());

    System.out.println("For rectangle 2: the width is " + data2.width + 
    ", the height is " +data2.height + ", the area is " + data2.getArea()
    + " and the perimeter is " + data2.getPerimeter());
  }
}

  class Rectangle {
    //data fields
    double width = 1;
    double height = 1;
    //constructors
    Rectangle(){
    }

    Rectangle(double newWidth, double newHeight) {
      width = newWidth;
      height = newHeight;
    }

    //methods
    double getArea() {
      return width*height;
    }

    double getPerimeter() {
      return width + width + height + height;
    }
  }

/*
UML Diagram

Rectangle
-----------
width: double
height: double
-----------
Rectangle()
Rectangle(newWidth: double, newHeight: double)
getArea(): double
getPerimeter(): double
*/
