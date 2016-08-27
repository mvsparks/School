package Lab3;

import java.util.Scanner;
/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a file of 100 integers.
 * Read the integers from the file then sort and display the results.
 * Due: 04/10/2015
 * Programmer: Vince Sparks
 * Assignment: FileDriver.java
 */

public class FileDriver extends FileIO {

    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("MyFile.txt");
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        Scanner input = new Scanner(file);
        int[] intArray = new int[100];
        int[] sortedArray = new int[100];

            writeFile(output);
            intArray = readFile(input, intArray);
            System.out.println("Before Sorted");
            for (int i = 0; i < intArray.length; i++) {
                if (i % 10 == 0) {
                    System.out.println("");
                }
                System.out.print(intArray[i] + " ");
            }
            sortedArray = sortArray(intArray);
            System.out.println("\n\nAfter Sorted");
            for (int j = 0; j < sortedArray.length; j++) {
                if (j % 10 == 0) {
                    System.out.println("");
                }
                System.out.print(sortedArray[j] + " ");
            }
    }

}
