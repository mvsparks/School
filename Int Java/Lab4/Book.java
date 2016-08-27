/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to create a book constructor
 * that creates a listview for the selection box in the display and a cart
 * listview.  The constructor also creates an arraylist that will hold contents
 * of a file that will be read in for the data.
 * Due: 05/01/2015
 * Programmer: Vince Sparks
 * Assignment: Book.java
 */
public class Book extends Application {

    private static double subtotal;
    ListView<String> listView;
    ListView<String> cart;
    ArrayList<String> bookList;
    ObservableList<Integer> removeItems;
    GridPane gridPane = new GridPane();

    public Book() {
        subtotal = 0;
        //list view for reading in input
        listView = new ListView<>();
        cart = new ListView<>();
        //Setting size of choices listview
        cart.setPrefSize(200, 400);
        //Setting selection mode of choices list view
        cart.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //Lists to read items from file 
        bookList = new ArrayList();
        removeItems = FXCollections.observableArrayList();
    }

    public void setBookList() throws FileNotFoundException {
        //Variable for input file
        File inputFile = new File("Bookprices.txt");
        Scanner input = new Scanner(inputFile);
        //Loading file into array
        while (input.hasNext()) {
            this.bookList.add(input.nextLine());
        }
    }

    public ArrayList<String> getBookList() {

        return this.bookList;

    }

    public void setListView() {

        ListView tmpList = new ListView<>(
                FXCollections.observableArrayList(this.getBookList()));
        this.listView = tmpList;
    }

    public ListView<String> getListView() {
        return this.listView;
    }

    public void setSubtotal(double[] bookCost, ArrayList<Integer> choices) {
        int size = this.getBookList().size();
        String[] tempArray = new String[size]; //array to separate book cost
        ArrayList<String> splitArray = new ArrayList();
        bookCost = new double[size * 2]; //array for book costs
        tempArray = new String[size]; //array to separate book cost
        int count = 0;
        double total = 0;

 
        for (int i = 0; i < this.getBookList().size(); i++) {

            tempArray[i] = (String) this.getBookList().get(i);

            //Splitting up array
            splitArray.addAll(Arrays.asList(tempArray[i].split(", ")));
        }
        for (int i = 0; i < (this.getBookList().size() * 2); i++) {
            //Adding Book Cost to array
            if ((i + 1) % 2 == 0) {
                bookCost[count] = Double.parseDouble(splitArray.get(i));
                count++;
            }
        }
        for (int i = 0; i < choices.size(); i++) {
            total = total + bookCost[choices.get(i)];
        }
        Book.subtotal = total;
    }
 
    public double getSubtotal() {
        return Book.subtotal;
    }

    public void toString(String[] bookName, double[] bookCost,
            ArrayList<Integer> choicesArray) {
        String displayLeft = "";
        String displayRight = "";
        String top = "";
        String bottom = "";
        TextArea topText = new TextArea();
        TextArea bottomText = new TextArea();
        TextArea leftText = new TextArea();
        TextArea rightText = new TextArea();
        int itemNumber = 0;

        DecimalFormat fmt = new DecimalFormat("$#0.00");

        top = "-------------------BookStore------------------";

        for (int i = 0; i < choicesArray.size(); i++) {
            itemNumber = choicesArray.get(i);
            displayLeft = displayLeft + bookName[itemNumber] + "\t" + bookCost[itemNumber] + "\n";
        }
        
        bottom = bottom + "\nSubtotal:                        " + fmt.format(subtotal) + "\n" +
                  "Sales tax                         9%\n\n" + "Total                                " 
                  + fmt.format(subtotal *  1.09);
        
        topText.setText(top);
        leftText.setText(displayLeft);
        bottomText.setText(bottom);
        
        this.gridPane.getChildren().addAll(topText,leftText);
        

    }

    @Override
    public void start(Stage stage) throws Exception {
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
