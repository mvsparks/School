package Lab3;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a GUI for Employee
 * program and also to handle loading objects into an array to display the list
 * of current employees.
 * Due: 04/10/2015
 * Programmer: Vince Sparks
 * Assignment: Display.java
 */

public class Display extends Application {

    public void start(Stage primaryStage) {
        
        ProductionWorker productionWorker = new ProductionWorker();
        ShiftSupervisor shiftSupervisor = new ShiftSupervisor();
        TeamLeader teamLeader = new TeamLeader();
        
        //Creating shift supervisor
        shiftSupervisor.setEmployeeName("Jim Henry");
        shiftSupervisor.setEmployeeNumber("124-B");
        shiftSupervisor.setHireDate("02/23/2000");
        shiftSupervisor.setAnnualSalary(50000.00);
        shiftSupervisor.setBonus(5000);
        //Adding shift supervisor to array
        Employee.setEmployees(shiftSupervisor);

        //Creating production worker
        productionWorker.setEmployeeName("John Smith");
        productionWorker.setEmployeeNumber("123-A");
        productionWorker.setHireDate("03/25/2005");
        productionWorker.setPayRate(15.50);
        productionWorker.setShift(1);
        //Adding production worker to array
        Employee.setEmployees(productionWorker);

        //Creating team leader
        teamLeader.setEmployeeName("Jane Smith");
        teamLeader.setEmployeeNumber("134-M");
        teamLeader.setHireDate("01/01/2009");
        teamLeader.setPayRate(20.50);
        teamLeader.setMonthlyBonus(500);
        teamLeader.setShift(2);
        teamLeader.setTrainingRequired(30.0);
        teamLeader.setTrainingAttended(15.5);
        //Adding team leader to array
        Employee.setEmployees(teamLeader);

        mainMenu();

    }

