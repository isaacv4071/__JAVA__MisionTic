package ejercicio2;

/**
 Herencia

Partes del programa
1. Definición de variables
2. Creacion de objetos v1, v2, y v3 instanciando la SuperClase Vehiculo en sus 
   tres constructores, respectivamente.
3. Creación de objetos t1, t2, y t3 instanciando la SubClase Taxi en sus tres 
   constructores, respectivamente.
4. Creación de objeto c1 instanciando la SubClase Camioneta y aplica el concepto
   de sobre-escritura de métodos en el método getnumSillas para aumentar su 
   numero de sillas sobre la base de 3 que le asigna el constructor.

Notas: En este ejemplo se usan:
a. Operador condicional ?: Operador ternario
b. Operador booleano || para determinar true o false en la variable aa. Evita
   el uso de un if.
c. el método charAt(0) para leer un carácter de teclado y no un String.
**/


import java.util.Scanner;

public class PrincVehiculo {
    public static void main(String[] args) {

        //1. definir de variables
        Scanner leer = new Scanner(System.in);
        char resp;
        boolean aa;
        String matricula;
        int numSillas;
        int sillasAdic;
    
        //. Creacion de objetos v1, v2, y v3 instanciando la SuperClase Vehiculo en sus tres constructores, respectivamente.

        Vehiculo v1 = new Vehiculo();
        System.out.printf("El vehiculo con placa: %s tiene %d sillas%n", v1.getMatricula(), v1.getNumSillas());

        Vehiculo v2 = new Vehiculo("TXR560");
        System.out.printf("El vehiculo con placa: %s tiene %d sillas%n", v2.getMatricula(), v2.getNumSillas());

        Vehiculo v3 = new Vehiculo("QHE000", 5);
        System.out.printf("El vehiculo con placa: %s tiene %d sillas%n", v3.getMatricula(), v3.getNumSillas());

        //3. Creación de objetos t1, t2, y t3 instanciando la SubClase Taxi en sus tres constructores, respectivamente.
        //3.1 Instanciando taxi 1 con parámetro aa, usando el constructor super sin parámetros

        // System.out.print("Primer Taxi: ¿Tiene aire acondicionado? [S/N]");
        // resp = leer.next().charAt(0); // leer el primer caracter  si-no
        // aa = resp == 'S' || resp == 's'; // Operador booleno
        // Taxi t1 = new Taxi(aa);
        // System.out.printf("El taxi 1 con matricula %s tiene %d sillas y %s%n",t1.getMatricula(),t1.getNumSillas(),(t1.isAa() ? "Tiene aire a":"No tiene aire a"));

        //3.2 Instanciando taxi 2 con parámetro aa y matricula, usando el constructor super con un parámetro.
        // System.out.println("Segundo Taxi: número de matricula: ");
        // matricula = leer.next();
        // System.out.println("Segundo Taxi: ¿Tiene aire acondicionado? [S/N]");
        // resp = leer.next().charAt(0); // leer el primer caracter  si-no
        // aa = resp == 'S' || resp == 's'; // Operador booleno
        // Taxi t2 = new Taxi(matricula, aa);
        // System.out.printf("El taxi 2 con matricula %s tiene %d sillas y %s%n",t2.getMatricula(),t2.getNumSillas(),(t2.isAa() ? "Tiene aire a":"No tiene aire a"));

        //3.3 Instanciando taxi 3 con parámetro aa, matricula y numSillas, usando el constructor super con dos parámetros.

        // System.out.println("Tercer Taxi: número de matricula: ");
        // matricula = leer.next();
        // System.out.println("Tercer Taxi: número de sillas: ");
        // numSillas = leer.nextInt();
        // System.out.println("Tercer Taxi: ¿Tiene aire acondicionado? [S/N]");
        // resp = leer.next().charAt(0); // leer el primer caracter  si-no
        // aa = resp == 'S' || resp == 's'; // Operador booleno
        // Taxi t3 = new Taxi(matricula, numSillas, aa);
        // System.out.printf("El taxi 3 con matricula %s tiene %d sillas y %s%n",t3.getMatricula(),t3.getNumSillas(),(t3.isAa() ? "Tiene aire a":"No tiene aire a"));

        //4. Creación de objeto c1 instanciando la SubClase Camioneta y aplica el concepto de sobre-escritura de métodos en el método getnumSillas para aumentar su numero de sillas sobre la base de 3 que le asigna el constructor.

        System.out.println("Camioneta: número de matricula: ");
        matricula = leer.next();
        System.out.println("Camioneta: número de sillas adicionales: ");
        sillasAdic = leer.nextInt();
        System.out.println("Camioneta: ¿Tiene aire acondicionado? [S/N]");
        resp = leer.next().charAt(0); // leer el primer caracter  si-no
        aa = resp == 'S' || resp == 's'; // Operador booleno
        Camioneta c1 = new Camioneta(matricula, aa);
        c1.setSillasAdicionales(sillasAdic);

        System.out.printf("La camioneta con matricula %s tiene %d sillas y %s%n",c1.getMatricula(),c1.getNumSillas(),(c1.isAa() ? "Tiene aire a":"No tiene aire a"));

        
    }
    
}
