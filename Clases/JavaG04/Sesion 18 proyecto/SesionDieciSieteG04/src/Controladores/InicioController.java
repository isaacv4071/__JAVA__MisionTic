package Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import Connection.Connect;

public class InicioController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPCompra;

    @FXML
    private TextField txtPVenta;

    @FXML
    private TextField txtCBodega;

    @FXML
    private TextField txtCMin;

    @FXML
    private TextField txtCMax;

    @FXML
    private Button createButton;

    @FXML
    private Button viewButton;

    @FXML
    private Button createSaleButton;

    @FXML
    private Button btnconsultarEditar;


    @FXML
    private TextArea productList;

    void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPCompra.setText("");
        txtPVenta.setText("");
        txtCBodega.setText("");
        txtCMin.setText("");
        txtCMax.setText("");
    }

    @FXML
    void createProduct(ActionEvent event) {
        

        Integer codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtNombre.getText();
        Integer pCompra = Integer.parseInt(txtPCompra.getText());
        Integer pVenta = Integer.parseInt(txtPVenta.getText());
        Integer cBodega = Integer.parseInt(txtCBodega.getText());
        Integer cMin = Integer.parseInt(txtCMin.getText());
        Integer cMax = Integer.parseInt(txtCMax.getText());
        
        Connect objConexion = new Connect();
        String sql = "INSERT INTO productos(codigo,nombre,precio_compra,precio_venta,cant_bodega,cant_min_requerida,cant_max_inv_permitida) VALUES (?,?,?,?,?,?,?);";
        
        try {
            // Creación de un objeto de la clase Connect.java
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, pCompra);
            ps.setInt(4, pVenta);
            ps.setInt(5, cBodega);
            ps.setInt(6, cMin);
            ps.setInt(7, cMax);
            ps.executeUpdate();

            System.out.println("Producto creado");
            limpiar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void viewProduct(ActionEvent event) {
        Connect objConexion = new Connect();

        String query = "SELECT * FROM productos";

        try {
            Connection conn = objConexion.conexion();
            Statement stmt = conn.createStatement();

            // Clase ResultSet es donde guardamos el resultado de la consulta

            ResultSet result = stmt.executeQuery(query);
            // Analiza la estructura de un consulta para averiguar cuántas columnas tiene,
            // los nombres de las columnas, el tipo de dato etc.
            ResultSetMetaData rsmd = result.getMetaData();
            int numColumna = rsmd.getColumnCount();
            String productos = "";
            while (result.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    String valorColumna = result.getString(i);
                    productos = productos + rsmd.getColumnName(i) + ": " + valorColumna + "\n";

                }
                productos = productos + "\n";
            }
            productList.setText(productos);

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    @FXML
    void consultarEditar(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/update.fxml"));
            Parent root = loader.load();
            //InicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

    }

    @FXML
    void createSale(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/sales.fxml"));
            Parent root = loader.load();
            //InicioController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

    }


}
