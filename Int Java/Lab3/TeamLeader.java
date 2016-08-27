package Lab3;

/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a TeamLeader class
 * that inherits from the ProductionWorker class.  Each team leader has a hourly 
 * pay rate, monthly bonus, and hours of training per year. 
 * Due: 04/10/2015
 * Programmer: Vince Sparks
 * Assignment: TeamLeader.java
 */
public class TeamLeader extends ProductionWorker {
    /*
     Data Fields:
     double monthlyBonus: Holds fixed montly bonus of team leader
     double trainingAttended: Holds current training hours attended
     double trainingRequired: Holds required number of training hours
     */

    private double monthlyBonus, trainingAttended, trainingRequired;

    public TeamLeader() {
        this.monthlyBonus = 0;
        this.trainingAttended = 0;
        this.trainingRequired = 0;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public double getMontlyBonus() {
        return this.monthlyBonus;
    }

    public void setTrainingAttended(double trainingAttended) {
        this.trainingAttended = trainingAttended;
    }

    public double getTrainingAttended() {
        return this.trainingAttended;
    }

    public void setTrainingRequired(double trainingRequired) {
        this.trainingRequired = trainingRequired;
    }

    public double getTrainingRequired() {
        return this.trainingRequired;
    }

    public String toString() {
        String display = "Job Title: Team Leader\n";

        display = display + "Employee: " + this.getEmployeeName() + "\n"
                + "Employee Number:  " + this.getEmployeeNumber() + "\n"
                + "Hire Date: " + this.getHireDate() + "\n"
                + "Pay Rate:  $" + this.getPayRate() + "\n"
                + "Monthly Bonus: $" + this.getMontlyBonus() + "\n"
                + "Training Required: " + this.getTrainingRequired() + " hrs\n"
                + "Training Attended: " + this.getTrainingAttended() + " hrs\n";

        if (this.getShift() == 1) {
            display = display + "Shift: First\n";
        } else {
            display = display + "Shift: Second\n";
        }

        return display;
    }
}
