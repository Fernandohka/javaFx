package com.desktopapp;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.util.ResourceBundle;

public class MainController {
    private Integer id;

    public void setID(Integer id) {
        this.id = id;
    }

    public static Scene CreateScene(Integer id) throws Exception
    {
        URL sceneUrl = MainController.class.getResource("main-scene.fxml");
        FXMLLoader loader = new FXMLLoader(sceneUrl);

        Parent root = loader.load();
        Scene scene = new Scene(root);
        
        MainController controller = loader.getController();
        controller.setID(id);
        controller.loginButton.setText(id.toString());
        
        return scene;
    }



    @FXML
    protected Button loginButton;

    @FXML
    protected TextField emailInput;

    @FXML
    protected CheckBox visibilityButton;

    @FXML
    protected PasswordField passwordInput;

    @FXML
    protected void onButtonClick(MouseEvent e) throws Exception
    {
        Stage naovejo = (Stage)loginButton.getScene().getWindow();
        naovejo.close();

        Stage newStage = new Stage();
        Scene newScene = MainController.CreateScene(this.id + 1);

        newStage.setScene(newScene);
        newStage.show();
    }

    @FXML
    protected void initialize(URL Location, ResourceBundle Resouces) throws Exception{
        this.loginButton.setText(id.toString());

        this.loginButton.setOnAction(e -> {
            System.out.println("Ola");
        });
    }
}
