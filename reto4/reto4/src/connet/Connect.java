package connet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Connect {
    
    public Connection conexion(){
        //Ruta donde está la bd creada
        String url = "jdbc:sqlite:/media/isaac/Documentos U/Diplomado/Ciclo2/reto4/reto4/src/database/sistema_calificaciones.db";

        Connection conn = null;
        try{
            //Creamos la conexión
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión establecida");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}