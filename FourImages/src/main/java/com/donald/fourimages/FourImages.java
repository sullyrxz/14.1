package com.donald.fourimages;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;



/**
 * JavaFX App
 */
public class FourImages extends Application {

    @Override
    public void start(Stage primaryStage){
		
		GridPane pane = new GridPane();

		
		pane.add(new ImageView(new Image("C:\\Users\\mount\\OneDrive\\Documents\\Java\\FourImages\\src\\main\\java\\com\\donald\\fourimages\\download.gif")), 0, 0);
		pane.add(new ImageView(new Image("C:\\Users\\mount\\OneDrive\\Documents\\Java\\FourImages\\src\\main\\java\\com\\donald\\fourimages\\download1.gif")), 1, 0);
		pane.add(new ImageView(new Image("C:\\Users\\mount\\OneDrive\\Documents\\Java\\FourImages\\src\\main\\java\\com\\donald\\fourimages\\download2.gif")), 0, 1);
		pane.add(new ImageView(new Image("C:\\Users\\mount\\OneDrive\\Documents\\Java\\FourImages\\src\\main\\java\\com\\donald\\fourimages\\download3.gif")), 1, 1);

		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("fourImages"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch();
    }

}