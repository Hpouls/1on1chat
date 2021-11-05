module com.example.messageappclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messageappclient to javafx.fxml;
    exports com.example.messageappclient;
}