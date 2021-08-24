package ejemplo2;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // System.out.print("Ingrese el nombre del profesor: ");
        // String nom = leer.nextLine();
        // System.out.print("Ingrese la materia del profesor: ");
        // String mat = leer.nextLine();
        // Persona p1 = new Profesor(nom, mat);
        // p1.mostrar();

        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nomE = leer.nextLine();
        System.out.print("Ingrese la carrera del estudiantes: ");
        String cEst = leer.nextLine();
        Estudiante p2 = new Estudiante();
        p2.setNombre(nomE);
        p2.setCarrera(cEst);
        p2.mostrar();

        Persona p3 = new Estudiante("Gabriel","Ingenieria" );
        p3.mostrar();

        leer.close();


    }
    
}
