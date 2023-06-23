package com.sofoste.sofostemfcalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Multi-Function-Calculator!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public interface CalculatorService {
        double calculate(double num1, double num2);
    }

    public class BasicCalculatorService implements CalculatorService {
        @Override
        public double calculate(double num1, double num2) {
            // implement basic calculator functionality here
            return 0;
        }
    }
}