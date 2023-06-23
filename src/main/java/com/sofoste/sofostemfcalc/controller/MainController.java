package com.sofoste.sofostemfcalc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onStartBtnClick() {
        welcomeText.setText("Welcome to Multi-Function-Calculator [MFC]!");
    }
}