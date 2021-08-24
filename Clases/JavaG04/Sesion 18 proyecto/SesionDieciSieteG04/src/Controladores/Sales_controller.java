package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Connection.Connect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Sales_controller {

    @FXML
    private ChoiceBox<String> chb_producto;

    @FXML
    private ChoiceBox<String> chb_cliente;

    @FXML
    private Button btn_registrar;

    @FXML
    private TextField txt_cantidad;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_apellido;

    @FXML
    private TextField txt_genero;

    @FXML
    private Button btn_add_cliente;

    ObservableList<String> productos = FXCollections.observableArrayList();
    ObservableList<String> clientes = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        productos.add("Seleccione Producto");
        obtenerListaProducto();
        chb_producto.getSelectionModel().select(0);

        clientes.add("Seleccione Cliente");
        obtenerListaCliente();
        chb_cliente.getSelectionModel().select(0);

    }

    Connect objConexion = new Connect();
    Connection conn = objConexion.conexion();

    void obtenerListaProducto() {
        String sql = "SELECT * FROM productos ORDER BY codigo";

        try {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                productos.add(result.getInt("codigo") + "-" + (result.getString("nombre")));
            }
            chb_producto.setItems(productos);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void obtenerListaCliente() {
        String sql = "SELECT * FROM clientes ORDER BY id";

        try {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                clientes.add(result.getInt("id") + "-" + (result.getString("nombre")));
            }
            chb_cliente.setItems(clientes);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int existeIdentificacion() {
        String sql = "SELECT cedula FROM clientes WHERE cedula = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txt_id.getText());
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return 1;
            }

        } catch (SQLException e) {
            System.out.println("Error en validar Cedula " + e);
        }
        return 0;

    }

    @FXML
    void Add_cliente(ActionEvent event) {
        Integer cedula = Integer.parseInt(txt_id.getText());
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String genero = txt_genero.getText();

        String sql = "INSERT INTO clientes(cedula, nombre, apellido, genero ) VALUES (?,?,?,?)";

        try {
            if (existeIdentificacion() == 0) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, cedula);
                ps.setString(2, nombre);
                ps.setString(3, apellido);
                ps.setString(4, genero);
                ps.executeUpdate();

                System.out.println("Cliente creado con éxito");

            } else {
                JOptionPane.showMessageDialog(null, "Identificación ya existe");
            }

        } catch (SQLException e) {
            System.out.println("Cliente no creado " + e);
        }

    }

    String obtenerLLave(String cadena) {
        String llave[] = cadena.split("-"); // ["1", "carmen"]
        return llave[0]; // ["1"]
    }

    @FXML
    void Registrar_venta(ActionEvent event) {
        Integer cliente = Integer.parseInt(obtenerLLave(chb_cliente.getValue()));
        Integer producto = Integer.parseInt(obtenerLLave(chb_producto.getValue()));
        Integer cant = Integer.parseInt(txt_cantidad.getText());

        String sql = "INSERT INTO ventas (cliente, producto, cantidad) VALUES (?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente);
            ps.setInt(2, producto);
            ps.setInt(3, cant);
            ps.executeUpdate();
            System.out.println("Venta creada exitosamente");

        } catch (SQLException e) {
            System.out.println("Error en crear venta " + e);
        }

    }

}
