package ejemplo1.main;

import ejemplo1.clases.Estudiante;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Estudiante est = new Estudiante();

        est.PedirDatos();  //Llama metodo de la superclase

        System.out.print("Ingrese el código del estudiante: ");
        est.setCodigo(leer.nextLine());
        System.out.print("Ingrese la primera nota del estudiante: ");
        est.setNota1(Double.parseDouble(leer.nextLine()));
        System.out.print("Ingrese la segunda nota del estudiante: ");
        est.setNota2(Double.parseDouble(leer.nextLine()));
        System.out.print("Ingrese la tercera nota del estudiante: ");
        est.setNota3(Double.parseDouble(leer.nextLine()));
        
        est.imprimirPadre();
        System.out.printf(" con codigo %s obtuvo un promedio de %.2f%n ",est.getCodigo(), est.promedio());

        leer.close();
    }
    
}
