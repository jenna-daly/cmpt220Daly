/**
 * file: Problem10_17.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 7
 * due date: April 25, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem10_17 abstract data type.
 */

/**
 * Problem10_17
 * 
 * This class is designed to find square numbers.
 */
import java.math.BigInteger;

public class Problem10_17 {
  public static void main(String[] args) {

    BigInteger x = new BigInteger(Long.MAX_VALUE +"");
    BigInteger endpt = x.add(new BigInteger("10"));

    for(x = new BigInteger(Long.MAX_VALUE+ ""); x.compareTo(endpt) <= 0;
        x = x.add(new BigInteger("1"))); {
      System.out.println("The first 10 square numbers greater than Long.MAX_VALUE: "
      	+ x.multiply(x));
    } 
  } 
}
