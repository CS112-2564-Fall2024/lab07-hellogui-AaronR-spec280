package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application implements EventHandler<ActionEvent>{ //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables

    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    //Start 2-9
    Button button;
    Button button2;
    Label label;
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello GUI: Aaron R.");

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout, 400, 400);
        //Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        //End step 2-9
        // primaryStage.setChildren();

//Start 10 - 29
        label = new Label();
        label.setText("Hello GUI World");

        layout.getChildren().add(label);

        AnchorPane anchorPane = new AnchorPane();

        anchorPane.setBottomAnchor(label, 0.0);
        anchorPane.setRightAnchor(label, 0.0);

        anchorPane.getChildren().add(label);
        layout.getChildren().add(anchorPane);

        button = new Button("Click Me!");
        anchorPane.setBottomAnchor(button, 0.0);
        anchorPane.setLeftAnchor(button, 0.0);
        anchorPane.getChildren().add(button);
        button.setOnAction(this);

        button2 = new Button("Second Button!");
        anchorPane.setBottomAnchor(button2, 100.0);
        anchorPane.setLeftAnchor(button2, 100.0);
        anchorPane.getChildren().add(button2);
        button2.setOnAction(this);






    }
    public void handle(ActionEvent e){
        if (e.getSource() == button) {
            label.setText("New Text");
        }
    }


}

    // TODO: follow steps 2-9 in README.md to create a start method
    /**PT1: Create a start method: public void start(Stage primaryStage) throws Exception{}
    Give our primary stage a title: primaryStage.setTitle(“Hello GUI: Your Name”);
    Create a layout: https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
    We're going to use StackPane: StackPane layout = new StackPane();
    Create a scene: Scene scene = new Scene(layout, 300, 300);
    Set our scene: primaryStage.setScene(scene);
    Show our scene: primaryStage.show();
    When it works, Commit and Push...**/

    // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)
     /**PT2: Add a label: Label label = new Label();
     Modify our label: label.setText(“Hello GUI World”);
     Add our label to the scene: layout.getChildren.add(label);
     Create an AnchorPane: AnchorPane anchorPane = new AnchorPane();
     Position our label 1: anchorPane.setBottomAnchor(label, 0.0);
     Position our label 2: anchorPane.setRightAnchor(label, 0.0);
     Add our label to the anchor: anchorPane.getChildren().add(label);
     Replace our label with the anchor: layout.getChildren().add(anchorPane);
     When it works, Commit and Push...
     PT3: Add another label and two buttons, placing one in each corner
     Follow good GUI wireframe design, placing text on the top, and buttons on the bottom
     When it works, Commit and Push...**/

    // TODO: follow steps 22-34 in README.md to create an event handler
     /**PT4: Adding functionality
     Implement event handler: implements EventHandler
     Add the method header: public void handle(ActionEvent actionEvent) {}
     Add class reference variables to your buttons and labels
     Check for button press: if(actionEvent.getSource() == button) {} // replace button with the name you gave it
     On button press, change the text of a label: label.setText("New Text!"); // replace label with the name you gave it
     When it works, Commit and Push...
     Add support for your second button, have this one count button presses and display them on the second label
     When it works, Commit and Push...
     Add a text field in the center of your layout
     Modify your first button so that when it is pressed, any entered text will be set as the text on your first label
     When it works, Commit and Push...
     If you have free time, experiment with your layout! But only Commit and Push if you really like it!**/