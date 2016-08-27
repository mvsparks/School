/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: Lottery class.
 * - Default constructor - creates an lottery object and an array 5 random numbers
 *                         that is used for the lottery numbers.
 * - errorCheck - used to check if the user has inputted their lottery number 
 *                correctly. There is a getter and setter for errorCheck.
 * - compareNumbers - accepts user numbers array and compares the lottery and
 *                    user numbers and counts the number of matching numbers
 *                    and returns count.
 * - toString - Returns an error message string if the user inputted numbers
 *              incorrectly.
 *              Otherwise, returns a string that displays lottery and user
 *              numbers and numbers of matches and whether the user has won the
 *              lottery or not.
 * Due: 03/20/2015
 * Programmer: Vince Sparks
 * Assignment: Lottery.java
*/
package Lab2;

import java.lang.Math;

public class Lottery {
        
    private int[] lotteryNumbers = new int[5];
    private int count = 0;
    private Boolean errorCheck = true;
    
    //Default constructor that creates an array of random numbers
    public Lottery(){
        for(int i=0; i<5; i++){
            //Creating random number array
            //(Math.Random() * ((upperbound - lowerbound) + 1) * lowerbound)
            this.lotteryNumbers[i] = (int) (Math.random() * 10);
           }
    }
    
    //setting error check
    //accepts boolean type errorCheck and does not return anyting
    public void setErrorCheck(Boolean errorCheck){
        this.errorCheck = errorCheck;
    }
    
    //getting error check
    //returns boolean type errorCheck
    public Boolean getErrorCheck(){
        return this.errorCheck;
    }
    
    //Compare the two arrays
    //returns number of numbers correct
    public int compareNumbers(int[] userNumbers){
        //comparing arrays and incrementing if equal
        for(int i=0; i<5; i++){
            if(this.lotteryNumbers[i] == userNumbers[i]){
                this.count++;
            }
        }
        return count;
    }
    //Print the results
    //Accepts array of user lottery numbers, number of numbers that match and
    //the errorCheck boolean 
    public String toString(int[] userNumbers, int count, boolean errorCheck){
        String display = "Lottery Numbers: ";
        //Printing out error message
        if(errorCheck == false){
            display = "You have entered an invalid lottery number.";
            return display;
        }
        //adding lottery numbers to display string
        else{
            for (int i=0; i<5; i++){
                display = display + (this.lotteryNumbers[i] + " ");
            }
        //adding user lottery numbers to display string
        display = display + "\nYour Numbers: ";
            for (int i=0; i<5; i++){
                display = display + (userNumbers[i] + " ");
            }
        //adding number of correct numbers to display string
        display = display + "\nYou have gotten " + count + " correct";
        //adding winner or not a winner to display string
        if(count == 5){
            display = display + "\nYou are a grand prize WINNER!!!!";
        }
        else{
            display = display + "\nI'm sorry you are not a winner. Please play "
                    + "again.";
        }
        return display;
        }
    }
}
