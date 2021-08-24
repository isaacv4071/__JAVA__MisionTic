package ejemplo1.clases;

import java.util.Scanner;

public class Persona {
    protected String nombre, apellido; //private solo tiene acceso la  misma clase get y set
                                    // protected acceden las clases derivadas

    Scanner leer = new Scanner(System.in);

    public void PedirDatos(){
        System.out.print("Ingrese nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese apellido: ");
        apellido = leer.nextLine();
    }

    
}
