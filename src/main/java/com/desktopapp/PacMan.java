package com.desktopapp;

import javafx.fxml.FXML;
import javafx.scene.shape.Arc;

public class PacMan extends Thread {

    

    PacMan () {

    }

    public void run(){
        while(true){
            System.out.println("aaaaaa");

            System.out.println(pacMan);

            pacMan.setRotate(30);
            pacMan.setLength(330);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            pacMan.setRotate(0);
            pacMan.setLength(270);
        }
    }

}
