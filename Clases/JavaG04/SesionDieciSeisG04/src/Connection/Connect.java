package Connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Connect {
    
    public Connection conexion(){
        //Ruta donde está la bd creada
        String url = "jdbc:sqlite:C:/Users/MI ACER/Documents/MisionTic2022/Java project/SesionDieciSeisG04/src/Bd/Almacen04.db";

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
