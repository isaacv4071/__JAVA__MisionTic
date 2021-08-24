package ejemplo2.main;

import ejemplo2.clases.*;

public class Principal {
    public static void main(String[] args) {
        Suma sum = new Suma();
        System.out.println("Datos para la suma");
        sum.pedirDatos();
        sum.sumar();
        System.out.printf("El resultado de la suma es: %d", sum.mostrarResultado());

        System.out.println();

        Resta res = new Resta();
        System.out.println("Datos para la resta");
        res.pedirDatos();
        res.resta();
        System.out.printf("El resultado de la resta es: %d", res.mostrarResultado());

      
    }
    
}
