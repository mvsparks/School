package Lab3;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a class for used for
 * file read and write. Also, there is a method that will sort the integers read
 * from the file.
 * Due: 04/10/2015
 * Programmer: Vince Sparks
 * Assignment: FileIO.java
 */

public class FileIO {

    public static int[] readFile(Scanner input, int[] intArray) {
        int i = 0;

        while (input.hasNext()) {

            intArray[i] = input.nextInt();
            i++;

        }
        input.close();
        return intArray;
    }

    public static void writeFile(java.io.PrintWriter output) {

        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 100) + 1;
            output.println(number);
        }

        output.close();
    }

    public static int[] sortArray(int[] intArray) {
        Arrays.sort(intArray);
        return intArray;
    }
}
