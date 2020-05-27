/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ10_ArrayInt

Usage of Array of int and Enhanced Loop
 */

package com.sankir;

public class SJ10ArrayInt {

    public static void main(String[] args) {
/*
can be initialised individually like this also.
int[] arrayInt = new int[10]; // Need to specify the size of array needed.
        arrayInt[0]=3;
        arrayInt[1]=5;
        ..
        ..
        arrayInt[9]=25; // since index begins with zero, last index will be 9.
*/

        int[] arrayInt = {3, 5, 9, 6, 10, 12, 18, 15, 24, 21, 20, 25};

        System.out.println("Size of Array is : " + arrayInt.length);

        // Print All the elements of array
        for (int i = 0; i < arrayInt.length; i++)
            System.out.print(arrayInt[i] + " ");

        //  Print those elements of array which are divisible by 3
        System.out.println();
        System.out.println("Numbers divisibe by 3");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 3 == 0)
                System.out.print(arrayInt[i] + " ");
        }

        // Print the sum of even numbers within array
        // Pint the sum of odd numbers within array

        System.out.println();
        int sum = 0, sumofeven = 0, sumofodd = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i]; // sum = sum + arrayInt[i];

            if (arrayInt[i] % 2 == 0)
                sumofeven += arrayInt[i];
            else
                sumofodd += arrayInt[i];
        }

        System.out.println();
        System.out.println("Sum is : " + sum);
        System.out.println("Sum of even is  : " + sumofeven);
        System.out.println("Sum of odd is  : " + sumofodd);


        /* Print All the elements of array using enhanced loop
             syntax of enhanced loop is
             for( <datatype of array> variable : <arrayname
        */

        System.out.println();
        System.out.println("Printing thru Enhanced loop");
        for (int in : arrayInt)
            System.out.print(in + " ");


        System.out.println();
        System.out.println();
        System.out.println("Tables");

        for(int num=1;num<=20;num++){

            for(int i=1;i<=10;i++)
                System.out.print((num*i)+", ");

            System.out.println();

        }


    }


} // class ends

