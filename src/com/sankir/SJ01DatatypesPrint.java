/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ01_DatatypesPrint

Basic Datatypes - int, String, char, boolean, double, float
 */

package com.sankir;

// Heirarchy is Project -> package - > Class
// Project and Class name should start with Capital letter
// package name should be small letters

// All variable and method names should start with small letter and
// if there are two words in a name, it should follow camelCase.
// Do not use _ or - in variable names of data type.

public class SJ01DatatypesPrint {
    public static void main(String[] args) {

        byte bytenum = 123;  // can also represent as byte bytenum = 0b1111011;  // note the prefix 0b
        short shortnum = 12345;
        int intnum = 1234567890;  // can also be represented as hexvalue. Ex: int i =15 can be int i =0x0F;
        long longnum = 1234567890000000000L;  // value suffixed with L
        String companyName = "SanKir Technologies"; // camelCase followed
        char ch = 's';
        boolean b = true; // it can take true or false
        double d = 25.5;  // precision upto 16 decimal digits
        float f = 34.56f; // value suffixed with f or F . can be used as float f = 34.56F  // precision upto 7 decimal digits

        System.out.println("byte Number is :" + bytenum);
        System.out.println("short Number is :" + shortnum);
        System.out.println("integer Number is :" + intnum);
        System.out.println("long number is :" + longnum);
        System.out.println("String is :" + companyName);
        System.out.println("character is :" + ch);
        System.out.println("boolean is :" + b);
        System.out.println("double is :" + d);
        System.out.println("float is :" + f);

        // Assignment
        // Declare another set of variables for all datatypes and print them.


    }
}

/*
FYI:

Data types, size.
Two types of data :

A. Primitive Data Types
------------------------
1. Boolean Type -> boolean
2. Numeric Type
    i) Character -> char
    ii) Integral
        a) Integer  -> byte, short, int, long
        b) Floating -> double, float

B. Non-Primitive Data Types (Reference Types)
---------------------------
1. String
2. Array



Note:  Primitives vs. References  
	Primitive types are the basic types of data
		byte, short, int, long, float, double, boolean, char
		primitive variables store primitive values
	Reference types are any instantiable class as well as arrays
		String, Scanner, Random, Die, int[], String[], etc.
		reference variables store addresses


Size of Data Types:
-------------------
Note : 1 byte = 8 bits.
Six numeric types : Four integer and two floating :

byte  - Size : 1 byte  - Range : -128 to 127
short - Size : 2 bytes - Range : -32,768 to 32,767
int   - Size : 4 bytes - Range : -2,147,483,648 to 2,147,483,647
long  - Size : 8 bytes - Range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80
float - Size : 4 bytes - upto 7 decimal digits
double - Size : 8 bytes - upto 16 decimal digits

default value for boolean is false. Size of boolean is 1 bit.

 */