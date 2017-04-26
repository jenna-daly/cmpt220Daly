/**
 * file: Problem10_10.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: lab 7
 * due date: April 25, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Problem10_10 abstract data type.
 */

/**
 * Problem10_10
 * 
 * This class is designed to return queued elements.
 */
import java.util.Scanner;

public class Problem10_10 {
  public static void main(String[] args) {
    Queue queue = new Queue();

    for(int i=1; i<21; i++) {
      queue.enqueue(i);
    }
    while(!queue.empty()) {
      System.out.print(queue.dequeue() + " ");
    }
  }
}

class Queue {
  //date field
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;

  //constructor
  Queue(){
    elements = new int[DEFAULT_CAPACITY];
  }

  //methods
  //adds v into queuee
  public void enqueue(int v) {
    if(size >= elements.length) {
      int[] temp = new int[elements.length*2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = v;
  }
  //removes and returns element from queue
  public int dequeue() {
    int v = elements[0];
    int[] temp = new int[elements.length];
    System.arraycopy(elements, 1, temp, 0, size);
    elements = temp;
    size--;
    return v;
  }
  //check if it is empty
  public boolean empty() {
    return size == 0;
  }
  //return number of elements
  public int getSize() {
    return size;
  }
}

/* UML Diagram

Queue
-------
elements: int[]
size: int
--------
Queue()
enqueue(int v)
dequeue(): int
empty(): boolean
getSize(): int
*/