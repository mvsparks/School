package Lab3;

/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a employee production
 * worker that inherits from the Employee class.  Each production worker will 
 * have a shift and a hourly pay rate.
 * Due: 04/10/2014
 * Programmer: Vince Sparks
 * Assignment: ProductionWorker.java
 */
public class ProductionWorker extends Employee {

    /*
     Data Fields:
     int shift: Holds the shift number of each productoin worker. 1 for day shift
     and 2 for night shift
     double payRate: Holds hourly pay rate of each production worker
     */
    private int shift;
    private double payRate;

    public ProductionWorker() {
        this.shift = 0;
        this.payRate = 0;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getShift() {
        return this.shift;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public String toString() {
        String display = "Job Title: Production Worker\n";

        display = display + "Employee: " + this.getEmployeeName() + "\n"
                + "Employee Number: " + this.getEmployeeNumber() + "\n"
                + "Hire Date: " + this.getHireDate() + "\n"
                + "Pay Rate:  $" + this.getPayRate() + "\n";
        if (this.getShift() == 1) {
            display = display + "Shift: First\n";
        } else {
            display = display + "Shift: Second\n";
        }

        return display;
    }
}
