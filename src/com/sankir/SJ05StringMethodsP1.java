/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ05_StringMethods_Part1


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


public class SJ05StringMethodsP1 {
    public static void main(String[] args) {

        // String Object can ne instantiated thu ne String();
        // Lets look at some String methods.

        String company = "SanKir Technologies";

        // length() method - returns length of given string.
        int length = 0;
        length = company.length(); // length() method of String returns int value, so you need a int variable to
        // capture return value.
        System.out.println("The length of the string company is :" + length);

        // Alternatively tou can print length directly as an argument to println();
        System.out.println("The length of the string company is :" + company.length());

        System.out.println();
        // toLowerCase() method - returns the string in lowercase, so you need a String variable to
        // capture return value.
        String lowercase = company.toLowerCase();
        System.out.println("The lowercase of company name is : " + lowercase);

        System.out.println();
        // toUpperCase() method - returns the string in UPPERCASE, so you need a String variable to
        // capture return value.
        String uppercase = company.toUpperCase();
        System.out.println("The UPPERCASE of company name is : " + uppercase);

        System.out.println();
        // charAt(int index) method - returns the char/letter at index position of String, so you need a char variable to
        // capture return value.
        char ch1 = company.charAt(0); // captures the first letter of company name, since index starts
                                        // with zero , give index as zero.
        System.out.println("The first letter of company name is : " + ch1);

        // print he char at index 7
        ch1 = company.charAt(7); // captures the Eighth letter of company name, so index will be 7
        System.out.println("The Eighth letter of company name is : " + ch1);

        System.out.println();
        // searh if company contains a specific word
        boolean boo = company.contains("SanKir"); // returns boolean
        System.out.println("Company name contains SanKir : " + boo);

        // check for "Google" and print result


        System.out.println();
        // replace a character
        String replaced = company.replace('o', 'a'); // all occurances of o are replaced
        System.out.println("Return value after letter o is replaced by a: " + replaced);
        System.out.println("Company name after a letter is replaced but not stored back in company : " + company);
        // Pls note value of company will be still name and its original charcter is not replaced, this can be done through
        // writing back string return value to company variable itself

        company =  company.replace('o', 'a');
        System.out.println("Company name after a letter is replaced and stored back in company: " + company);

        System.out.println();
        // replace a character


    }

}
