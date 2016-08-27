/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to prompt and accept a password 
 * from the user and check whether the password is valid or not. The password
 * must have at least one uppercase and lowercase letter and also at least one
 * digit.
 * Due: 03/20/2015
 * Programmer: Vince Sparks
 * Assignment: PasswordDriver.java
*/
package LabQuiz;

import java.util.Scanner;

public class PasswordDriver {
    public static void main(String[] args){

                String input;  // To hold input

                // Create a Scanner object for keyboard input.
                Scanner keyboard = new Scanner(System.in);

                // Get a password.
                System.out.print("Enter a password: ");
                input = keyboard.nextLine();

                // Check the password.
                if (!PasswordVerifier.isValid(input))
                        System.out.println("Invalid password.");
                else
                        System.out.println("Valid password.");
                
        }
}

