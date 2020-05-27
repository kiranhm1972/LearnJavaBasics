/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ06_StringToInt

Integer and String Class methods usage to convert int value to String and vice versa
 */

package com.sankir;


import java.util.Scanner;

import static java.lang.Character.isDigit;

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

        System.out.println();
        System.out.println("Number Class");
        Number nm = 200;

        System.out.println(nm.byteValue());
        System.out.println(nm.doubleValue());
        System.out.println(nm.toString().length());

        System.out.println();
        System.out.println("Character Class");
        Character ch = 'k';

        System.out.println(ch.charValue());
        System.out.println(ch.toString().length());
        System.out.println(Character.isSpaceChar(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str2 = sc.next();

        System.out.println(str2);


        int sum=0;
        System.out.println("Find sum of digits in given string ");
        String alphanumeric = "kiran23sanjay27"; // sum of digits is 14

        alphanumeric = str2;
        for (int j = 0; j < alphanumeric.length(); j++) {
            if (isDigit(alphanumeric.charAt(j))) {
                sum += Character.getNumericValue(alphanumeric.charAt(j));
            }
        }

        System.out.println("The sum of digits is : " + sum);

//        System.out.println("Is digit ");
//        String alphanumeric = "kiran23sanjay27";
//        String numberstr = "";
//        for (int j = 0; j < alphanumeric.length(); j++) {
//            if (isDigit(alphanumeric.charAt(j))) {
//                numberstr += alphanumeric.charAt(j);
//            }
//        }
//
//
//        System.out.println("The sum of digits is : ");
//        System.out.println(numberstr);
//        int  sum=0;
//
//        for (int j = 0; j < numberstr.length(); j++) {
//            sum += Character.getNumericValue(numberstr.charAt(j));
//            }
//
//        System.out.println(sum);
//
        }
    }




