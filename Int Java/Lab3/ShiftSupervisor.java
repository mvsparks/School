package Lab3;
/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a shift supervisor 
 * class that inherits from Employee class. The shift supervisor will hold the
 * annual salary and annaul productoin bonus. 
 * Due: 04/10/2015
 * Programmer: Vince Sparks
 * Assignment: ShiftSupervisor
 */

public class ShiftSupervisor extends Employee {

    /*
     Data Fields:
     double annualSalary: Holds the annualSalary of the shift supervisor
     double bonus: Holds annual bonus of shift supervior
     */
    private double annualSalary, bonus;

    public ShiftSupervisor() {
        this.annualSalary = 0;
        this.bonus = 0;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public String toString() {
        String display = "Job Title: Shift Supervisor\n";
        display = display + "Employee: " + this.getEmployeeName() + "\n"
                + "Employee Number: " + this.getEmployeeNumber() + "\n"
                + "Hire Date: " + this.getHireDate() + "\n"
                + "Annual Salary: $" + this.getAnnualSalary() + "\n"
                + "Bonus: $" + this.getBonus() + "\n";

        return display;
    }
}
