package refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class ProfileController {

    @FXML
    private Button nextPage;

    public void nextPageButton(ActionEvent a){
        Button b = (Button)a.getSource();
        Stage stage = (Stage)b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("food.fxml"));

        try {
            stage.setScene(new Scene(loader.load(), 900, 800));
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }








}
