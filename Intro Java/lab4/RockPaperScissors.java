package lab4;

/*
 * Class: CSIT1510 Introduction to Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a rock, paper, scissors
game.  We are to prompt the user after the computer has generated a pick without
showing the answer then display the results.  We are to ask user if they want to 
play again.  We are to use methods and keep up with the score between user and 
computer.
* Due: **************
* Programmer: Vince Sparks
* Assignment: Lab4, Chapters 5,6
*/
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        int compSelection, userSelection, userWin = 0, userLoss = 0, userTie = 0,
                theResults = 0;
        char userRepeat;
        Scanner input = new Scanner(System.in);
        Random randNum = new Random();
        
        //display welcome message
        UserWelcome();
    do{   
        //display instructions
        UserInstructions();
        //creating random for comp selection
        compSelection = CompInput(randNum);
        //prompting user for selection
        userSelection = UserInput(input);
        //testing results
        theResults = GameResults(compSelection, userSelection);
        //checking for win, loss, or tie
        if(theResults == 1){
            userWin++;
        }
        else if(theResults == 2){
            userLoss++;
        }
        else if(theResults == 3){
            userTie++;
        }
        else{
            System.out.println("Please try again.");
        }
        //display total wins, losses, and ties
        System.out.println("Wins: " + userWin + "\nLoss: " + userLoss +
                "\nTies: " + userTie);
        //prompting user to do again
        System.out.println("Do you want to try again? (Y or N): ");
        userRepeat = input.next().charAt(0);
    }while(userRepeat == 'y' || userRepeat == 'Y');
    
    }
//method for welcome message
public static void UserWelcome(){
System.out.print("Welcome to the Rock, Paper, Scissors game.\n"
            + "In this game you will select either rock, paper, or "
            + "scissors.\n");
}
//method for displaying intructions to user
public static void UserInstructions(){
    System.out.println("Rock beats scissors, paper beats rock, and scissors "
            + "beats paper\n"
            + "Please enter your selection with number 1,2 or 3:\n"
            + "1. Rock\n2. Paper\n3. Scissors\n"
            + "Which do you choose:");
    
    }
//method for creating computer random selection
public static int CompInput(Random randNum){
    int x;
    x = randNum.nextInt(3)  + 1;
    return x;
}
//method for getting user selection
public static int UserInput(Scanner input){ 
    int x;
    x = input.nextInt();
    return x;
}
//method for testing the two selections and returning results of win,loss or tie
public static int GameResults(int compSel, int userSel){
    
    int win = 1, loss = 2, tie = 3, none = 0;
    
    switch(compSel){
        case 1:
            System.out.println("Computer selected Rock.");
          if(userSel == 1){
                System.out.println("You selected Rock. It's a tie.");
                return win;
            }
            else if(userSel == 2){
                System.out.println("You selected Paper. You Won!");
                return tie;
            }
            else if(userSel == 3){
                System.out.println("You selected Scissors. Computer Wins.");
                return loss;
            }
            
            else{
                System.out.println("Sorry your selection was invalid.");
                return none;
            }
        case 2:
            System.out.println("Computer selected Paper.");
            if(userSel == 1){
                System.out.println("You selected Rock. Computer Wins.");
               return loss;
            }
            else if(userSel == 2){
                System.out.println("You Selected Paper. It's a tie");
               return tie;
            }
            else if(userSel == 3){
                System.out.println("You selected Scissors. You Won!");
               return win;
            }
            else{
                System.out.println("Sorry your Selection was Invalid");
                return none;
            }
        case 3:
            System.out.println("Computer Selected Scissors");
            if(userSel == 1){
                System.out.println("You selected Rock. You Won!");
                return win;
            }
            else if(userSel == 2){
                System.out.println("You selected Paper. Computer Wins.");
                return loss;
            }
            else if(userSel == 3){
                System.out.println("You selected Scissors. It's a tie");
                return tie;
            }
            else{
                System.out.println("Sorry your selection was invalid.");
                return none;
            }
        default:
            System.out.println("Computer selected an invalid entry.");
           return none;
    }   
        
}


}
