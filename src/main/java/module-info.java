module com.example.pertemuan1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pertemuan1 to javafx.fxml;
    exports com.example.pertemuan1;
}