/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ08_FactorialMethod

Invoking Factorial method to find the Factorial of user entered number.
// Factorial of n is : F(n) = n * (n-1) * ( n-2) * ....  * 1;
// Ex: F(5) = 5*4*3*2*1 = 120;
 */

package com.sankir;

import java.util.Scanner;

/*
A Class has methods. One of them can be main methods which is static.
Class can contain other static methods . Lets look at Factorial Method example

 */

public class SJ08FactorialMethod {

    public static void main(String[] args) {

        System.out.println();
        // invoke OddorEven add to check if user entered number is Odd or Even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which Factorial is needed :");
        int number = sc.nextInt();

        int result = getFactorial(number); // invoke the getFactorial method with user entered number
        // and the return value is captured in int variable result.
        System.out.println("Factorial of num is : " + result);

        // Assignment - if use enters negative number - You should not invoke getFactorial method, instead
                    // print - pls enter positive numbers only.
    }  // end of Main method

    static int getFactorial(int n) {

        int fact = 1;
        if (n == 1)
            return fact; // if passed number is 1, just retuen fact as it is set to 1 already.

        while (n > 1) {
            fact = fact * n;   // keep multiplying until n reduces to 1
            n--;
        }
        return fact; // reurn the calculated factorial
    }

} // end of Class



