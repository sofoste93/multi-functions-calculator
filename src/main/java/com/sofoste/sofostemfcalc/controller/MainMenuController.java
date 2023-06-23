package com.sofoste.sofostemfcalc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainMenuController {

    @FXML
    public void loadBasicCalculator(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/basicCalculator.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loadAdvancedCalculator(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/advancedCalculator.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loadNumberSystemConverter(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/numberSystemConversion.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loadTextBinaryConversion(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/textBinaryConversion.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loadUnitConversion(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/unitConversion.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loadLearnMore(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/learnMore.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
