package refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class ControllerFood {

    @FXML
    private Button back;

    @FXML
    private Button logout;

    public void backButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("refrigeratorRoom.fxml"));

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

    public void fooddetailButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fooddetail.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
