
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class LoginController {

    @FXML
    private Label lblMensajeError;

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsuario;

    @FXML
    void login(ActionEvent event) throws IOException {
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();
        String error = "";

        if (usuario.equalsIgnoreCase("prueba")) {
            error = "Usuario no válido";
        }

        if (password.length() < 6) {
            error = "Contraseña debe contar con más de 6 caracteres. Intente nuevamente";
        } else if (password.equalsIgnoreCase(usuario)) {
            error = "Contraseña no puede ser igual al usuario. Intente nuevamente";
        }

        if (error.isEmpty()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/inicio.fxml"));
            Parent root = loader.load();
            //InicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }else{
            lblMensajeError.setText(error);
        }

    }

}