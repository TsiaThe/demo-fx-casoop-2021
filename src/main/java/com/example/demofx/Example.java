package com.example.demofx;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Example extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.getChildren().add(createToolbarPane());
        Scene scene = new Scene(root, 240, 40);
        stage.setScene(scene);
        stage.setTitle("Hello World");
        stage.show();
    }

    private Pane createToolbarPane() {
        final HBox hbox = new HBox(5);
        hbox.setStyle("-fx-border-width: 2;-fx-border-color: red;");
        hbox.getChildren().addAll(new Text("TOP"),new Button("HBox1") ,new Button("HBox2"));
        return hbox;
    }
}