    //Main menu
    public void mainMenu() {
        Text text1 = new Text(0, 0, "Please choose an option:");
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.REGULAR, 15));

        // Create a pane and set its properties 
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.getChildren().add(text1);
        Stage newStage = new Stage();
        Scene scene = new Scene(pane);
        //Button to add shift supervisor
        Button btShiftSupervisor = new Button("Add Supervisor");
        pane.add(btShiftSupervisor, 0, 1);
        btShiftSupervisor.setOnAction(e -> {
            shiftSupervisorHandler();
            newStage.close();
        });
        //Button to add production worker
        Button btProdWorker = new Button("Add Production Worker");
        pane.add(btProdWorker, 1, 1);
        btProdWorker.setOnAction(e -> {
            productionWorkerHandler();
            newStage.close();
        });
        //Button to add another team leader
        Button btTeamLeader = new Button("Add Team Leader");
        pane.add(btTeamLeader, 0, 2);
        btTeamLeader.setOnAction(e -> {
            teamLeaderHandler();
            newStage.close();
        });
        //Button to display employees
        Button btShowEmployees = new Button("Show Employees");
        pane.add(btShowEmployees, 1, 2);
        btShowEmployees.setOnAction(e -> {
            Object[] emp = new Object[100];
            emp = Employee.getEmployees();
            int i = 0;
            while (emp[i] != null) {
                System.out.println(emp[i]);
                i++;
            }

            newStage.close();

        });
        //Stage setup
        newStage.setTitle("Employee Program"); // Set the stage title
        newStage.setScene(scene); // Place the scene in the stage
        newStage.show();
    }

    public void teamLeaderHandler() {

        TeamLeader teamLeader = new TeamLeader();

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        GridPane errorPane = new GridPane();
        errorPane.setAlignment(Pos.CENTER);
        errorPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        errorPane.setHgap(5.5);
        errorPane.setVgap(5.5);
        Scene scene = new Scene(pane);
        Stage newStage = new Stage();
        Text errorText = new Text(20, 20, "Incorrect Formatting. Please Check Data.");

        TextField empName = new TextField();
        TextField empNumber = new TextField();
        TextField hireDate = new TextField();
        TextField payRate = new TextField();
        TextField monthlyBonus = new TextField();
        TextField shift = new TextField();
        TextField trainingRequired = new TextField();
        TextField trainingAttended = new TextField();
        
        //Textfields for data
        pane.add(new Label("Employee Name:"), 0, 0);
        pane.add(empName, 1, 0);
        pane.add(new Label("Empoyee Number: (ex. 123-M)"), 0, 1);
        pane.add(empNumber, 1, 1);
        pane.add(new Label("Hire Date: (ex. 02/02/2000)"), 0, 2);
        pane.add(hireDate, 1, 2);
        pane.add(new Label("Pay Rate: (ex 9.50)"), 0, 3);
        pane.add(payRate, 1, 3);
        pane.add(new Label("Monthly Bonus: (ex 900)"), 0, 4);
        pane.add(monthlyBonus, 1, 4);
        pane.add(new Label("Shift: (1 for first, 2 for second)"), 0, 5);
        pane.add(shift, 1, 5);
        pane.add(new Label("Training Required: (In Hours)"), 0, 6);
        pane.add(trainingRequired, 1, 6);
        pane.add(new Label("Training Attended: (In Hours)"), 0, 7);
        pane.add(trainingAttended, 1, 7);
        
        //Button for main menu
        Button btMain = new Button("Main Menu");
        pane.add(btMain, 0, 8);
        GridPane.setHalignment(btMain, HPos.LEFT);
        
        //Main menu Handler
        btMain.setOnAction(e -> {
            mainMenu();
            newStage.close();
        });
        
        //Button for addding employees
        Button btAdd = new Button("Add Employee");
        pane.add(btAdd, 1, 8);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        
        //Add employee handler
        btAdd.setOnAction(e -> {
            if (empName.getText().matches("[a-zA-Z ]+")
                    && empNumber.getText().matches("[0-9]{3}-[A-Z]{1}")
                    && hireDate.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")
                    && payRate.getText().matches("[0-9]+.*[0-9]{0,2}")
                    && monthlyBonus.getText().matches("[0-9]+.*[0-9]{0,2}")
                    && shift.getText().matches("[1-2]{1}")
                    && trainingRequired.getText().matches("[0-9]+.*[0-9]{0,2}")
                    && trainingAttended.getText().matches("[0-9]+.*[0-9]{0,2}")) {
                teamLeader.setEmployeeName(empName.getText());
                teamLeader.setEmployeeNumber(empNumber.getText());
                teamLeader.setHireDate(hireDate.getText());
                teamLeader.setPayRate(Double.parseDouble(payRate.getText()));
                teamLeader.setMonthlyBonus(Double.parseDouble(monthlyBonus.getText()));
                teamLeader.setTrainingAttended(Double.parseDouble(trainingAttended.getText()));
                teamLeader.setTrainingRequired(Double.parseDouble(trainingRequired.getText()));
                teamLeader.setShift(Integer.parseInt(shift.getText()));
                
                //Adding new employee
                Employee.setEmployees(teamLeader);
                mainMenu();
                newStage.close();
            } 
            else {
                errorPane.getChildren().add(errorText);
                Button btOK = new Button("OK");
                errorPane.add(btOK, 1, 2);
                btOK.setOnAction(a -> {
                    mainMenu();
                    newStage.close();
                });
                newStage.setTitle("Error Message");
                Scene errorScene = new Scene(errorPane);
                newStage.setScene(errorScene);
                newStage.show();

            }
        });
        
        //Stage setup
        newStage.setTitle("Add Team Leader"); // Set the stage title
        newStage.setScene(scene); // Place the scene in the stage
        newStage.show();

    }

    //Production Worker Handler
    public void productionWorkerHandler() {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        Stage newStage = new Stage();
        Scene scene = new Scene(pane);
        ProductionWorker productionWorker = new ProductionWorker();
        GridPane errorPane = new GridPane();
        errorPane.setAlignment(Pos.CENTER);
        errorPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        errorPane.setHgap(5.5);
        errorPane.setVgap(5.5);
        Text errorText = new Text(20, 20, "Incorrect Format. Please Check Data Inputted.");
        Scene errorScene = new Scene(errorPane);

        TextField empName = new TextField();
        TextField empNumber = new TextField();
        TextField hireDate = new TextField();
        TextField payRate = new TextField();
        TextField shift = new TextField();
        
        //Textfields for data
        pane.add(new Label("Employee Name:"), 0, 0);
        pane.add(empName, 1, 0);
        pane.add(new Label("Empoyee Number: (ex. 123-M)"), 0, 1);
        pane.add(empNumber, 1, 1);
        pane.add(new Label("Hire Date: (ex. 02/02/2000)"), 0, 2);
        pane.add(hireDate, 1, 2);
        pane.add(new Label("Pay Rate: (ex 9.50)"), 0, 3);
        pane.add(payRate, 1, 3);
        pane.add(new Label("Shift: (1 for first, 2 for second)"), 0, 4);
        pane.add(shift, 1, 4);

        Button btMain = new Button("Main Menu");
        pane.add(btMain, 0, 5);
        GridPane.setHalignment(btMain, HPos.LEFT);
        btMain.setOnAction(e -> {
            mainMenu();
            newStage.close();
        });
        
        //Button for adding employee
        Button btAdd = new Button("Add Employee");
        pane.add(btAdd, 1, 5);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        
        //Add employee handler with error check
        btAdd.setOnAction(e -> {
            if (empName.getText().matches("[a-zA-Z ]+")
                    && empNumber.getText().matches("[0-9]{3}-[A-Z]{1}")
                    && hireDate.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")
                    && payRate.getText().matches("[0-9]+.*[0-9]{0,2}")
                    && shift.getText().matches("[1-2]{1}")) {
                productionWorker.setEmployeeName(empName.getText());
                productionWorker.setEmployeeNumber(empNumber.getText());
                productionWorker.setHireDate(hireDate.getText());
                productionWorker.setPayRate(Double.parseDouble(payRate.getText()));
                productionWorker.setShift(Integer.parseInt(shift.getText()));
                
                //Adding new employee
                Employee.setEmployees(productionWorker);
                mainMenu();
                newStage.close();
            } 
            else {
                errorPane.getChildren().add(errorText);
                Button btOK = new Button("OK");
                errorPane.add(btOK, 1, 2);
                btOK.setOnAction(a -> {
                    mainMenu();
                    newStage.close();
                });
                newStage.setTitle("Error Message");
                newStage.setScene(errorScene);
                newStage.show();
            }
        });
        
        //Stage setup
        newStage.setTitle("Add Production Worker"); // Set the stage title
        newStage.setScene(scene); // Place the scene in the stage
        newStage.show();
    }

    //Shift Supervisor Handler
    //Create a pane and accepts Employee Name, Employee Number, Hire Date,
    //Annual Salary and bonus.
    public void shiftSupervisorHandler() {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        TextField empName = new TextField();
        TextField empNumber = new TextField();
        TextField hireDate = new TextField();
        TextField annualSal = new TextField();
        TextField bonus = new TextField();
        ShiftSupervisor shiftSupervisor = new ShiftSupervisor();
        GridPane errorPane = new GridPane();
        errorPane.setAlignment(Pos.CENTER);
        errorPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        errorPane.setHgap(5.5);
        errorPane.setVgap(5.5);
        Text errorText = new Text(20, 20, "Incorrect Format. Please Check Data Inputted.");
        Scene errorScene = new Scene(errorPane);

        Stage newStage = new Stage();
        Scene scene = new Scene(pane);

        //Textfields for data
        pane.add(new Label("Employee Name:"), 0, 0);
        pane.add(empName, 1, 0);
        pane.add(new Label("Employee Number: (ex. 123-M)"), 0, 1);
        pane.add(empNumber, 1, 1);
        pane.add(new Label("Hire Date: (ex. 02/02/2000)"), 0, 2);
        pane.add(hireDate, 1, 2);
        pane.add(new Label("Annual Salary: (ex 90000)"), 0, 3);
        pane.add(annualSal, 1, 3);
        pane.add(new Label("Bonus: (ex 2000)"), 0, 4);
        pane.add(bonus, 1, 4);
        //Main Menu button
        Button btMain = new Button("Main Menu");
        pane.add(btMain, 0, 5);
        //Main Menu button handler
        btMain.setOnAction(e -> {
            mainMenu();
            newStage.close();
        });
        GridPane.setHalignment(btMain, HPos.LEFT);
        //Button to add employee to array
        Button btAdd = new Button("Add Employee");
        pane.add(btAdd, 1, 5);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        //Add employee handler
        btAdd.setOnAction(e -> {
            if (empName.getText().matches("[a-zA-Z ]+")
                    && empNumber.getText().matches("[0-9]{3}-[A-Z]{1}")
                    && hireDate.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")
                    && annualSal.getText().matches("[0-9]+.*[0-9]{0,2}")
                    && bonus.getText().matches("[0-9]+.*[0-9]{0,2}")) {
                shiftSupervisor.setEmployeeName(empName.getText());
                shiftSupervisor.setEmployeeNumber(empNumber.getText());
                shiftSupervisor.setHireDate(hireDate.getText());
                shiftSupervisor.setAnnualSalary(Double.parseDouble(annualSal.getText()));
                shiftSupervisor.setBonus(Double.parseDouble(bonus.getText()));
                //Adding new employee
                Employee.setEmployees(shiftSupervisor);
                mainMenu();
                newStage.close();
            } 
            else {
                errorPane.getChildren().add(errorText);
                Button btOK = new Button("OK");
                errorPane.add(btOK, 1, 2);
                btOK.setOnAction(a -> {
                    mainMenu();
                    newStage.close();
                });
                newStage.setTitle("Error Message");
                newStage.setScene(errorScene);
                newStage.show();
            }

        });
        //setting up stage
        newStage.setTitle("Add Shift Supervisor"); // Set the stage title
        newStage.setScene(scene); // Place the scene in the stage
        newStage.show();
    }

}
