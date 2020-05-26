/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ11_ArrayString

Usage of Array of String and Enhanced Loop
 */

package com.sankir;


public class SJ11ArrayString {

    public static void main(String[] args) {
        /*
can be initialised individually like this also.
String[] arrayString = new arrayString[10]; // Need to specify the size of array needed.
        arrayString[0]="Bhuvan";
        arrayString[1]="Anand";
        ..
        ..
        arrayInt[9]=25; // since index begins with zero, last index will be 9.
*/

        String[] arrayString = {"Bhuvan", "Anand", "Chandan", "Arun", "Danish",
                "Bhaskar", "Suresh", "Sharath", "Dhruva", "Zakir"};

        System.out.println("Sizeof Array is : " + arrayString.length);

        // Print the elements of String Array using for loop
        for (int i = 0; i < arrayString.length; i++)
            System.out.print(arrayString[i] + ", ");

        // Print the elements of String Array using enhanced loop
        System.out.println();
        for (String st : arrayString)
            System.out.print(st + ", ");

        // Print only those elements of String Array whose name starts with A
        System.out.println();
        System.out.println("Printing those elements of Array starting with A");
        for (String st : arrayString) {
            if (st.charAt(0) == 'A')
                System.out.print(st + ", ");
        }

        // Print all the elements of String array and length of each element
        System.out.println();
        System.out.println("Printing elements of Array and their length");
        for (String st : arrayString) {
            System.out.println(st + "-" + st.length());
        }

    }
}
