/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday7;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;

/**
 *
 * @author tangh
 */
public class SceneSwitcher {
    private static Stage stage ;
    
    public static void setStage(Stage s){
        stage = s;
    }
    
    public static void switchScene(String fxml) throws IOException{
        FXMLLoader loader = new FXMLLoader(SceneSwitcher.class.getResource(fxml));
        stage.setScene(new Scene(loader.load()));
    }
    
    public static void switchScene(String fxml, User user) throws IOException{
        FXMLLoader loader = new FXMLLoader(SceneSwitcher.class.getResource(fxml));
        stage.setScene(new Scene(loader.load()));
        
        //xử lý thông tin user
    }
}
