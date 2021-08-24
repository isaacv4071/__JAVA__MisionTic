package connet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas {
    Connect objConexion = new Connect();

    public String consultaData(String sql, float val) {
        String Consulta = sql;
        float valor = val;
        try {
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, valor);
            ResultSet result = ps.executeQuery();
            ResultSetMetaData rsmd = result.getMetaData();
            int numColumna = rsmd.getColumnCount();
            String estudiantes = "";

            while (result.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    String valorColumna = result.getString(i);
                    estudiantes = estudiantes + valorColumna + " ";
                }
                estudiantes = estudiantes + "\n";
            }
            conn.close();
            Consulta = estudiantes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Consulta;
    }


    public String consultaNombreMateria(String sql, float val1, float val2) {
        String Consulta = sql;
        float valor1 = val1;
        float valor2 = val2;
        Connection conn = objConexion.conexion();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, valor1);
            ps.setFloat(2, valor2);
            ResultSet result = ps.executeQuery();
            ResultSetMetaData rsmd = result.getMetaData();
            int numColumna = rsmd.getColumnCount();
            String estudiantes = "";

            while (result.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    String valorColumna = result.getString(i);
                    estudiantes = estudiantes + valorColumna + " ";
                }
                estudiantes = estudiantes + "\n";
            }
            Consulta = estudiantes;
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Consulta;
    }

    public String consultaCargar(String sql){
        String Consulta = sql;
        try {
            Connection conn = objConexion.conexion();
            Statement stmt = conn.createStatement();

            // Clase ResultSet es donde guardamos el resultado de la consulta
            ResultSet result = stmt.executeQuery(Consulta);
            // Analiza la estructura de un consulta para averiguar cuántas columnas tiene,
            // los nombres de las columnas, el tipo de dato etc.
            ResultSetMetaData rsmd = result.getMetaData();
            int numColumna = rsmd.getColumnCount();
            String estudiantes = "";

            while (result.next()) {
                for (int i = 1; i <= numColumna; i++) {
                    String valorColumna = result.getString(i);
                    estudiantes = estudiantes + valorColumna + " ";
                }
                estudiantes = estudiantes + "\n";
            }

            Consulta = estudiantes;
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return Consulta;
    }

    public void consultaEliminarData(String sql, float val){
        try{
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, val);
            ps.executeUpdate();
            System.out.println("Registro eliminado");
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void consultaEliminarNombreMateria(String sql, float val1, float val2){
        try{
            Connection conn = objConexion.conexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, val1);
            ps.setFloat(2, val2);
            ps.executeUpdate();
            System.out.println("Registro eliminado");
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void Guardar(float Nombre, float Genero, float Materia, float Calificacion) {
        try {
            // Creación de un objeto de la clase Connect.java
            Connection conn = objConexion.conexion();
            // Statement nos sirve para enviar las instrucciones a la bd
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO Estudiante(nombre,genero,materia,calificacion) VALUES (" + Nombre + ","
                    + Genero + "," + Materia + "," + Calificacion + ");");
            System.out.println("Estudiante agregado");
            conn.close();
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
