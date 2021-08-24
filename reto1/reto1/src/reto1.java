import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class reto1 {
    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {
        float nombre, genero, materia, calificacion;
        // inicializamos la entrada por teclado
        Scanner entrada = new Scanner(System.in);
        // Definimos el tamaño del vector
        int tam;
        tam = entrada.nextInt();
        // inicializamos el vector de objetos
        Estudiante VectorEstu[] = new Estudiante[tam];
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

        // ¿Cuál es el porcentaje de aprobación para todos los exámenes presentados por
        // el grupo?
        promedio_aprobados(VectorEstu);

        // ¿Cuántos exámenes tienen una calificación insuficiente?
        Calificacion_insuficiente(VectorEstu);

        // ¿Cuál es la materia con el peor desempeño promedio para el género masculino?
        peor_materia_hombres(VectorEstu);

        // ¿Cuál es el estudiante con el mejor desempeño para la materia geografía?
        estu_desenpeno(VectorEstu);

    }

    public static void peor_materia_hombres(Estudiante VectorEstu[]) {
        float suma_geo = 0;
        float promedio_geometria = 0;
        float suma_mat = 0;
        float promedio_matematicas = 0;
        float suma_info = 0; 
        float promedio_informatica = 0;
        for (int i = 0; i< VectorEstu.length; i++) {
            if (VectorEstu[i].getGenero() == 0) {
                if (VectorEstu[i].getMateria() == 1) {
                    suma_geo+=VectorEstu[i].getCalificacion();
                }
                else if (VectorEstu[i].getMateria() == 2){
                    suma_mat+=VectorEstu[i].getCalificacion();
                }
                else{
                    suma_info+=VectorEstu[i].getCalificacion();
                }
            } 
            promedio_geometria = suma_geo / VectorEstu.length;
            promedio_matematicas = suma_mat / VectorEstu.length;
            promedio_informatica = suma_info / VectorEstu.length;
        }

        if(promedio_geometria<promedio_matematicas && promedio_geometria<promedio_informatica){
            System.out.println("geografia");
        }else if(promedio_matematicas<promedio_geometria && promedio_matematicas<promedio_informatica){
            System.out.println("matematicas");
        }else{
            System.out.println("informatica");
        }
    }

    public static void promedio_aprobados(Estudiante VectorEstu[]) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#.##", simbolos);
        float suma_ganados = 0;
        float promedio = 0;
        for (Estudiante E : VectorEstu) {
            if (E.getCalificacion() > 2.5 && E.getCalificacion() <= 5) {
                suma_ganados++;
            }
            promedio = suma_ganados / VectorEstu.length;
        }
        System.out.println(formatter.format(promedio));
    }

    public static void Calificacion_insuficiente(Estudiante VectorEstu[]) {
        int contador_insuficiente = 0;
        for (Estudiante E : VectorEstu) {
            if (E.getCalificacion() > 1 && E.getCalificacion() <= 2.5) {
                contador_insuficiente++;
            }
        }
        System.out.println(contador_insuficiente);
    }

    public static void estu_desenpeno(Estudiante VectorEstu[]) {
        float mayor = 0;
        float name = 0;
        for (Estudiante E : VectorEstu) {
            if (E.getMateria() == 1) {
                if (E.getCalificacion() > mayor) {
                    mayor = E.getCalificacion();
                    name = E.getNombre();
                }
            }
        }
        // nombre
        if (name == 1) {
            System.out.println("armando");
        } else if (name == 2) {
            System.out.println("nicolas");
        } else if (name == 3) {
            System.out.println("daniel");
        } else if (name == 4) {
            System.out.println("maria");
        } else if (name == 5) {
            System.out.println("marcela");
        } else if (name == 6) {
            System.out.println("alexandra");
        }
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