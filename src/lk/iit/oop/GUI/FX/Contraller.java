package lk.iit.oop.GUI.FX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class Contraller {
    @FXML
    private TextField password;
    @FXML
    private TextField username;
    @FXML
    private javafx.scene.control.Button btnLogin;


    @FXML

    public void validateInfo(ActionEvent evt) {
        String enteredUsername = username.getText();
        String enteredPassword = password.getText();

        if ((enteredUsername.equals("admin")) && (enteredPassword.equals("123"))) {

        }else{
            Alert message = new Alert(Alert.AlertType.ERROR, "Incorrect User Name");
            message.showAndWait();
        }

    }
}






