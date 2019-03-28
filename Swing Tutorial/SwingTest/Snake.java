import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.web.*;
import javafx.scene.input.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 06.07.2018
  * @author 
  */

public class Snake extends Application {
  // Anfang Attribute
  private Rectangle rectangle1 = new Rectangle();
  private Slider slider1 = new Slider(0, 100, 0);
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 284, 262);
    // Anfang Komponenten
    
    root.getChildren().add(rectangle1);
    rectangle1.setX(136);
    rectangle1.setY(112);
    rectangle1.setWidth(9);
    rectangle1.setHeight(9);
    slider1.setLayoutX(56);
    slider1.setLayoutY(48);
    slider1.setPrefHeight(20);
    slider1.setPrefWidth(140);
    root.getChildren().add(slider1);
    slider1.setShowTickLabels(true);
    slider1.setShowTickMarks(true);
    slider1.setOnKeyPressed(
      (event) -> {slider1_KeyPressed(event);} 
    );
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("Snake");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public Snake
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
    
  } // end of main
  
  public void slider1_KeyPressed(KeyEvent evt) {
    // TODO hier Quelltext einfügen

  } // end of slider1_KeyPressed

  // Ende Methoden
} // end of class Snake

