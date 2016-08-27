package lab3;

/*
 * Class: CSIT1510 Introduction to Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to calculate and print out a bill
for customers of a cellular telephone company. There will be regular and premium
rates, and the charges are based on the length of the calls and the times calls
where made.
For Regular service: rate is $10. First 50 minutes are free with minutes after
50 are $.20 per minute.
For Premium service: rate is $25.00. 
    a. Calls between 6:00 am and 6:00 pm, the intial 75 min is free with minutes
       beyond that is $.10 per minute.
    b. Calls between 6:00 pm to 6:00 am, the intial 100 minutes are free and 
       minutes beyond that are $.05 per minute.
* Due: 10/21/2014
* Programmer: Vince Sparks
* Assignment: Lab3b, Chapters 3,4,5
* Alogrithim:
  Prompt user for accountNumber
  Prompt user for serviceCode

  switch(serviceCode)
{case r:
 case R:
    Prompt user for minutesUsed
    Calculate bill
case p:
case P:
    Prompt user for minutesUsed dayTime 
    Prompt user for minutesUsed nightTime
    Cacluate bill
default:
    Display error message
}
Display total bill to user

*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class CellularTelephoneCompany {
   public static void main(String[] args){
       
       final int PREMDAYFREE = 75, PREMNIGHTFREE = 100, PREMIUMRATE = 25,
                 REGFREEMIN = 50, REGULARRATE = 10;
       final double PREMDAYCHARGE = .10, PREMNIGHTCHARGE = .05, 
                    REGULARCHARGE = .20; 
       String tmpString;
       char serviceCode;
       double minutesUsed = 0, totalBill = 0, dayTimeMin = 0, nightTimeMin = 0;
       int accountNumber;
       Scanner input = new Scanner(System.in);
       DecimalFormat fmt = new DecimalFormat ("0.00"); 
       DecimalFormat min = new DecimalFormat ("0.##");
       
        //Prompt user for accountNumber
        //Prompt user for serviceCode
       System.out.print("Please enter your account number: ");
       accountNumber = input.nextInt();
       System.out.print("Please enter your service type(r for regular "
               + "and p for premium.): ");
       tmpString = input.next();
       serviceCode = tmpString.charAt(0);


  switch(serviceCode)
  {
 case 'r':
 case 'R':
    //Prompt user for minutesUsed
      System.out.print("Please enter amount of minutes used: ");
      minutesUsed = input.nextDouble();
      
    if(minutesUsed <= REGFREEMIN){
        totalBill = REGULARRATE;
    }
    else if(minutesUsed > REGFREEMIN){
        totalBill = REGULARRATE + ((minutesUsed - REGFREEMIN) * REGULARCHARGE);
    }
    else{
        System.out.println("Sorry you have entered an invalid number of "
                                                                + "minutes.");
        totalBill = 0;
    }
    
      break;
 case 'p':
 case 'P':
         //Prompt user for minutesUsed dayTime 
         //Prompt user for minutesUsed nightTime
         System.out.print("Please enter minutes used between 6:00 AM"
                                                            + " to 6:00 PM: ");
         dayTimeMin = input.nextDouble();
         
         System.out.print("Please enter minutes used between 6:00 PM to "
                                                              + "6:00 AM: ");
         nightTimeMin = input.nextDouble();
         
    // Check for appropirate billing rates
    if(dayTimeMin <= PREMDAYFREE){
        if(nightTimeMin <= PREMNIGHTFREE){
             totalBill = PREMIUMRATE;
        }
        if(nightTimeMin > PREMNIGHTFREE){
             totalBill = PREMIUMRATE + ((nightTimeMin - PREMNIGHTFREE) * 
                                                            PREMNIGHTCHARGE);
        }
    }
    
    else if(dayTimeMin > PREMDAYFREE){
         if(nightTimeMin <= PREMNIGHTFREE){
             totalBill = PREMIUMRATE + ((dayTimeMin - PREMDAYFREE) * 
                                                            PREMDAYCHARGE);
         }
    
         else if(nightTimeMin > PREMNIGHTFREE){
             totalBill = PREMIUMRATE + ((dayTimeMin - PREMDAYFREE) * 
                     PREMDAYCHARGE) + ((nightTimeMin - PREMNIGHTFREE) * 
                                                            PREMNIGHTCHARGE);
         }
    }
    
    else{
        System.out.println("Sorry you have entered an invalid service code");
        totalBill = 0;
    }
    break;
 default:     
    // Display error message
         System.out.println("Sorry you have entered an incorrect service type");
    //Set totalBill to 0 to clear trash
         totalBill = 0;
   
}
//Print out appropriate bill
switch(serviceCode){
    case 'r':
    case 'R':
        System.out.println("\n**********Cellular Telephone Company**********");
        System.out.println("-------------------------------------------------");
        System.out.println("Acct\tService\t   Total Minutes\tTotal Bill");
        System.out.println(accountNumber + "\tRegular\t       " 
                                         + min.format(minutesUsed) +
                                            "\t\t  " + fmt.format(totalBill));
       
    break;
    case 'p':
    case 'P':
        System.out.println("\n*********Cellular Telephone Company**********");
        System.out.println("---------------------------------------------");
        System.out.println("Acct\tService\t   Total Minutes\tTotal Bill");
        System.out.println(accountNumber + "\tPremium\t       " + 
                                min.format(nightTimeMin + dayTimeMin) +
                                        "\t\t  " + fmt.format(totalBill));
    break;
    default:   
    System.out.println(""); 
}

}
    
   }