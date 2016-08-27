package lab5.newpackage;

/**
   The Car class holds data about a cell phone.
*/
public class Car {
    private int yearModel = 0;
    private String make = "NULL";
    private int speed = 0;
    
    /*
      No argument Constructor
   */
    public Car(){
    }
    
    /*
      Constructor with arguments
   */
    public Car(int carYear, String carMake, int carSpeed){
        yearModel = carYear;
        make = carMake;
        speed = carSpeed;
      }
    //Mutator to set car's year
    public void setCarYear(int carYear){
        if(carYear > 0){
            yearModel = carYear;
        }
    }
    //Mutator to set car make
    public void setCarMake(String carMake){
        make = carMake;
    }
    //Mutator to set car speed
    public void setCarSpeed(int carSpeed){
        speed = carSpeed;
    }
    //Method to increase car speed by 5 MPH
    public void carAccelerate(){
        if(speed >= 0)
            speed = speed + 5;
    }
    //Method to decrease car speed by 5 MPH
    public void carDecelerate(){
        if(speed >= 5)
            speed = speed - 5;
    }
    //accessor to get car year value
    public int getCarYear(){
        return yearModel;
    }
    //accessor to get car make value
    public String getCarMake(){
        return make;
    }
    //accessor to get car speed value
    public int getCarSpeed(){
        return speed;
    }
    //method to display car description
    public String toString()
   {
      String table;

      table = "Year" + "\t" + "Make" + "\t" + "Current Speed";

      return table;
   }
    }
