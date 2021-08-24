public class App {
    public static void main(String[] args) {
        SchoolGradingSystem obj = new SchoolGradingSystem();
        obj.readData();
        // ¿Cuál es el porcentaje de aprobación para todos los exámenes presentados por
        // el grupo?
        obj.question1();
        // ¿Cuántos exámenes tienen una calificación insuficiente?
        obj.question2();
        // ¿Cuál es la materia con el peor desempeño promedio para el género masculino?
        System.out.println(obj.question3());
        // ¿Cuál es el estudiante con el mejor desempeño para la materia geografía?
        System.out.println(obj.question4());
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