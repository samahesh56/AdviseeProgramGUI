package com.example.adviseeprogramgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AdvisorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addressText;

    @FXML
    private TextField admitText;

    @FXML
    private ListView<?> attributeListview;

    @FXML
    private TextArea attributeTextArea;

    @FXML
    private TextField emailText;

    @FXML
    private TextField idText;

    @FXML
    private TextField majorText;

    @FXML
    private TextField nameText;

    @FXML
    private TextField phoneText;

    @FXML
    private ListView<?> studentListview;

    @FXML
    private TextField tuitonText;

    @FXML
    void clickAddButton(ActionEvent event) {

    }

    @FXML
    void clickDeleteButton(ActionEvent event) {

    }

    @FXML
    void clickEditButton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert addressText != null : "fx:id=\"addressText\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert admitText != null : "fx:id=\"admitText\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert attributeListview != null : "fx:id=\"attributeListview\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert attributeTextArea != null : "fx:id=\"attributeTextArea\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert emailText != null : "fx:id=\"emailText\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert idText != null : "fx:id=\"idText\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert majorText != null : "fx:id=\"majorText\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert nameText != null : "fx:id=\"nameText\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert phoneText != null : "fx:id=\"phoneText\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert studentListview != null : "fx:id=\"studentListview\" was not injected: check your FXML file 'advisor-view.fxml'.";
        assert tuitonText != null : "fx:id=\"tuitonText\" was not injected: check your FXML file 'advisor-view.fxml'.";

    }

}
