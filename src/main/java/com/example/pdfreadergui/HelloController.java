package com.example.pdfreadergui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController extends HelloApplication {
    public ImageView maxImg;
    @FXML
    Button xBtn1, xBtn11;

    @FXML
    AnchorPane background;

    @FXML
    AnchorPane titlebar;

    private double x= 0;
    private double y= 0;

    @FXML
    private void anchorpane_dragged(MouseEvent event){
        Stage stage =  (Stage) titlebar.getScene().getWindow();
        stage.setY(event.getScreenY() - y);
        stage.setX(event.getScreenX() - x);
    }
    @FXML
    private void anchorpane_pressed(MouseEvent event){
        x = event.getSceneX();
        y = event.getSceneY();
    }


    @FXML
    private void exit(){
        System.exit(0);
    }

    @FXML
    private void Minimize_clicked(MouseEvent event) {
        Stage stage = (Stage) xBtn1.getScene().getWindow();
        stage.setIconified(true);
    }








}