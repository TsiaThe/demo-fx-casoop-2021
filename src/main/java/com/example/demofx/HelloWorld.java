package com.example.demofx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorld extends Application {

    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader((HelloWorld.class.getResource("hello-fxml-application-view.fxml")));
        Scene scene = new Scene(fxmlLoader.load(),320,240);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setTitle("Hello Fxml");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){
        launch();
    }
}