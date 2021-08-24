import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class FrmLoginController {

    @FXML
    private Button btnIngresar;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUsuario;

    @FXML
    private ComboBox<String> cboRol;

    @FXML
    void Ingresar(ActionEvent event) {
        String login = txtUsuario.getText();
        String clave = txtPass.getText();
        String rol = cboRol.getValue();
        if (login.equalsIgnoreCase("prueba") && clave.equals("1234")) {
            System.out.println("Bienvenido ... " + rol);
            JOptionPane.showMessageDialog(null, "Bienvenido " + rol, "Login", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario inválido", "Login", JOptionPane.ERROR_MESSAGE);
            System.out.println("Acceso no permitido");
        }
    }

    @FXML
    public void initialize() {
        cboRol.getItems().removeAll(cboRol.getItems());
        cboRol.getItems().addAll("Administrador", "Técnico", "Usuario");
        cboRol.getSelectionModel().select("Técnico");
    }
}
