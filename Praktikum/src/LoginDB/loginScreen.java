package LoginDB;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Created by maus on 22.11.15.
 */
public class loginScreen {
    public loginScreen() {
        Stage stage = new Stage();
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        Scene scene = new Scene(vbox);

        Label userLabel = new Label("Username:");
        TextField inputUser = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField inputPassword = new PasswordField();

        Button loginButton = new Button("Logi in");
        Button registerButton = new Button("Register");

        vbox.getChildren().addAll(userLabel, inputUser, passwordLabel, inputPassword, loginButton, registerButton);

        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> System.exit(0));

        registerButton.setOnAction(event -> {
            String username = inputUser.getText();
            String password = inputPassword.getText();
            Andmebaas a = new Andmebaas();
            a.registerUser(username, password);
            a.kuvaRead(username);
            a.sulgeYhendus();
        });
    }
}
