import java.util.*;
public class App {
    public static void main(String[] args)  {
        Scanner leer=new Scanner(System.in);
        Estudiante es=new Estudiante("Juan", 1.0, 4.2, 3.5);
        Estudiante es1=new Estudiante("Pedro", 4.0, 3.2, 3.9);
        Estudiante es3 =new Estudiante("Ana", 5.0, 1.2, 3.9);

        // System.out.print("Digita tu nombre: ");
        // es.setNombre(leer.nextLine());
        // System.out.print("Digita tu nota 1: ");
        // es.setNota1(leer.nextDouble());
        // System.out.print("Digita tu nota 2: ");
        // es.setNota2(leer.nextDouble());
        // System.out.print("Digita tu nota 3: ");
        // es.setNota3(leer.nextDouble());
        

        System.out.printf("Código %d: %s tu promedio es: %.2f%n",es.getCodigo(), es.getNombre(),es.promedio());
        System.out.printf("Código %d: %s tu promedio es: %.2f%n",es1.getCodigo(), es1.getNombre(),es1.promedio());
        System.out.printf("Código %d: %s tu promedio es: %.2f%n",es3.getCodigo(), es3.getNombre(),es3.promedio());

        System.out.printf("El código del estudiante que sigue es: %d", Estudiante.getCodConsecutivo());

        leer.close();

    }
}
