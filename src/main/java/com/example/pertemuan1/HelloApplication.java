package com.example.pertemuan1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nomer1.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 400, 400);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nomer2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nomer3.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nomer4.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setTitle("Pertemuan1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}