package refrigerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerFreezing {
    @FXML
    private Button back;

    @FXML
    private Button logout;

    @FXML
    private ImageView icecream;

    @FXML
    private ImageView cherryicecream;

    @FXML
    private ImageView chocalate;

    @FXML
    private ImageView ice;

    @FXML
    private ImageView snickers;

    @FXML
    private ImageView sponge;

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

    @FXML
    private void handleChoicecreamImage(MouseEvent event){
        ImageView b = (ImageView) event.getSource();
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

    @FXML
    private void handleCherryImage(MouseEvent event){
        ImageView b = (ImageView) event.getSource();
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

    @FXML
    private void handleChocolateImage(MouseEvent event){
        ImageView b = (ImageView) event.getSource();
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

    @FXML
    private void handleiceImage(MouseEvent event){
        ImageView b = (ImageView) event.getSource();
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

    @FXML
    private void handleSnickersImage(MouseEvent event){
        ImageView b = (ImageView) event.getSource();
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

    @FXML
    private void handleSpongeImage(MouseEvent event){
        ImageView b = (ImageView) event.getSource();
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

