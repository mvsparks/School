/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to prompt the user for a sentence
 * then take the sentence and count the number of occurences of each letter. 
 * After finding each occurence the program prints out a table showing each letter
 * and the number of times it occurs in the sentence inputted.
 * Due: 03/20/2015
 * Programmer: Vince Sparks
 * Assignment: LetterOccurances.java
*/
package Lab2;

import javax.swing.JOptionPane;

public class LetterOccurances {
    public static void main(String[] args){
        String input = "", display ="";
        char[] inputString = new char[input.length()];
        char[] alphabet = {'A','B','C','D','E','F','G',
                           'H','I','J','K','L','M','N',
                           'O','P','Q','R','S','T','U',
                           'V','W','X','Y','Z'};
        int[] numberOfLetters = new int[26];
        char nextLetter;
        int count = 0;
        
        //prompting user for a sentence
        input = JOptionPane.showInputDialog("This program will count the number "
                + "of each characters in a sentence.\n"
                + "Please enter a sentence:");
        //changing sentence to uppercase
        input = input.toUpperCase();
        //changing string to array of characters
        inputString = input.toCharArray();
        
        //comparing the sentence to the alphabet and counting the number of 
        //occurences of each letter then saving them in another array and
        //reseting count
        for(int i=0;i<alphabet.length;i++){
            nextLetter = alphabet[i];
            for(int j=0;j<input.length();j++){
                if(nextLetter == inputString[j]){
                    count++;
                }
            }
            numberOfLetters[i] = count;
            count = 0;
        }
        //Displaying the number of each letter occurances in the sentence
        //inputted
        display = "There are \n";
        for(int i=0; i<alphabet.length;i++){
            display = display + numberOfLetters[i] + ": " + alphabet[i] + "'s    ";
            //printing newline after every 5 letters
            if((i + 1) % 5 == 0){
                display = display + "\n";
            }
        }
        //Displaying table of number of occurences of each letter
        JOptionPane.showMessageDialog(null, display);
    }
}
