
package LabQuiz;
/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to prompt and accept a password 
 * from the user and check whether the password is valid or not.
 * Due: 03/20/2015
 * Programmer: Vince Sparks
 * Assignment: Password.java
*/

public class PasswordVerifier {


// Constant for minimum password length
   public static final int MIN_PASSWORD_LENGTH = 8;

// isValid method checks whether all criteria is true  
// Return true if password has one uppercase and lowercase letter and a digit
// and false if not
   public static boolean isValid(String str)
   {
      boolean status; // Validity status

    //Check to see if password is valid(contains one digit, one lowercase, one uppercase
    // may use if statement
      if(hasUpperCase(str) == true && hasLowerCase(str) == true 
                                        && hasDigit(str) == true){
          status = true;
         // System.out.println("All true");
      }
      else{
          status = false;
      }
      
      return status;
   }

   /**
        hasUpperCase method
    */
// Checks whether the password contains at least one upercase letter
// Returns true if password has uppercase and false if not
   private static boolean hasUpperCase(String str)
   {
      boolean status = false; // Validity status

   // check to see if password contains at least one uppercase
   // may use a loop to check each character
      if(str.matches(".*[A-Z].*")){
          status = true;
         // System.out.println("Has uppercase");
      }
      else{
          status = false;
         // System.out.println("Not uppercase");
      }
      return status;
   }

// Checks whether the password contains at least one lowercase
// Returns true if password has lowercase and false if not
   private static boolean hasLowerCase(String str)
   {
      boolean status = false; // Validity status

     //check to see if password contains at least one lowercase
    //may use a loop to check each character 
      if(str.matches(".*[a-z].*")){
          status = true;
          // System.out.println("Has lowercase");
      }
      else{
          status = false;
          // System.out.println("Not lowercase");
      }
      return status;
   }

// Checking if the password contains at least one digit
// Returns true if there is a digit and false if not
   private static boolean hasDigit(String str)
   {
      boolean status = false; // Validity status

    //check to see if password contains at least one digit
   //may use a loop to check each character 
      if(str.matches(".*[\\d].*")){
          status = true;
         // System.out.println("Has digit");
      }
      else{
          status = false;
         // System.out.println("Not digit");
      }
      return status;
}
}