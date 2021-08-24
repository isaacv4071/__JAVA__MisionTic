import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import procesar.SchoolGradingSystem;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import connet.Consultas;

public class ControllerInterfaz {

    Consultas obj = new Consultas();

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtMateria;

    @FXML
    private TextField txtNota;

    @FXML
    private TextField txtGenero;

    @FXML
    private Button btnGuardar;

    @FXML
    private TextArea AreaEntrada;

    @FXML
    private TextArea AreaSalida;

    @FXML
    private Button btnCargar;

    @FXML
    private Button btnProcesar;

    @FXML
    private TextField txtCNombre;

    @FXML
    private TextField txtCMateria;

    @FXML
    private Button btnConsultar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextArea SalidaConsultas;

    @FXML
    void Cargar(ActionEvent event) {
        AreaSalida.setEditable(false);
        AreaEntrada.setEditable(false);
        String query = "SELECT * FROM Estudiante";
        AreaEntrada.setText(obj.consultaCargar(query));
    }

    @FXML
    void Consultar(ActionEvent event) {

        if (txtCNombre.getText().equals("") & txtCMateria.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor llenar los espacios");
            alert.showAndWait();
        } else if (txtCMateria.getText().isEmpty()) {
            // consulta solo nombres
            String sql = "SELECT * FROM Estudiante WHERE nombre = ?";
            float valor = Float.parseFloat(txtCNombre.getText());
            String Consulta = obj.consultaData(sql, valor);
            if (Consulta.equals("")) {
                SalidaConsultas.setText("no se encontraron resultados.");
            } else {
                SalidaConsultas.setText(Consulta);
            }

        } else if (txtCNombre.getText().isEmpty()) {
            // consulta solo materia
            String sql = "SELECT * FROM Estudiante WHERE materia = ?";
            float valor = Float.parseFloat(txtCMateria.getText());
            String Consulta = obj.consultaData(sql, valor);
            if (Consulta.equals("")) {
                SalidaConsultas.setText("no se encontraron resultados.");
            } else {
                SalidaConsultas.setText(Consulta);
            }

        } else {
            // consulta de materia-nombre
            String sql = "SELECT * FROM Estudiante WHERE nombre = ? AND materia = ?";
            float valor1 = Float.parseFloat(txtCNombre.getText());
            float valor2 = Float.parseFloat(txtCMateria.getText());
            String Consulta = obj.consultaNombreMateria(sql, valor1, valor2);
            if (Consulta.equals("")) {
                SalidaConsultas.setText("no se encontraron resultados.");
            } else {
                SalidaConsultas.setText(Consulta);
            }
        }
    }

    @FXML
    void Eliminar(ActionEvent event) {
        if (txtCNombre.getText().equals("") & txtCMateria.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor llenar los espacios");
            alert.showAndWait();
        } else if (txtCMateria.getText().isEmpty()) {
            String sql = "DELETE FROM Estudiante WHERE nombre = ?";
            float val = Float.parseFloat(txtCNombre.getText());
            obj.consultaEliminarData(sql, val);
            SalidaConsultas.setText("Registro eliminado");
        } else if (txtCNombre.getText().isEmpty()) {
            String sql = "DELETE FROM Estudiante WHERE materia = ?";
            float val = Float.parseFloat(txtCMateria.getText());
            obj.consultaEliminarData(sql, val);
            SalidaConsultas.setText("Registro eliminado");
        }else{
            String sql = "DELETE FROM Estudiante WHERE nombre = ? AND materia = ?";
            float val1 = Float.parseFloat(txtCNombre.getText());
            float val2 = Float.parseFloat(txtCMateria.getText());
            obj.consultaEliminarNombreMateria(sql, val1, val2);
            SalidaConsultas.setText("Registro eliminado");
        }
    }

    void limpiar() {
        txtNombre.setText("");
        txtGenero.setText("");
        txtMateria.setText("");
        txtNota.setText("");
    }

    @FXML
    void Guardar(ActionEvent event) {

        if(txtNombre.getText().isEmpty()||txtGenero.getText().isEmpty()||txtMateria.getText().isEmpty()||txtNota.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor llenar los espacios");
            alert.showAndWait();
        }else{
        float Nombre = Integer.parseInt(txtNombre.getText());
        float Genero = Integer.parseInt(txtGenero.getText());
        float Materia = Integer.parseInt(txtMateria.getText());
        float Calificacion = Float.parseFloat(txtNota.getText());
        obj.Guardar(Nombre, Genero, Materia, Calificacion);
        limpiar();
        }
    }

    @FXML
    void Procesar(ActionEvent event) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#.##", simbolos);
        String Data = AreaEntrada.getText();
        SchoolGradingSystem obj = new SchoolGradingSystem(null);

        obj.loadData(Data);

        AreaSalida
                .setText(formatter.format(obj.stat1()) + "\n" + obj.stat2() + "\n" + obj.stat3() + "\n" + obj.stat4());
    }

}
