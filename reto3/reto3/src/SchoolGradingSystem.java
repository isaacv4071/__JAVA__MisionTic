import java.util.Scanner;

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

    public void loadData() {
        // inicializamos la entrada por teclado
        Scanner entrada = new Scanner(System.in);
        tamano = entrada.nextInt();
        // inicializamos el vector de objetos
        Estudiante VectorEstu[] = new Estudiante[tamano];
        // recorremos el arreglo para llenarlo con los datos
        for (int i = 0; i < VectorEstu.length; i++) {
            nombre = Float.parseFloat(entrada.next());
            genero = Float.parseFloat(entrada.next());
            materia = Float.parseFloat(entrada.next());
            calificacion = Float.parseFloat(entrada.next());

            // Metemos los valores en el vector de objetos
            VectorEstu[i] = new Estudiante(nombre, genero, materia, calificacion);
        }
        entrada.close();
        setEstu(VectorEstu);
    }

}