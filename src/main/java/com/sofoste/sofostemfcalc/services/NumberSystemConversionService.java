package com.sofoste.sofostemfcalc.services;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class NumberSystemConversionService {

    @FXML
    public void backToMainMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/mainMenu.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
