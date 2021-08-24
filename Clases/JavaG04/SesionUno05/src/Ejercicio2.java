//Operación de escritura, que se realiza con la clase Scanner
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
       Scanner leer = new Scanner(System.in); //Scanner leer = new Scanner(System.in);
                                              //tipoDato nomobj iniobjeto funcionalidad
        System.out.print("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        //System.out.print("Hola " + nombre + " Cuántos años tienes?: ");
        //System.out.print(String.format("Hola %s Cuántos años tienes?:", nombre));
        System.out.printf("Hola %s Cuántos años tienes?:", nombre);
        int edad = leer.nextInt();
        System.out.println(nombre + " tienes " + edad + " años");
        System.out.print(String.format("%s tiene %d años %n", nombre, edad));
        System.out.printf("%s tiene %d años", nombre, edad);

        System.out.printf("%.2f %n", 12.36876);
        System.out.printf("%.3f %n", 15.6577876);

        leer.close();                                            
    }
    
}


