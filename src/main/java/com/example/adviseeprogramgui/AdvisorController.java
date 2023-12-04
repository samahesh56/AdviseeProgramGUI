package com.example.adviseeprogramgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdvisorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}