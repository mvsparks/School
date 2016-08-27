/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to accept an array of lottery
 * lottery numbers from the user and compare them to an array of randomly 
 * generate numbers and determined if the user has won the lottery or not.
 * Due: 03/20/2015
 * Programmer: Vince Sparks
 * Assignment: LotteryDriver.java
*/
package Lab2;

import javax.swing.JOptionPane;

public class LotteryDriver {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int[] userNumbers = new int[5];
        String input = "";
        Boolean errorCheck = true;
        int numberCorrect = 0;
         
        //Prompting user for lottery numbers. 
        input = JOptionPane.showInputDialog("Enter your five lottery numbers,"
                                            + " ex. 12345");
        //Checking input for correct length
        if(input.length() < 5 || input.length() > 5){
             errorCheck = false;  
             lottery.setErrorCheck(errorCheck);
             input = "";
         }
        //Checking if there is an none numbers in input
        else if(input.matches(".*\\D.*")){
             errorCheck = false;
             lottery.setErrorCheck(errorCheck);
             input = "";
        }
        //Spliting string into int array
        else{
            for(int i=0; i<5; i++){
                userNumbers[i] = Integer.parseInt(input.substring(i, i+1));
                }
            }
         
        numberCorrect = lottery.compareNumbers(userNumbers);
        JOptionPane.showMessageDialog(null, lottery.toString(userNumbers,
                                    numberCorrect, errorCheck));
    }
}
