package refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLogin {

    @FXML
    private TextField idfield;

    @FXML
    private TextField passwordfield;

    @FXML
    private Label status;

    public void login(ActionEvent a){
        if(idfield.getText().equals("admin") && passwordfield.getText().equals("java")){
            Button b = (Button)a.getSource();
            Stage stage = (Stage)b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("profile.fxml"));

            try {
                stage.setScene(new Scene(loader.load(), 800, 600));
                stage.centerOnScreen();
                stage.show();

            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        else{
            status.setText("Username หรือ Password ไม่ถูกต้อง \n\t\tกรุณาลองใหม่.");
        }
    }
}
