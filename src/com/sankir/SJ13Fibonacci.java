/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ13Fibonacci

// Fibonacci series is : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 .....
// i.e., current number is sum of previous two numbers except for first two numbers which are 0 & 1

// static method written

// static method - getFibonacci - to get the first n elements of fibonacci
        // input parameter - num of elements needed -int
        // output parameter - fibonacci series filled - int[]
 */

package com.sankir;

import java.util.Scanner;

public class SJ13Fibonacci {

  public static void main(String[] args) {

    int numofelements = 0;

    System.out.println("Enter number of Finonacci elements needed : Min-2, Max-15 : ");
    Scanner sc = new Scanner(System.in);
    numofelements = sc.nextInt();

    int[] fibarr = getFibonacci(numofelements);

    System.out.println("First " + numofelements + " elements of Fibonacci series are:");
    for (int i : fibarr)
      System.out.print(i + ",");
  } // main ends


  // static method - getFibonacci - to get the first n elements of fibonacci
  // takes n as inut parameter and returns int[] .

  static int[] getFibonacci(int num) {
    int curr = 1, prev = 0;
    int next = 0;

    // Create an integer array to hold the fibonacii numbers. Array Size is equal to user entered number.
    int[] fibo = new int[num];
    fibo[0] = prev; // first element of array is 0
    fibo[1] = curr; // second element of array is 1

    int index = 2;  //

    while (index < num) {
      next = prev + curr;
      fibo[index] = next;
      index++;

      prev = curr;
      curr = next;
    }
    return fibo ;// return the fibonacci array filled

  } //

}
