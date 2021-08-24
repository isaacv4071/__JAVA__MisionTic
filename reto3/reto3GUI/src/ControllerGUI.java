import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ControllerGUI {

    @FXML
    private TextField txtNpersonas;

    @FXML
    private Button btnCalcular;

    @FXML
    private TextArea textAreaEntrada;

    @FXML
    private TextArea textAreaSalida;

    @FXML
    void Calcular(ActionEvent event) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#.##", simbolos);
        textAreaSalida.setEditable(false);
        if(txtNpersonas.getText().isEmpty()||textAreaEntrada.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor llenar los espacios");
            alert.showAndWait();
        }else{
        String Npersonas = txtNpersonas.getText();
        String Data = textAreaEntrada.getText();
        
        SchoolGradingSystem obj = new SchoolGradingSystem(null);
        obj.loadData(Npersonas, Data);
        textAreaSalida.setText(formatter.format(obj.stat1())+"\n"+obj.stat2()+"\n"+obj.stat3()+"\n"+obj.stat4());
        }
    }

}
