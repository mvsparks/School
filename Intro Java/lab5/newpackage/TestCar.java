package lab5.newpackage;
import java.util.*;

/*
 * Class: CSIT1510 Introduction to Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to display the speed
 * of a car along with the make and year.  We are to create a constructor
 * that accepts the car year, speed, and make. Then prompt user for a make and
 * year of the car.  We are to use mutators to set the values of the car's
 * year, make and speed then use accessors and a toString to display information
 * about the car.
* Due: 12/2/2014
* Programmer: Vince Sparks
* Assignment: Lab5
*/
public class TestCar {
    public static void main(String[] args){
        int carYear = 0;
        int carSpeed = 0;
        String carMake = "NULL";
        Scanner input = new Scanner(System.in);
        Car newCar = new Car(carYear, carMake, carSpeed);
        
        //prompt user for the car make and car year
        System.out.println("Please enter your car's make ");
        carMake = input.nextLine();
        System.out.println("Please enter you car's year ");
        carYear = input.nextInt();
        
        //call mutators to set car make, year and speed
        newCar.setCarMake(carMake);
        newCar.setCarYear(carYear);
        newCar.setCarSpeed(carSpeed);
        
        System.out.println(newCar);
        //call accelerate method three times
        for(int i=0; i < 3; i++){
            newCar.carAccelerate();
            System.out.println(newCar.getCarYear() + "\t" + newCar.getCarMake()
                    + "\t" + newCar.getCarSpeed());
           
        }
        //call decelerate method three times
        for(int j=0; j < 3; j++){
            newCar.carDecelerate();
            System.out.println(newCar.getCarYear() + "\t" + newCar.getCarMake()
                    + "\t" + newCar.getCarSpeed());
        }
    }   
}
