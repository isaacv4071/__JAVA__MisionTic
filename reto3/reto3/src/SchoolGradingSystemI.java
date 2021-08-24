public class SchoolGradingSystemI extends GradingSystem {
    private float nombre, genero, materia, calificacion;
    private int tamano;

    public SchoolGradingSystemI(Estudiante[] Estu) {
        super(Estu);
        nombre = 0;
        genero = 0;
        materia = 0;
        calificacion = 0;
        tamano = 0;
    }
    
    

    public float getNombre() {
        return nombre;
    }

    public void setNombre(float nombre) {
        this.nombre = nombre;
    }

    public float getGenero() {
        return genero;
    }

    public void setGenero(float genero) {
        this.genero = genero;
    }

    public float getMateria() {
        return materia;
    }

    public void setMateria(float materia) {
        this.materia = materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void loadData() {

        // inicializamos el vector de objetos
        Estudiante VectorEstu[] = new Estudiante[tamano];
        // recorremos el arreglo para llenarlo con los datos
        for (int i = 0; i < VectorEstu.length; i++) {
            // Metemos los valores en el vector de objetos
            VectorEstu[i] = new Estudiante(nombre, genero, materia, calificacion);
        }
        setEstu(VectorEstu);
    }
}
