package com.client.ui.controller;

import com.api.entity.User;
import com.api.i18n.Messenger;
import com.api.i18n.MessengerFactory;
import com.client.Client;
import com.client.ClientApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthController extends GenericController {

    private static final Messenger messenger = MessengerFactory.getMessenger();

    @FXML
    private PasswordField passwordField;

    public AuthController() {
        super("auth.fxml");
    }

    @FXML
    public void login(ActionEvent event) {
        try {
            ClientApplication.getClient().signIn(new User(getNameField().getText(), passwordField.getText()));
            showMainScene();
        } catch (Exception e) {
            e.printStackTrace();
            showWarning("loginFailure");
        }
    }

    @FXML
    public void register(ActionEvent event) {
        try {
            ClientApplication.getClient().signUp(new User(getNameField().getText(), passwordField.getText()));
            showMainScene();
        } catch (Exception e) {
            showWarning("registrationFailure");
        }
    }

    private void showWarning(String waningBody) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(messenger.getMessage("register"));
        alert.setHeaderText(messenger.getMessage("warning"));
        alert.setContentText(messenger.getMessage(waningBody));
        alert.showAndWait();
    }

    private void showMainScene() {
        hideWindow();
        ClientApplication.loadSceneWithLanguage(new Stage(), messenger.getBundle().getLocale(), "main.fxml");
    }

}