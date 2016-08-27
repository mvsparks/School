
package Lab4;

import static java.awt.SystemColor.text;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/*
 * Class: CSIT1520 Intermediate Java Programming 
 * Instructor: Ghitti Negahban
 * Description: The purpose of this program is to pull contents from a file
 * and split the data inside into a book name list and book price list.  The
 * display allows for selection of books to purchase and adds them to the cart.
 * When finished the program produces a reciept that shows everything chosen
 * and the total cost.
 * Due: 05/01/2015
 * Programmer: Vince Sparks
 * Assignment: Bookstore.java
 */
public class Bookstore extends Book {

    @Override
    public void start(Stage primaryStage) throws Exception {
        double[] bookCost;
        String[] bookName;
        String[] tempArray;

        Book book = new Book();
        book.setBookList();
        
        DecimalFormat fmt = new DecimalFormat("$#0.00");

        //List to split books from cost
        ArrayList<String> splitArray = new ArrayList();

        //creating arrays for data
        int size = book.getBookList().size();
        bookCost = new double[size * 2]; //array for book costs
        bookName = new String[size]; //array for book names
        tempArray = new String[size]; //array to separate book cost

        //array list to hold choices
        ArrayList<Integer> choicesArray = new ArrayList<>();
        //array list to hold book names
        ArrayList<String> selectedBooks = new ArrayList<>();
        int count = 0; //integer used for getting book cost from array
        
        for (int i = 0; i < book.getBookList().size(); i++) {

            tempArray[i] = (String) book.getBookList().get(i);
            
            //Splitting up array
            splitArray.addAll(Arrays.asList(tempArray[i].split(", ")));
            //  System.out.println("SplitArray: " + splitArray.get(i));
        }
        for (int i = 0; i < (book.getBookList().size() * 2); i++) {
            //Adding Book Cost to array
            if ((i + 1) % 2 == 0) {
                bookCost[count] = Double.parseDouble(splitArray.get(i));
                count++;
            }

        }
        count = 0;
        //Adding Book Name to array
        for (int j = 0; j < (book.getBookList().size() * 2); j++) {
            if (j % 2 == 0) {
                bookName[count] = splitArray.get(j);
                count++;

            }
        }

        book.setListView();
        //Setting size of listView
        book.listView.setPrefSize(250, 400);
        //Setting selection mode in list view
        book.listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //Button to add book to cart
        Button btAdd = new Button("Add to Cart");
        //Button to clear books from cart
        Button btClear = new Button("Clear Cart");
        //Button to remove one book from cart
        Button btRemove = new Button("Remove");
        //Button to checout
        Button btCheckout = new Button("Checkout");
        //Gridpane for subtotal section

        GridPane pane2 = new GridPane();
        pane2.setAlignment(Pos.CENTER);

        TextField txSubtotal = new TextField();
        pane2.add(new Label("Subtotal: "), 0, 0);
        pane2.add(txSubtotal, 1, 0);

        //Handler for add to cart button
        btAdd.setOnAction(e -> {
            if (book.getListView().getSelectionModel().getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(null, "Please select something to add to your cart.");
            } else {
                //adding choices to arrays
                choicesArray.addAll(book.listView.getSelectionModel().getSelectedIndices());
                selectedBooks.addAll(book.listView.getSelectionModel().getSelectedItems());
                book.cart.setItems(FXCollections.observableArrayList(selectedBooks));
                //updating subtotal
                book.setSubtotal(bookCost, choicesArray);
                txSubtotal.setText(String.valueOf(fmt.format(book.getSubtotal())));
                //Clearing selected items
                book.listView.getSelectionModel().clearSelection();
            }
        });

        //handler for remove selection from cart
        btRemove.setOnAction(e -> {
            try {
                //removing selected choices from arrays
                choicesArray.remove(book.cart.getSelectionModel().getSelectedIndex());
                selectedBooks.remove(book.cart.getSelectionModel().getSelectedIndex());
                book.cart.getItems().remove(book.cart.getSelectionModel().getSelectedIndex());
                //updating subtotal
                book.setSubtotal(bookCost, choicesArray);
                txSubtotal.setText(String.valueOf(fmt.format(book.getSubtotal())));
                //clearing cart selected items
                book.cart.getSelectionModel().clearSelection();

            } catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Please select something from your cart to remove.");
            }

        });

        //handler for clear cart button
        btClear.setOnAction(e -> {
            //Clearing all items out of cart
            book.cart.getItems().clear();
            //Clearing choices array list
            choicesArray.clear();
            selectedBooks.clear();
            book.setSubtotal(bookCost, choicesArray);
            txSubtotal.setText(String.valueOf(fmt.format(book.getSubtotal())));
        });

        BorderPane pane = new BorderPane();

        //Creating menu bar
        MenuBar menuBar = new MenuBar();

        //Creating menu tabs
        Menu menuFile = new Menu("File");
        Menu menuAbout = new Menu("Help");
        menuBar.getMenus().addAll(menuFile, menuAbout);

        //Creating menu subitems then adding them to appropriate menu tab
        MenuItem menuItemExit = new MenuItem("Exit");
        MenuItem menuItemAbout = new MenuItem("About");

        //Exit event handler
        menuItemExit.setOnAction(e -> {
            System.exit(0);
        });

        //About event handler
        menuItemAbout.setOnAction(e -> {
            JOptionPane.showMessageDialog(null, "Version 1.0");
        });

        menuFile.getItems().addAll(menuItemExit);
        menuAbout.getItems().addAll(menuItemAbout);

        //Creating vertical box for menu bar
        VBox menuBox = new VBox(5);
        menuBox.getChildren().addAll(menuBar);

        //Creating vertical box for buttons
        HBox hBbuttons = new HBox();
        hBbuttons.setSpacing(15);
        hBbuttons.getChildren().addAll(btClear, btRemove, btCheckout);

        //Creating vertical box for cart
        VBox vBoxRight = new VBox(5);
        vBoxRight.setPadding(new Insets(15, 15, 15, 15));
        vBoxRight.getChildren().addAll(book.cart, pane2, hBbuttons);

        //Creating vertical box for list
        VBox vBoxLeft = new VBox(5);
        vBoxLeft.setPadding(new Insets(15, 15, 15, 15));
        vBoxLeft.getChildren().addAll(book.listView, btAdd);

        //Setting up pane with toolbar and listviews
        pane.setTop(menuBox);
        pane.setLeft(vBoxLeft);
        pane.setRight(vBoxRight);

        //creating scene
        Scene scene = new Scene(pane, 600, 500);  
        Button okButton = new Button("Ok");
        
        

        btCheckout.setOnAction(e -> {
            this.toString(bookName, bookCost, choicesArray);
            primaryStage.close();
            Scene newScene = new Scene(this.gridPane, 600, 600);
            this.gridPane.getChildren().add(okButton);
            GridPane.setHalignment(okButton, HPos.CENTER);
            this.gridPane.autosize();
            primaryStage.setTitle("Order Review");
            primaryStage.setScene(newScene);
            primaryStage.show();
           
        });
        
        okButton.setOnAction(a ->{
            System.exit(0);
        });

        //Creating Stage
        primaryStage.setTitle("Book Store");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
