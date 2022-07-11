package com.example.pertemuan1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private TextField bilangan1;
    @FXML
    private TextField bilangan2;
    @FXML
    private Label labelHasil;
    @FXML
    private TextField hasil;

    @FXML
    protected void onPlus() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        hasil.setText(String.valueOf(bil1 + bil2));
    }
    @FXML
    protected void onMin() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        hasil.setText(String.valueOf(bil1 - bil2));
    }
    @FXML
    protected void onTimes() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        hasil.setText(String.valueOf(bil1 * bil2));
    }
    @FXML
    protected void onSlash() {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        hasil.setText(String.valueOf(bil1 / bil2));
    }
}