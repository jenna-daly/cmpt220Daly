/**
 * file: Test4.java
 * author: Jenna Daly
 * course: CMPT 220
 * assignment: Project 2
 * due date: May 3, 2017
 * version: 1.3
 * 
 * This file contains the declaration of the 
 * Test4 abstract data type.
 */

/**
 * Test4
 * 
 * This class implements a pop up window that represents a pre set line of text
 * that the user can use radio buttons to change the color of or checkboxes
 * to bold and/or italicize.
 */

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Test4 extends Application {
  //pre set text message
  protected Text text = new Text(30, 30, "~~This is my final project!!(ツ)_/¯~~ A text editor.");
  protected CheckBox chkBold = new CheckBox("Bold");
  protected CheckBox chkItalic = new CheckBox("Italicize");
  @Override

    public void start(Stage primaryStage) {
      //sets the way text will appear given each checked effect
      Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
      Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
      Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
      Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);
      //sets original font as normal/ no checked boxes
      text.setFont(fontNormal);
      HBox paneForCheckBoxes = new HBox(20);
      paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
      paneForCheckBoxes.setStyle("-fx-border-color: green");
      paneForCheckBoxes.setAlignment(Pos.CENTER);
      paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
      
      //Responses to boxes checked
      EventHandler<ActionEvent> handler = e -> {
        if(chkBold.isSelected() && chkItalic.isSelected()) {
          text.setFont(fontBoldItalic);
        }
        else if (chkBold.isSelected()) {
          text.setFont(fontBold);
        }
        else if(chkItalic.isSelected()) {
          text.setFont(fontItalic);
        }
        else {
          text.setFont(fontNormal);
        }
      };
	
      chkBold.setOnAction(handler);
      chkItalic.setOnAction(handler);

      //radio buttons for color choice
      HBox paneForRadioButtons = new HBox(20);
      paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
      paneForRadioButtons.setStyle("-fx-border-color: green");
      paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color:green");
      RadioButton rbRed = new RadioButton("Red");
      RadioButton rbBlue = new RadioButton("Blue");
      RadioButton rbGreen = new RadioButton("Green");
      RadioButton rbBlack = new RadioButton("Black");
      RadioButton rbPurple = new RadioButton("Purple");
      paneForRadioButtons.getChildren().addAll(rbRed, rbBlue, rbGreen, rbBlack, rbPurple);

     //groups the radio buttons
     ToggleGroup group = new ToggleGroup();
     rbRed.setToggleGroup(group);
     rbBlue.setToggleGroup(group);
     rbGreen.setToggleGroup(group);
     rbBlack.setToggleGroup(group);
     rbPurple.setToggleGroup(group);

     BorderPane pane = new BorderPane();
     Pane paneForText = new Pane();
     paneForText.setStyle("-fx-border-color: black");
     paneForText.getChildren().add(text);
     pane.setCenter(paneForText);
     pane.setBottom(paneForCheckBoxes);
     pane.setTop(paneForRadioButtons);

     //Colors text based on when the button is activated
     rbRed.setOnAction(e -> {
      if (rbRed.isSelected()) { //isSelected() method fires action
        text.setFill(Color.RED);
      }
    });

     rbBlue.setOnAction(e -> {
       if (rbBlue.isSelected()) {
         text.setFill(Color.BLUE);
       }
    });

     rbGreen.setOnAction(e -> {
       if (rbGreen.isSelected()) {
         text.setFill(Color.GREEN);
       }
    });

     rbBlack.setOnAction(e -> {
       if (rbBlack.isSelected()) {
         text.setFill(Color.BLACK);
       }
    });

     rbPurple.setOnAction(e -> {
       if (rbPurple.isSelected()) {
         text.setFill(Color.PURPLE);
       }
    });
    
    //creates a scene for program to run out of
    Scene scene = new Scene(pane, 550, 100);
    primaryStage.setTitle("Text Editor"); //title
    primaryStage.setScene(scene); //places scene on stage
    primaryStage.show();

  }
}