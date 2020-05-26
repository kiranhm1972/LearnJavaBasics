/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ06_StringToInt

Integer and String Class methods usage to convert int value to String and vice versa
 */

package com.sankir;


public class SJ06StringToInt {

    public static void main(String[] args) {

        // Integer Class is another Class whose object an store int value.
        // The value stored inside a wrapper kind which is called autoboxing and to get the value unboxing can be used.
        // But we dont do unboxing explicitly as compiler takes care of that.

        // Lets store a value "20" in a String and convert it to value of 20;

        String str = "20";
        int i = Integer.parseInt(str); // This is how we get the int value stored in String
        // trurn value is int.

        System.out.println("number stored in string is : " + i);


        // Similarly int value can be converted to String.

        System.out.println();
        Integer number = 150;
        String s = number.toString(); // This is how we convert int value to String
        System.out.println("number converted to String : " + s);

        System.out.println("int converted to string, length is : " + s.length());

        // Pls note int j=200; cannot be converted to String as value is declared to be primitive datatype
        // class. ie., it should have bben Integer j =200;


        System.out.println();
        // unboxing - FYI
        int k = number.intValue(); // we can unbox value out of Integer to int but this is not needed
        System.out.println("value of k : " + k);

        // instaed we can use number directly
        System.out.println("value of number : " + number);


    }

}
