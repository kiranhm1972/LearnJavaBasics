/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ08_FactorialMethod

Invoking Factorial method ( using recursivee approach ) to find the Factorial of user entered number.
// Factorial of n is : F(n) = n * (n-1) * ( n-2) * ....  * 1;
// Ex: F(5) = 5*4*3*2*1 = 120;
 */

package com.sankir;

import java.util.Scanner;

/*
A Class has methods. One of them can be main methods which is static.
Class can contain other static methods . Lets look at Factorial Method example
 */

public class SJ09FactorialRecursive {

    public static void main(String[] args) {

        System.out.println();
        // invoke OddorEven add to check if user entered number is Odd or Even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which Factorial is needed :");
        int number = sc.nextInt();

        int result = getFactorial(number); // invoke the getFactorial method with user entered number
        // and the return value is captured in int variable result.
        System.out.println("Factorial of num is : " + result);


    }  // end of Main method

    static int getFactorial(int n) {

        int fact = 1;
        if (n == 1)
            return fact;

        fact = n * getFactorial(n - 1);   // keep invoking method until n reduces to 1
        return fact; // reurn the calculated factorial
    }

    /* Note : It works like this , assume factorial of 5 is needed
    / intially : fact = 5 * f(5-1)
                      = 5 * 4 * f( 4-1)
                      = 5 * 4 * 3 * f(3-1)
                      = 5 * 4 * 3 * 2 * f(2-1)
                      = 5*4*3*2*1
                      = 120.

    */


} // end of Class