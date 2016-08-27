package Lab1;

/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to program use methods to 
 * calculate number of gallons needed, hours of labor, labor charges and total
 * cost of the painting job.
 * Due: 02/13/2015
 * Programmer: Vince Sparks
 * Assignment: PaintJobEstimator lab1b
*/
import java.text.DecimalFormat;
import java.util.Scanner;


public class PaintJobEstimator {
    
    public static void main(String[] args){
    
        final int FOREVERYSQFT = 115, LABORPERHOUR = 18;
        int numRooms, gallonsNeeded;
        double squareFeet, pricePerGallon, totalCost, paintCost, 
                hoursRequired, laborCost;
        
  
        numRooms = getRooms();
        squareFeet = getSquareFeet(numRooms);
        pricePerGallon = getPricePerGallon();
        paintCost = getPaintCost(squareFeet, pricePerGallon, FOREVERYSQFT);
        gallonsNeeded = getGallonsNeeded(squareFeet, FOREVERYSQFT);
        hoursRequired = getHoursRequired(squareFeet, FOREVERYSQFT);
        laborCost = getLaborRequired(squareFeet, FOREVERYSQFT, LABORPERHOUR);
        totalCost = getTotalCost(laborCost, gallonsNeeded, pricePerGallon);
        displayResults(numRooms, squareFeet, paintCost, gallonsNeeded,
                         hoursRequired, laborCost, totalCost);
        
    }
    //method for getting number of rooms for job
    public static int getRooms() {
        int numRooms;
        Scanner input = new Scanner(System.in);
        
           System.out.println("Please enter the number of rooms ");
           numRooms = input.nextInt();
           if(numRooms <= 0){
               System.out.println("That is not a valid number of rooms");
               return 0;
           }
           else{
               return numRooms;
           }
    }
    //method for getting total squarefeet
    public static double getSquareFeet(int rooms){
        double squareFeet = 0;
        Scanner input = new Scanner(System.in);
            for(int i=0; i<rooms; i++){
                System.out.println("Please enter the squarefoot of room " + (i+1));
                squareFeet += input.nextDouble();
                if(squareFeet <= 0){
                    System.out.println("That is not a valid number of squarefoot");
                    return 0;
                }
            }
        return squareFeet;
    }
    //method for getting price of paint per gallon
    public static double getPricePerGallon(){
        double pricePerGallon;
        Scanner input = new Scanner(System.in);
            System.out.println("Please enter the price of paint per gallon ");
            pricePerGallon = input.nextDouble();
            if(pricePerGallon <= 0){
                System.out.println("That is not a valid price of paint");
                return 0;
            }
            else{
                return pricePerGallon;
            }
    }
    //method for getting number of gallons needed for job
    public static int getGallonsNeeded(double squareFeet, int FOREVERYSQFT){
        double gallonsNeeded;
                gallonsNeeded = (squareFeet/FOREVERYSQFT);
                if(gallonsNeeded % 1 > 0){ //if gallons needed is not a whole
                    gallonsNeeded += 1;    //number round up to next gallon
                }
        return (int)gallonsNeeded;
    }
    //method for getting paint cost for job
    public static double getPaintCost(double squareFeet, double pricePerGallon,
                                                    int FOREVERYSQFT){
        double paintCost;
                paintCost = getGallonsNeeded(squareFeet, FOREVERYSQFT) *
                                                               pricePerGallon;
        return paintCost;
    }
    //method for get total hours required for job
    public static double getHoursRequired(double squareFeet, int FOREVERYSQFT){
        double hoursRequired;
                hoursRequired = (getGallonsNeeded(squareFeet,FOREVERYSQFT) * 8);
        return hoursRequired;
    }
    //method for getting cost of labor for job
    public static double getLaborRequired(double squareFeet, int FOREVERYSQFT,
                                                            int LABORPERHOUR){
        double laborRequired;
 
                laborRequired = getHoursRequired(squareFeet, FOREVERYSQFT) * 
                                                                LABORPERHOUR;
        return laborRequired;
    }
    //method for calculating total cost of job
    public static double getTotalCost(double laborCost, int gallonsNeeded, 
                                                        double pricePerGallon){
        double totalCost;
            totalCost = laborCost + (gallonsNeeded * pricePerGallon);
        return totalCost;
    } 
    //method for showing totals
    public static void displayResults(int numRooms, double squareFeet, 
            double paintCost, int gallonsNeeded, double hoursRequired, 
            double laborCost, double totalCost){
        
         DecimalFormat dollar = new DecimalFormat ("$0.00"); 
         DecimalFormat dec = new DecimalFormat ("0.##");
    
         System.out.println("Paint Job Estimator\n"
                 + "Number of Rooms:\t" + numRooms
                 + "\nTotal Square Feet:\t" + dec.format(squareFeet) + "sq ft"
                 + "\nGallons Needed:\t\t" + gallonsNeeded
                 + "\nHours of Labor:\t\t" + dec.format(hoursRequired)
                 + "\nLabor Cost:\t\t" + dollar.format(laborCost)
                 + "\nTotal Cost of Job:\t" + dollar.format(totalCost));
    }
}
