/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ02_ControlStatements

Control statements - for loop, while loop, do-while loop, if-else

 */

package com.sankir;

// Heirarchy is Project -> package - > Class
// Project and Class name should start with Capital letter
// package name should be small letters

public class SJ02ControlStatements {
    public static void main(String[] args) {

        // All variable names should start with small letter and
        // if there are two words it should follow camelCase.

        // for loop format
        // for(initial condition ; exit criteria; increment size)
        //  {  tasks to execute }
        // variables for the for loop can be single character and limited to for loop block.

        // for loop to print first 9 numbers starting with 1
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ", ");
            // prinlln will print new line, to avoid it  print is used
            //and an extra comma is added to seprate numbers when printing
        }


        System.out.println();
        // for loop to print alternate numbers starting with 1
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + ", ");
        }

        // Assignment - use for loop to print all values from 0 to 30 which are divisible by 3
        // Hint - can be handled through increment condition

        System.out.println();
        // onto while loop
        // While loop format - It checks condition first and then executes tasks.
        // While(condition)
        //  { tasks to execute, increment condition,  go back to start of loop };

        System.out.println();
        int num1 = 1;
        // Loop will not be entered as condition num1<1 fails
        while (num1 < 1) {
            System.out.println("Inside while loop : " + num1);
            num1++;
        }

        // onto do-while loop
        // do-While loop format - It first executes tasks and then checks condition.
        // do{
        //  tasks to execute before going back to start of loop }
        //  while(condition);

        System.out.println();
        int num2 = 1;
        // Loop will be entered one time as conidtion num2<1 is checked only after executing task;
        do {
            System.out.println("Inside do-while loop : " + num2);

        } while (num2 < 1);


        System.out.println();
        // if-else statement
        // format - if(condition) is true - then execute particluar task(s);
        // else execute next set of task(s);
        // Ex: Print if given numebr is odd or even

        int num3 = 5;
        if (num3 % 2 == 0)  // if modulus 2 of any number results in zero , it is even
            System.out.println("Number is Even");  // if more than two tasks are present, then only curly braces are needed
        else
            System.out.println("Number is Odd");

        // Assignment - change the num3 value to 6 and print the results.

        // if-elseif  statement
        // format - if(condition) is true - then execute particluar task(s);
        // elseif(condition) is true - then execute next set particluar task(s);
        // else execute next set of task(s);
        // Ex: Print if given numebr is divisible by 2
        //          else if             divisible by 3
        //          else             or not divisible either by 2 or 3

        System.out.println();
        int num4 = 3;
        if (num4 % 2 == 0)
            System.out.println("Number is divisible by 2 ");
        else if (num4 % 3 == 0)
            System.out.println("Number is divisible by 3 ");
        else
            System.out.println("Number is NOT divisible either by 2 or 3 ");

        // Assignment
        // change the num4 value to 2 and 5 and print the results.


        // Now compare two ints or Strings
        System.out.println();
        int n1 = 5, n2 = 5;
        if (n1 == n2)
            System.out.println("Two numbers are Equal");
        else
            System.out.println("Two number are NOT equal");

        // Assignment - change the n2 value to 10 and print result
        // Alternativley you can use if(n1 != n2)

        System.out.println();
        String s1 = "SanKir", s2 = "SanKir";
        if (s1.equals(s2)) // use equals and not == for Strings
            System.out.println("Two names are same");
        else
            System.out.println("Two names are NOT same");

        // Assignment - change the s2 value to "Google" and print result

        // to ignorecase use, equalsIgnoreCase
        System.out.println();
        s1 = "SANKIR";
        s2 = "sankir";
        if (s1.equalsIgnoreCase(s2))
            System.out.println("Two names are same though they differ in cases");
        else
            System.out.println("Two names are NOT same");

    }
}
