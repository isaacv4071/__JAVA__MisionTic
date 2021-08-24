import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new 
        FXMLLoader(getClass().getResource("interfaz.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle("Sistema Estadistico");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}

class Estudiante {
    private float nombre;
    private float genero;
    private float materia;
    private float calificacion;

    public Estudiante(float NOMBRE, float GENERO, float MATERIA, float CALIFICACION) {
        nombre = NOMBRE;
        genero = GENERO;
        materia = MATERIA;
        calificacion = CALIFICACION;
    }

    public float getNombre() {
        return nombre;
    }

    public float getGenero() {
        return genero;
    }

    public float getMateria() {
        return materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

}