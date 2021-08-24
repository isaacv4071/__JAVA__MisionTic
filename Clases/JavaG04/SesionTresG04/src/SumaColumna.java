import java.util.*;

public class SumaColumna {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño de la matriz: ");
        int tam = leer.nextInt();

        // Creación de la matriz aleatoria
        int matriz[][] = new int[tam][tam];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);

            }
        }
        // Imprimir la matriz aleatoria
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }

        int suma=0;
        System.out.print("Columna a sumar: ");
        int colSum = leer.nextInt();
        if((colSum-1)<=matriz.length){
            for (int i = 0; i < matriz.length; i++) {
                suma+=matriz[i][colSum-1];
            }
            System.out.printf("La suma de la columna seleccionada es: %d", suma);
        }else{
            System.out.printf("Error, el máximo valor de columna es %d", tam);
        }

        leer.close();

    }

}
