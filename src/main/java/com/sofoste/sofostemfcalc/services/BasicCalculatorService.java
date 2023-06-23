package com.sofoste.sofostemfcalc.services;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class BasicCalculatorService implements Initializable {

    @FXML
    private TextField num1TextField, num2TextField;

    @FXML
    private ComboBox<String> operationComboBox;

    @FXML
    private Label resultLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        operationComboBox.getItems().addAll("Add", "Subtract", "Multiply", "Divide");
    }
    @FXML
    public void calculate(ActionEvent actionEvent) {
        double num1 = Double.parseDouble(num1TextField.getText());
        double num2 = Double.parseDouble(num2TextField.getText());
        String operation = operationComboBox.getValue();

        switch (operation) {
            case "Add":
                resultLabel.setText(String.valueOf(num1 + num2));
                break;
            case "Subtract":
                resultLabel.setText(String.valueOf(num1 - num2));
                break;
            case "Multiply":
                resultLabel.setText(String.valueOf(num1 * num2));
                break;
            case "Divide":
                if (num2 != 0) {
                    resultLabel.setText(String.valueOf(num1 / num2));
                } else {
                    resultLabel.setText("Error: Division by zero");
                }
                break;
            default:
                resultLabel.setText("Error: Invalid operation");
                break;
        }
    }

    @FXML
    public void backToMainMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sofoste/sofostemfcalc/mainMenu.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
