import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class systemAnalytic implements Initializable{

    @FXML
    private TextField txtnum;

    @FXML
    private TextArea TxtA1;

    @FXML
    private TextArea txtA2;

    @FXML
    private Button btnCalcular;

    //varibles a utilizar
    SchoolGradingSystemI obj = new SchoolGradingSystemI(null);

    @FXML
    void Calcular(ActionEvent event) {
        obj.setTamano(Integer.parseInt(txtnum.getText()));
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        txtA2.setEditable(false);
    }

}