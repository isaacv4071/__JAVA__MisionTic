//split hace parte de la clase String, podemos generar un array a partir de una cadena
import java.util.*;
public class Bodega {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String listaCodigo[];
        int tablaCantidadBodega[][] = new int[50][50];
        int tablaCantidadMinima[][] = new int[50][50];
        System.out.println("Digite los códigos de productos separados por espacios: ");
        String linea = leer.nextLine();
        listaCodigo = linea.split(" ");
        int productos = listaCodigo.length;
        System.out.printf("La cantidad de productos son %d %n",productos);
        
        System.out.println("Digite la tabla de las cantidades de bodega separando las filas por punto y coma y la cantidades por espacios: ");
        linea = leer.nextLine();
        String filas[] = linea.split(";");
        int sedes = filas.length;
        System.out.printf("La cantidad de sedes son %d %n",sedes);
        for (int i = 0; i < sedes; i++) {
            String cantidades[] = filas[i].split(" ");
            for (int j = 0; j < productos; j++) {
                String num = cantidades[j];
                tablaCantidadBodega[i][j]=Integer.parseInt(num);
                System.out.print("\t" + tablaCantidadBodega[i][j]);
            }
            System.out.println();
        }

    }
    
}
