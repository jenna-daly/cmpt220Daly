/**
 * file: Problem7_31.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 5
 * due date: March 28, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem7_31 abstract data type.
 */

/**
 * Problem7_31
 * 
 * This class implements a prompt for the user to enter 2 lists and then the
 * program merges them into a sorted list.
 */

import java.util.Scanner;

public class Problem7_31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //gather user input into arrays
    System.out.print("Enter list1: ");
    //int n = input.nextInt();
    int[] list1 = new int[input.nextInt()];
      for(int i=0; i< list1.length; i++) {
        list1[i] = input.nextInt();
      }
    System.out.print("Enter list2: ");
    //int i = input.nextInt();
    int[] list2 = new int[input.nextInt()];
      for(int i=0; i< list2.length; i++) {
        list2[i] = input.nextInt();
      }

      int[] mergedList = merge(list1, list2);
      System.out.print("The merged list is");
        for (double e: mergedList) {
          System.out.print(" " + e);
        }
      }

    public static int[] merge(int[] list1, int[] list2) {
      int[] mergedList = new int[list1.length + list2.length];
      for(int i=0; i <list1.length-1; i++) {
      	mergedList[i] = list1[i];
      }

      for(int i=0, j = list1.length; i<list2.length; i++, j++) {
      	mergedList[j] = list2[i];
      }
      sortMerge(mergedList);
      return mergedList;
    }

    public static void sortMerge(int[] sort) {
      for(int i=0; i < sort.length -1; i++) {
        int currentMin = sort[i];
        int currentMinIndex = i;

        for(int j=i + 1; j< sort.length; j++) {
          if (sort[j] < currentMin) {
            currentMin = sort[j];
            currentMinIndex = j;
          }
        }
      //swap if necessary
      if(currentMinIndex != i) {
        sort[currentMinIndex] = sort[i];
        sort[i] = currentMin;
      }
    }
  }

    //public static void print(int[] list) {
      //for (int aList : list) {
        //System.out.print(aList + " ");
      //}
    //}
}

  //a lot of questionable code tests
  /*public static int[] merge(int[] list1, int[] list2) {
    int size = list1.length + list2.length;
    int[] newList = new int[size];
    int p1 = 0, p2 = 0;
      while (p1 < list1.length && p2 < list2.length) {
        if (list1[p1] < list2[p2]) {
          newList[p1 + p2] = list1[p1++];
        } 
        else {
          newList[p1 + p2] = list2[p2++];
        }
      }
        while (p1 < list1.length) newList[p1 + p2] = list1[p1++];
        while (p2 < list2.length) newList[p1 + p2] = list1[p2++];
        return newList;
    }

  public static void print(int[] list) {
    for (int aList : list) {
      System.out.print(aList + " ");
    }
  }
}
    //merge arrays
    /*public static int[] merge(int[] list 1, int[] list 2) {
      int[] mergedList = new int[list1.length + list2.length];

      for(int i=0; i <list1.length-1; i++) {
      	mergedList[i] = list1[i];
      }

      for(int i=0; i<list2.length-1; i++) {
      	mergedList[j] = list2[i];
      }
      sort(mergedList);
      return mergedList;
    }

    //sort merged array
    public static void sortMerge(int[] sort) {
      int i = 0;
      int j = 0;
      for(int i=0; i < sort.length -1; i++) {
        int currentMin = sort[i];
        int currentMinIndex = i;

        for(int j=i + 1; j< sort.length; j++) {
          if (sort[j] < currentMin) {
            currentMin = sort[j];
            currentMinIndex = j;
          }
        }
      //swap if necessary
      if(currentMinIndex != i) {
        sort[currentMinIndex] = sort[i];
        sort[i] = currentMin;
      }
    }
  }*/