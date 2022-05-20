module com.example.l18 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.l18 to javafx.fxml;
    exports com.example.l18;
}