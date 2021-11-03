module com.example.aimsproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aimsproject to javafx.fxml;
    exports com.example.aimsproject;
}