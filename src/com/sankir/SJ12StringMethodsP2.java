package com.sankir;/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ12_StringMethods_Part2

Usage of Array of int and Enhanced Loop
 */


public class SJ12StringMethodsP2 {

    public static void main(String[] args) {

        // split method of String returns Strin[]
        // So we are looking ata method that returns an array

        System.out.println();
        String name = "Sankir Technologies Pvt Ltd Bangalore";

        // The above name is split based on the delimeter <space>
        // split returns String[] , so left hand side we need String[] to catch the return value;
        // Note - split is method of Class String and is accesses using the object ( in this case - name )
        String[] words = name.split(" ");

        System.out.println("Number of words in name is : " + words.length);
        for(String st:words){
            System.out.println(st + " - " + st.length());
        }

        // Check if the word 'sankir' exists in words.
        System.out.println();
        for(String st:words){
            if(st.equalsIgnoreCase("sankir"))
                System.out.println(st + " exists in array and its length is - " + st.length());
        }

    }
}
