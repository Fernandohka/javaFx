package com.desktopapp;

import java.net.URL;
import java.util.TimerTask;
import java.util.Timer;

import javafx.fxml.FXML;
// import javafx.fxml.FXML;
// import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class nadaController {
    private int velocidade = 5;
    static nadaController controller;
    Timer timer = new Timer();
    
    public static Scene CreateScene() throws Exception {
        URL sceneUrl = nadaController.class.getResource("nada.fxml");
        FXMLLoader loader = new FXMLLoader(sceneUrl);

        Parent root = loader.load();
        Scene scene = new Scene(root);
        controller = loader.getController();
        controller.nadaQuadrado.requestFocus();

        return scene;
    }

    @FXML
    protected Rectangle nadaQuadrado;

    @FXML
    protected Pane painel;

    @FXML
    protected Circle tiro;

    @FXML
    protected void input(KeyEvent key){
        switch (key.getCode().toString()) {
            case "W":
                nadaQuadrado.setY(nadaQuadrado.getY() - velocidade);
                break;
            case "A":
                nadaQuadrado.setX(nadaQuadrado.getX() - velocidade);
                break;
            case "S":
                nadaQuadrado.setY(nadaQuadrado.getY() + velocidade);
                break;
            case "D":
                nadaQuadrado.setX(nadaQuadrado.getX() + velocidade);
                break;

            case "UP":
                tiro tirinho = new tiro(controller, "UP", nadaQuadrado.getX(), nadaQuadrado.getY());
                tirinho.run();
                // controller.painel.getChildren().add(tiro);
                break;
            case "LEFT":
                controller.tiro.setCenterX(nadaQuadrado.getX() + 150);
                controller.tiro.setCenterY(nadaQuadrado.getY() + 150);
                // timer.schedule(task, 500l);
                break;
            case "DOWN":
                break;
            case "RIGHT":
                break;
        
            default:
                break;
        }
        System.out.println(key.getCode().toString());
    }
    TimerTask andar = new TimerTask() {
        public void run(){
            switch (key.getCode().toString()) {
                case "W":
                    nadaQuadrado.setY(nadaQuadrado.getY() - velocidade);
                    break;
                case "A":
                    nadaQuadrado.setX(nadaQuadrado.getX() - velocidade);
                    break;
                case "S":
                    nadaQuadrado.setY(nadaQuadrado.getY() + velocidade);
                    break;
                case "D":
                    nadaQuadrado.setX(nadaQuadrado.getX() + velocidade);
                    break;
                
                default:
                    break;
            }
        }
    };
}
