package procesar;

public class SchoolGradingSystem extends GradingSystem {
    private float nombre, genero, materia, calificacion;
    private int tamano;

    public SchoolGradingSystem(Estudiante[] Estu) {
        super(Estu);
        nombre = 0;
        genero = 0;
        materia = 0;
        calificacion = 0;
        tamano = 0;
    }

    public void loadData(String d) {
        String filas[] = d.split("\n");
        tamano = filas.length;
        // inicializamos el vector de objetos
        Estudiante VectorEstu[] = new Estudiante[tamano];
        // recorremos el arreglo para llenarlo con los datos
        for (int i = 0; i < tamano; i++) {
            String linea[] = filas[i].split(" ");
            nombre = Float.parseFloat(linea[0]);
            genero = Float.parseFloat(linea[1]);
            materia = Float.parseFloat(linea[2]);
            calificacion = Float.parseFloat(linea[3]);

            // Metemos los valores en el vector de objetos
            VectorEstu[i] = new Estudiante(nombre, genero, materia, calificacion);
        }
        setEstu(VectorEstu);
    }

}