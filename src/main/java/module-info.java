module com.example.javamasterclass_section13_eventsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventsfx to javafx.fxml;
    exports com.example.eventsfx;
}