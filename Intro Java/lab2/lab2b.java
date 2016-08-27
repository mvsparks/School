/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;
import java.util.Scanner;

/*
 * Class: CSIT1510 Introduction to Java Programming 
 * Instructor: Gitti Negahban
 * Description: The purpose of this program is to understand the layout of a program
   and what must go before other statements.  We are to fix the syntax errors and fix
   the layout of the program so it can run.
 * Due: 09/29/2014
 * Programmer: Vince Sparks
 * Assignment: Lab2b, Chapters 2
  */
public class lab2b {
    
    public static void main(String [] args) {

        double width, length, area, perimeter;
        
        Scanner console = new Scanner (System.in);
       
        System.out.println("Enter the length: ");
        length = console.nextDouble();
        System.out.println();
        
        System.out.print("Enter the width: ");
        width = console.nextDouble();
        System.out.println();
        
        area = length * width;
        System.out.println("Area = " + area);
        
        perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);
        
    } 
}


    
