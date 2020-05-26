/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ07_StaticMethods

Invoking static methods
 */

package com.sankir;

import java.util.Scanner;

/*
A Class has methods. One of them can be main methods which is static.
Class can contain other static methods . Lets look at an example.

 */
public class SJ07StaticMethodsP1 {

    public static void main(String[] args) {

        // lets invoke a static method add to sum up teo numbers
        int num1 = 100, num2 = 200;
        int sum = 0;

        // invoke method add
        sum = add(num1, num2);  // return value of method add is int and is captured in variable sum which is
        // of type int.
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        System.out.println();
        // invoke OddorEven add to check if user entered number is Odd or Even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        boolean flag;
        flag = OddorEven(number);  // return value of method add is int and is captured in variable sum which is
        // of type int.
        //based on return value , print the appropriate sentence

        if (flag == true)
            System.out.println("Entered number is Even");
        else
            System.out.println("Entered number is Odd");

    } // end of Main method

    // start of static method add

    // signature is : <access modifier> static <returntype> <method name>(param1, param2 .... param n)
    // signature for add will be : public static int add(int n1, int 2 )
    // note public is optional

    public static int add(int n1, int n2) {

        int result = 0; // This is local variable and visible within this method only and not outside
        // Similarly variables declared inside Main method are not accessible here.
        result = n1 + n2;

        return result; // since return value is int, local variable result of type int is returned.
        // It contains sum of two numbers which were passed as arguments

    }
// end of static method add

    //  // start of static method OddorEven
    // lets write another method to check if number is Even or Odd
    // pls note return value is true if number is  even and false if its odd
    public static boolean OddorEven(int n1) {

        if (n1 % 2 == 0)
            return true;
        else
            return false;
    }
// end of static method OddorEven

    // Assignment
    // write subtract, multiply and division methods

} // end of Main Class SJ07StaticMethods