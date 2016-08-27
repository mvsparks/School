package lab2;
import java.util.Scanner;

/*
 * Class: CSIT1510 Introduction to Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to prompt user for pay rate and hours
worked per week in a five week period and display their pay and how much they have spent 
on certain items during this period.
 * Due: 09/29/2014
 * Programmer: Vince Sparks
 * Assignment: Lab2c, Chapters 2
  */

public class lab2c {
    public static void main(String[] args){
            
        Scanner input = new Scanner (System.in);

        double netIncome, savingsBondTotal, payRate, hoursWorked, moneyRemaining,
                moneySpent;
        
        System.out.println("Input your hourly pay rate: ");
        payRate = input.nextDouble();
        System.out.println();
        
        System.out.println("Input number of hours you worked each week: ");
        hoursWorked = input.nextDouble();
        System.out.println();
        
        System.out.println("Your gross pay is $" + ((payRate * hoursWorked) * 5) );
        
        netIncome = ((payRate * hoursWorked) * .86) * 5;
        System.out.println("Your net income is $" + netIncome);
        
        //money on clothing and accessories
        moneySpent = netIncome * .10;
        System.out.println("You spent $" + moneySpent + " on clothing and accessories");
        
        //money on school supplies
        moneySpent = netIncome * .01;
        System.out.println("You spent $" + moneySpent + " on school supplies");
        
        //money remaining from initial 11% and 25% spent on remaining income for bonds
        moneyRemaining = netIncome * .89;
        moneySpent = moneyRemaining * .25;
        System.out.println("You spent $" + moneySpent + " on savings bonds");
        
        //money parents spent on bonds
        moneySpent = moneySpent / 2;
        System.out.println("You parents spent $" + moneySpent + " on savings bonds.");
        
    }
    
}
