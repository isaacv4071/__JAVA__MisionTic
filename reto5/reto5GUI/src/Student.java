public class Student {
    private float nombre;
    private float genero;
    private float materia;
    private float calificacion;

    public Student(float NOMBRE, float GENERO, float MATERIA, float CALIFICACION) {
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
