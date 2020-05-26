/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ04_UserInputs

Usage of Scanner Class and its methods
 */

package com.sankir;

// Heirarchy is Project -> package - > Class
// Project and Class name should start with Capital letter
// package name should be small letters

// Brief insight into Class - Object format
// <Class> <Objectname> - new <Class>();
// now using objectname, access the methods of <Class>.
// Class is like template and Object is instance of Class
// Object is instantiated thru keyword 'new';

import java.util.Scanner; // // This will be automatically imported in IntelliJ , else manually import it.

public class SJ04UserInputs {
    public static void main(String[] args) {

       // Scanner Class is used to take inputs from user.
        // Lets instantiate a Scanner Obejct

        Scanner sc = new Scanner(System.in); // This is the format
        //if Scanner appears in RED, click on it, press ALT+Enter - suggestions are given - choose import Scanner

        // To take an int input use nextInt() method
        int number=0;
        System.out.println("Enter the numer : "); // prompt to the user
        number = sc.nextInt(); // nextInt() returns an int,  so you need a int variable to capture the return value

        System.out.println("User entered number is : " + number);

        // Assignment - Print if the user entered number is odd or even.


        System.out.println();
        // To take an String input use next() method
        String name=""; //always initialise a string ariable to null;

        System.out.println("Enter the name : "); // prompt to the user
        name = sc.next(); // next() returns a String,  so you need a String variable to capture the return value

        System.out.println("User entered name is : " + name);

        // Assignment - Print if the user entered name is equal to SanKir.


    }
}
