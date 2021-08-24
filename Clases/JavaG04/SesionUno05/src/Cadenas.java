import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        String nombre_uno = "", nombre_dos = "";
        Scanner leer = new Scanner(System.in);

        System.out.print("Por favor ingrese el primer nombre: ");
        nombre_uno = leer.nextLine();

        System.out.print("Por favor ingrese el segundo nombre: ");
        nombre_dos = leer.nextLine();

        if (nombre_uno.equalsIgnoreCase(nombre_dos)) {
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }
        leer.close();
    }
}
