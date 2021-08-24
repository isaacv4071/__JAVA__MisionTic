package ejemplo2.clases;

import java.util.Scanner;

public class Operaciones {
    protected int valorUno, valorDos, resultado;

    Scanner leer = new Scanner(System.in);

    // Metodo para pedir valores

    public void pedirDatos(){
        System.out.print("Ingrese primer valor: ");
        valorUno = Integer.parseInt(leer.nextLine());
        System.out.print("Ingrese segundo valor: ");
        valorDos = Integer.parseInt(leer.nextLine());
    }
    
    public int mostrarResultado(){
        return resultado;
    }
}
