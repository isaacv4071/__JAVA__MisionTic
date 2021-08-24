import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SaludoController {

    @FXML
    private Button btnSaludar;

    @FXML
    private TextField txtNombre;

    @FXML
    void Saludar(MouseEvent event) {
        JOptionPane.showMessageDialog(null, "Hola " + txtNombre.getText());

    }

}
