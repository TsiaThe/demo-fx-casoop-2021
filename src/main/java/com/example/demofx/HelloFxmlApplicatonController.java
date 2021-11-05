package com.example.demofx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;

public class HelloFxmlApplicatonController {

    @FXML
    private BorderPane boarderPane;

    @FXML
    private void OnNew(ActionEvent actionEvent) {
        TextArea textArea = new TextArea("Hallo Velo");
        boarderPane.setCenter(textArea);
    }

    @FXML
    private void onClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    private void onLayout(ActionEvent actionEvent) {
    }

    private void createToolbarPane() {
    }

    public void onAbout(ActionEvent actionEvent) {
        /*
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
        alert.showAndWait();
         */

        WebView browser = new WebView();
        browser.getEngine().load("https://www.google.ch/?hl=de");
        boarderPane.setCenter(browser);


    }
}
