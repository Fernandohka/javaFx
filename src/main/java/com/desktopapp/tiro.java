package com.desktopapp;

// import javafx.fxml.FXML;

public class tiro {
    private int velocidade = 5;
    private nadaController controller;
    private String direcao;

    tiro(nadaController controller, String direcao, double x, double y){
        controller.tiro.setCenterX(x + 150);
        controller.tiro.setCenterY(y + 150);
        this.controller = controller;
        this.direcao = direcao;
    }

    

    

    @Override
    public void run() {
        super.run();
        switch (direcao) {
            case "UP":
                for (int i = 0; i < 10; i++) {
                    controller.tiro.setCenterY(controller.tiro.getCenterY() - velocidade);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
        
            default:
                break;
        }
    }

}
