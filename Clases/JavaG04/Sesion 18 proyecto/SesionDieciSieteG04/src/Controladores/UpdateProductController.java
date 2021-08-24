package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.Connect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UpdateProductController {

    @FXML
    private TextField txtACodigo;

    @FXML
    private TextField txtANombre;

    @FXML
    private TextField txtAPCompra;

    @FXML
    private TextField txtAPVenta;

    @FXML
    private TextField txtACBodega;

    @FXML
    private TextField txtACMin;

    @FXML
    private TextField txtACMax;

    @FXML
    private Button btnConsultar;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnEliminar;

    @FXML
    void actualizar(ActionEvent event) {

        Integer codigo = Integer.parseInt(txtACodigo.getText());
        String nombre = txtANombre.getText();
        Integer pCompra = Integer.parseInt(txtAPCompra.getText());
        Integer pVenta = Integer.parseInt(txtAPVenta.getText());
        Integer cBodega = Integer.parseInt(txtACBodega.getText());
        Integer cMin = Integer.parseInt(txtACMin.getText());
        Integer cMax = Integer.parseInt(txtACMax.getText());

        Connect objConexion = new Connect();

        String sql = "UPDATE productos SET nombre = ?, precio_compra = ?, precio_venta = ?, cant_bodega = ?, cant_min_requerida = ?, cant_max_inv_permitida = ? WHERE codigo = ?";

        try {
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, pCompra);
            ps.setInt(3, pVenta);
            ps.setInt(4, cBodega);
            ps.setInt(5, cMin);
            ps.setInt(6, cMax);
            ps.setInt(7, codigo);
            ps.executeUpdate();
            System.out.println("Actualización exitosa");
            limpiar();
            editarCajasFalse();

            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    @FXML
    void consultar(ActionEvent event) {
        Connect objConexion = new Connect();
        String sql = "SELECT * FROM productos WHERE codigo = ?";

        try {
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtACodigo.getText()));

            ResultSet result = ps.executeQuery();
            if (result.next()) {
                txtANombre.setText(result.getString("nombre"));
                txtAPCompra.setText(result.getString("precio_compra"));
                txtAPVenta.setText(result.getString("precio_venta"));
                txtACBodega.setText(result.getString("cant_bodega"));
                txtACMin.setText(result.getString("cant_min_requerida"));
                txtACMax.setText(result.getString("cant_max_inv_permitida"));
            }
            editarCajas();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void eliminar(ActionEvent event) {
        Integer codigo = Integer.parseInt(txtACodigo.getText());

        Connect objConexion = new Connect();
        String sql = "DELETE FROM productos WHERE codigo = ?";

        try {
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            System.out.println("Registro eliminado");
            limpiar();
            editarCajasFalse();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    void limpiar() {
        txtACodigo.setText("");
        txtANombre.setText("");
        txtAPCompra.setText("");
        txtAPVenta.setText("");
        txtACBodega.setText("");
        txtACMin.setText("");
        txtACMax.setText("");
    }

    void editarCajas() {
        txtANombre.setEditable(true);
        txtAPCompra.setEditable(true);
        txtAPVenta.setEditable(true);
        txtACBodega.setEditable(true);
        txtACMin.setEditable(true);
        txtACMax.setEditable(true);
    }

    void editarCajasFalse() {
        txtANombre.setEditable(false);
        txtAPCompra.setEditable(false);
        txtAPVenta.setEditable(false);
        txtACBodega.setEditable(false);
        txtACMin.setEditable(false);
        txtACMax.setEditable(false);
    }

}
