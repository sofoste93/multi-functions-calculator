module com.sofoste.sofostemfcalc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sofoste.sofostemfcalc.services to javafx.fxml;
    exports com.sofoste.sofostemfcalc;
    opens com.sofoste.sofostemfcalc to javafx.fxml;
    exports com.sofoste.sofostemfcalc.services;
    exports com.sofoste.sofostemfcalc.controller;
    opens com.sofoste.sofostemfcalc.controller to javafx.fxml;
}