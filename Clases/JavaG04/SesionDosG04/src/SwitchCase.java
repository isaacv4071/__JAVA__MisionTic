import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Menu de opciones \n1. Cuadrado\n2. Rectángulo \n3. Triángulo \n4. Círculo");
        System.out.print("Elige una opción: ");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Introduce el valor del lado: ");
                double lado = leer.nextDouble();
                System.out.printf("El área del cuadrado es %.2f", Math.pow(lado, 2));
                break;
            case 2:
                System.out.print("Introduce el valor del base: ");
                double base = leer.nextDouble();
                System.out.print("Introduce el valor de la altura: ");
                double altura = leer.nextDouble();
                System.out.printf("El área del rectángulo es %.2f", base * altura);
                break;
            case 3:
                System.out.print("Introduce el valor del base: ");
                base = leer.nextDouble();
                System.out.print("Introduce el valor de la altura: ");
                altura = leer.nextDouble();
                System.out.printf("El área del triángulo es %.2f", (base * altura) / 2);
                break;
            case 4:
                System.out.print("Introduce el valor del radio: ");
                double radio = leer.nextDouble();
                System.out.printf("El área del cículo es %.2f", Math.PI*(Math.pow(radio, 2)) );
                break;
            default:
                System.out.print("Opción no válida");
        }
        leer.close();
    }

}
