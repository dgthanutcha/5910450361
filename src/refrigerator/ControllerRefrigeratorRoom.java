package refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerRefrigeratorRoom {
    @FXML
    private Button openfreezing;

    @FXML
    private Button opencold;

    @FXML
    private Button profile;

    @FXML
    private Button food;

    @FXML
    private Button logout;

    @FXML
    private Button back;

    public void freezingButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("freezing.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void coldButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cold.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public void profileButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("profile.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public void foodButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("food.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void logoutButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void backButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("profile.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}