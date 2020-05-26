/*
SanKir Technologies - www.sankir.com
All the programs are copyright@2019-20 of SanKir Technologies

Program ID : SJ14FileReadWrite

Read contents of a  text file and write back

// Program reads all the lines of inputfile.txt and copies to outptfile.txt

// Two static methods are written

// 1. static method - readFromFile - to read contents of File
        // parameter - filepath  ; returns filecontents
// 2. static method - writeToFile - to write contents to a specified file
        // parameter1 - filepath  parameter2 - content; returns void.
 */
package com.sankir;

import java.io.*;

public class SJ14FileReadWrite {

  public static void main(String args[]) {

    String inputfilepath = "D:\\1-Data Leap\\1-DATASETS\\inputfile.txt"; // file to be read // change path in your program
    String filecontents = "";  // to capture output of static method - readFromFile

    filecontents = readFromFile(inputfilepath);  // static method - readFromFile - is called

    System.out.println("Lines read from File ");
    System.out.println(filecontents);

    System.out.println("Now writing to file ");
    String outputfilepath = "D:\\1-Data Leap\\1-DATASETS\\outputfile.txt";

    writeToFile(outputfilepath, filecontents); // write the file content that was read to another file

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
