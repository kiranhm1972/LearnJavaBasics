/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ15FileReadMatchWrite

Read contents of a  text file and write back

// Program reads all the lines of inputfile.txt
// searches for the line containing the user given word and replaces with another word
// copies the matching lines to outputreplacefile.txt

// Two static methods are written

// 1. static method - readFromFile - to read contents of File
        // parameter - filepath  ; returns filecontents
// 2. static method - writeToFile - to write contents to a specified file
        // parameter1 - filepath  parameter2 - content; returns void.
 */
package com.sankir;

import java.io.*;
import java.util.Scanner;

public class SJ16FileReadReplaceWrite {

  public static void main(String args[]) {

    String inputfilepath = "D:\\1-Data Leap\\1-DATASETS\\inputfile.txt"; // file to be read // change path in your program
    String filecontents = "";  // to capture output of static method - readFromFile

    filecontents = readFromFile(inputfilepath);  // static method - readFromFile - is called

    System.out.println("Lines read from File :\n");
    System.out.println(filecontents);

    // Get all the lines as Array of String
    String filelines[] = filecontents.split("\n"); // by splitting based on new line.
    // Remember readFromFile method adds new line after reading each line in file

    // Now search the lines containing matching word( user given word ) and copy them to other String.
    System.out.println("Enter the matching word to be searched in lines of File :");
    Scanner sc = new Scanner(System.in);
    String userword = sc.next();

    System.out.println("Enter the replacement word  :");
    String replaceword = sc.next();

    String matchlines = "";
    int count =0; // count the lines with replaced word
    for(String str:filelines)  //scna through all lines read
    {

      if(str.contains(userword)) { // if matches - copy to matchlines String and add new line
        matchlines += str.replace(userword, replaceword) + "\n";
           // add the new line to matchlines
        count++;
      }  // this is for replacing the matching word with some other word

    }

    System.out.println("\nNumber of Lines with replaced word : " + count);
    System.out.println("\nLines in file containing the user given word and replaced with another word :\n");
    System.out.println(matchlines);

    System.out.println("Now writing Matching Lines to file ");
    String outputfilepath = "D:\\1-Data Leap\\1-DATASETS\\outputreplacefile.txt";

    writeToFile(outputfilepath, matchlines); // write the file content that was read to another file

  } // main ends


  // static method - readFromFile - to read contents of File
  static String readFromFile(String filepath) {

    String lines = "";

    /// All the File Read operation should be insid try catch Block else error

    try {
      FileReader fr = new FileReader(filepath);
      BufferedReader br = new BufferedReader(fr);
      String currentline = "";

      currentline = br.readLine(); // read  first line

      while (currentline != null) { // read till end of file
        lines += currentline + "\n";  // after reading a line, newline needs ot be added as readLine reads till \n
        currentline = br.readLine(); // read next line
      }

      br.close();
      fr.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return (lines); // entire file content in single String is returned

  }   // // static method - readFromFile - ends


  // static method - writeToFile - to write contents to a specified file
  static void writeToFile(String filepath, String content) {

    try {
      FileWriter fw1 = new FileWriter(filepath); // file to write all lines
      BufferedWriter bw1 = new BufferedWriter(fw1);

      bw1.write(content); // writes to file

      bw1.close();
      fw1.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();

    }
  } // static method - writeToFile - ends

}  // Class ends
