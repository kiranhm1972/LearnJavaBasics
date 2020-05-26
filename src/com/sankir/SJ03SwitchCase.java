/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ03_SwitchCase

Switch Case
 */

package com.sankir;

// Heirarchy is Project -> package - > Class
// Project and Class name should start with Capital letter
// package name should be small letters

public class SJ03SwitchCase {
    public static void main(String[] args) {

        // Switch case is alternative to if-else conditionl
        // Value of int or String varaible can be checked for a particular value and tasks cna be executed

        // Switch ase for int - Ex: Lets print no of marbles in a basket.

        int marbles = 1;

        switch (marbles) {
            case 1:
                System.out.println("No of marbles is 1 ");
                break; // must to exit the switch else it will fall through - try it
            case 2:
                System.out.println("No of marbles is 2 ");
                break;
            case 3:
                System.out.println("No of marbles is 3 ");
                break;
            case 4:
                System.out.println("No of marbles is 4 ");
                break;
            default:
                System.out.println("No of marbles is greater then 4");
        }

        // Assignemnt - change marbles vlaue to 1, 2 , 4 and 5 and print results

        // Switch ase for int - Ex: Lets print no of marbles in a basket.

        System.out.println();
        String name = "Bhuvan";
        switch (name) {
            case "Anand":
                System.out.println("Name starts with A and name is  " + name );
                break; // must to exit the switch else it will fall through - try it
            case "Bhuvan":
                System.out.println("Name starts with B and name is  " + name );
                break;
            case "Chandan":
                System.out.println("Name starts with C and name is  " + name );
                break;
            case "Dhruva":
                System.out.println("Name starts with D and name is  " + name );
                break;
            default:
                System.out.println("Name starts with other than A,B,C,D and name is  " + name );
        }

        // Assignemnt - change name starting with A, C, D and E and rint results



    }
}
