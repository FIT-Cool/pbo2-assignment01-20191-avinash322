package com.avinash.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Modul1Formcontroller {

    public ImageView imageuser;
    public ImageView imagecomputer;
    public TextField jumlahwin;
    public TextField jumlahlose;
    public TextField jumlahdraw;
    public int draw =0;
    public int lose =0;
    public int win = 0;


    public void PaperAction(ActionEvent actionEvent) {

        imageuser.setImage(new Image("kertas.jpg"));
        int random =(int)(Math.random()*3+1);
        if(random==1){
            imagecomputer.setImage(new Image("kertas.jpg"));
            draw=draw+1;
            jumlahdraw.setText(String.valueOf(draw));
        }
        else if (random==2){
            imagecomputer.setImage(new Image("batu.jpg"));
            win=win+1;
            jumlahwin.setText(String.valueOf(win));
        }
        else if (random==3){
            imagecomputer.setImage(new Image("gunting.jpg"));
            lose=lose+1;
            jumlahlose.setText(String.valueOf(lose));
        }


    }

    public void RockAction(ActionEvent actionEvent) {
        imageuser.setImage(new Image("batu.jpg"));
        int random =(int)(Math.random()*3+1);
        if(random==1) {
            imagecomputer.setImage(new Image("batu.jpg"));
            draw = draw + 1;
            jumlahdraw.setText(String.valueOf(draw));
        }
        else if (random==2){
            imagecomputer.setImage(new Image("gunting.jpg"));
            win=win+1;
            jumlahwin.setText(String.valueOf(win));
        }
        else if (random==3){
            imagecomputer.setImage(new Image("kertas.jpg"));
            lose=lose+1;
            jumlahlose.setText(String.valueOf(lose));
        }

    }

    public void ScissorAction(ActionEvent actionEvent) {
        imageuser.setImage(new Image("gunting.jpg"));
        int random =(int)(Math.random()*3+1);
        if(random==1) {
            imagecomputer.setImage(new Image("gunting.jpg"));
            draw = draw + 1;
            jumlahdraw.setText(String.valueOf(draw));
        }
        else if (random==2){
            imagecomputer.setImage(new Image("kertas.jpg"));
            win=win+1;
            jumlahwin.setText(String.valueOf(win));
        }
        else if (random==3){
            imagecomputer.setImage(new Image("batu.jpg"));
            lose=lose+1;
            jumlahlose.setText(String.valueOf(lose));
        }

    }

    public void exit(ActionEvent actionEvent){
        Platform.exit();
    }
    }





