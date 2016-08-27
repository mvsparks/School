package Lab3;

/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create an employee class
 * that keeps employee name, number and hire date.  This program will be the 
 * super class that will be used to extend employee information to subclasses.
 * Due: 04/10/2015
 * Programmer: Vince Sparks
 * Assignment: Employee.java
 */
public class Employee {
    /*
     Data fields:
     String employeeName: Holds employees name
     String employeeNumber: Holds employee number in format xxx-L where each x
     is a digit from 0-9 and L is a letter between A-M
     String hireDate: Holds the hire date of employee
     */

    private String employeeName, employeeNumber, hireDate;
    private static Object[] workers = new Object[100];

    public Employee() {
        this.employeeName = "Null";
        this.employeeNumber = "Null";
        this.hireDate = "Null";
    }
    //Adding new employee to array
    public static void setEmployees(Object emp){
       
        int i = 0;
        boolean done = false;
        while (done != true && i < 99) {
            if (Employee.workers[i] != null) {
                i++;
            } else {
                Employee.workers[i] = emp;
                done = true;
            }
        }
    }
    //returning employee array
    public static Object[] getEmployees(){
        return workers;
    }
    //Setting employee name
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    //Returning employee name
    public String getEmployeeName() {
        return this.employeeName;
    }
    //Setting employee name
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    //Returning employee number
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }
    //Setting hire date
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    //returning hire date
    public String getHireDate() {
        return this.hireDate;
    }

    public String toString() {

        String display = "";

        return display;
    }
}
