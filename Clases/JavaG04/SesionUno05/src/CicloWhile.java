import java.util.Scanner;

// public class CicloWhile {
//     public static void main(String[] args) {
//         Scanner leer = new Scanner(System.in);

//         System.out.print("Ingrese un número: ");
//         int numero = leer.nextInt();
//         int contador = 1;

//         while (contador < numero) {
//             if (contador % 2 == 0) {
//                 System.out.print(" " + contador);
//             }
//             // contador++; //Incrementa en 1 a contador
//             contador += 1;
//         }
//         leer.close();

//     }

// }

// Creemos un programa que dependa del usuario para deternerse. 
// En este caso, le solicitamos números al usuario hasta que éste ingrese -1, 
// y entonces el programa debe imprimir el promedio de todos los números ingresados 
// hasta ese momento (sin contar con el -1).

public class CicloWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        System.out.print(" Ingrese un número : ");
        double valor = leer.nextDouble();
        while (valor != -1) {
            suma += valor;
            contador = contador + 1; // contador++
            System.out.print(" Ingrese un número : ");
            valor = leer.nextInt();
        }
        System.out.printf("El promedio es: %.2f ", suma / contador);
        leer.close();

    }

}