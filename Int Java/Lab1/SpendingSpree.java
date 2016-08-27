package Lab1;

/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to program that tracks how much
 * money you are spending using a gift card up to $200.00.  The user must 
 * purchase less than four items. 
 * Due: 02/13/2015
 * Programmer: Vince Sparks
 * Assignment: PaintJobEstimator lab1a
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class SpendingSpree {
    
    public static void main(String[] args){
    
        final int GIFTCARD = 200, ITEMS = 3;
        int itemsPurchased = 0;
        double remainingAmount, itemCost;
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat ("0.00"); 
        
        System.out.println("Your giftcard balance is currently $" + 
                                                        fmt.format(GIFTCARD));
        remainingAmount = GIFTCARD;
        //looping until 3 items have been purchased
        while(itemsPurchased < 3){
        
             System.out.println("Please enter the price of the item you"
                                            + " wish to purchase ");
             itemCost = input.nextDouble();
             //checking is a valid number
             if (itemCost <= 0){
                 
                 System.out.println("I'm sorry that is an invalid price\n");
             }
             //checking if there is enough money left
             else if(itemCost > remainingAmount){
                 
                 System.out.println("You cannot purchase that item you only "
                         + " have $" + fmt.format(remainingAmount)
                         + " left on the card.\n");
             }
             //subtracting item cost from remaining balance
             else{
                 remainingAmount -= itemCost;
                 System.out.println("Your remaining balance is $" +
                          fmt.format(remainingAmount));
                 itemsPurchased++;
                 System.out.println("You can buy " + (ITEMS - itemsPurchased) + 
                                                            " more items.\n");
             }
            
        }
        
    
    }
}
