package com.avinash.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Modul2FormController {


    public TextField length;
    public TextField width;
    public TextField radius;
    public TextField height;
    boolean Square = false;
    boolean Ball = false;
    boolean Tube = false;
    double Length;
    double Width;
    double Radius;
    double Height;
    double area;
    double vol;


    public void SquareAction(ActionEvent actionEvent) {
        length.setText("");
        width.setText("");
        radius.setText("");
        height.setText("");
        Square = true;
        Ball = false;
        Tube = false;
        length.setDisable(false);
        width.setDisable(false);
        radius.setDisable(true);
        height.setDisable(true);
    }

    public void BallAction(ActionEvent actionEvent) {
        length.setText("");
        width.setText("");
        radius.setText("");
        height.setText("");
        Square = false;
        Ball = true;
        Tube = false;
        length.setDisable(true);
        width.setDisable(true);
        radius.setDisable(false);
        height.setDisable(true);
    }

    public void TubeAction(ActionEvent actionEvent) {
        length.setText("");
        width.setText("");
        radius.setText("");
        height.setText("");
        Square = false;
        Ball = false;
        Tube = true;
        length.setDisable(true);
        width.setDisable(true);
        radius.setDisable(false);
        height.setDisable(false);
    }

    public void Submit(ActionEvent actionEvent) {
        if (Square == true) {
            Length = Double.parseDouble(length.getText());
            Width = Double.parseDouble(width.getText());
            area = Length * Width;
            vol = 2 * (Length + Width);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Message");
            alert.setHeaderText("Message");
            alert.setContentText("Surface Area = " + area + "," + "Volume = " + vol);
            alert.show();

        }
        else if (Ball == true) {
            Radius = Double.parseDouble(radius.getText());
            area = 4 * Math.PI * Math.pow(Radius, 2);
            vol = (4.0 / 3.0) * Math.PI * Math.pow(Radius, 3);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Message");
            alert.setHeaderText("Message");
            alert.setContentText("Surface Area = " + area + "," + "Volume = " + vol);
            alert.show();
        }
        else if (Tube == true) {
            Radius = Double.parseDouble(radius.getText());
            Height = Double.parseDouble(height.getText());
            area = 2 * Math.PI * Radius * Height + 2 * Math.PI * (Radius * Radius);
            vol = Math.PI * (Radius * Radius) * Height;
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Message");
            alert.setHeaderText("Message");
            alert.setContentText("Surface Area = " + area + "," + "Volume = " + vol);
            alert.show();
        }

    }
}

