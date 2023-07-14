package com.example.oop2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void welcomeMenu(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("welcomeMenu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void registerMenu(ActionEvent event) throws IOException
    {
        root=FXMLLoader.load(getClass().getResource("registerMenu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
