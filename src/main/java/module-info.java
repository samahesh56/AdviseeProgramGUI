module com.example.adviseeprogramgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adviseeprogramgui to javafx.fxml;
    exports com.example.adviseeprogramgui;
}