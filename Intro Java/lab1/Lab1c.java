package lab1;
/*
 * Class: CSIT1510 Introduction to Java Programming 
 * Instructor: Gitti Negahban
 * Description: The purpose of this program is to display a table of three
   students and their scores.  In this program there is use of escape sequences
   along with declaring variables and assigment statements.
 * Due: 09/10/2014
 * Programmer: Vince Sparks
 * Assignment: Lab1c, Chapters 1,2
  */


public class Lab1c {
    public static void main(String[] args) {
        int LabScore, BonusScore, TotalScore;
        
        System.out.println("///////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                "      ==Student Points==\n" + "///////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Name\tLab\tBonus\tTotal\n----\t---\t-----\t-----");
        LabScore = 79;
        BonusScore = 8;
        TotalScore = LabScore + BonusScore;
        System.out.println("Bill\t" + LabScore + "\t" + BonusScore + "\t" + TotalScore);
        LabScore = 43;
        BonusScore = 4;
        TotalScore = LabScore + BonusScore;
        System.out.println("Geoff\t" + LabScore + "\t" + BonusScore + "\t" + TotalScore);
        LabScore = 34;
        BonusScore = 5;
        TotalScore = LabScore + BonusScore;
        System.out.println("John\t" + LabScore + "\t" + BonusScore + "\t" + TotalScore);
    }
    
}
