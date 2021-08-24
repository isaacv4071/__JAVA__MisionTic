import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private PasswordField txtClave;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnLogin;

    @FXML
    void login(ActionEvent event) {
        String usuario = txtUsuario.getText();
        String clave = txtClave.getText();

        if (usuario.equals("carmen") && clave.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Acceso concedido", "Login", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Acceso Denegado", "Login", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
