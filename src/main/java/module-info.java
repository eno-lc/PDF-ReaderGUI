module com.example.pdfreadergui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pdfreadergui to javafx.fxml;
    exports com.example.pdfreadergui;
}