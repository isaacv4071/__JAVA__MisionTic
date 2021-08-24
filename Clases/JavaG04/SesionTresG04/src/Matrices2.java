import java.util.*;
public class Matrices2 {
    public static void main(String[] args){
        int fila, columna, i , j;
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de fila: ");
        fila = leer.nextInt();
        System.out.print("Cantidad de columna: ");
        columna = leer.nextInt();
        int matriz[][]=new int [fila][columna];
        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++){
                System.out.print("Elemento [" + (i+1) + "," + (j+1) + "]:" );
                matriz[i][j]=leer.nextInt();
            }
        }

        for (int k = 0; k < fila; k++) {
            for (int k2 = 0; k2 < columna; k2++) {
                System.out.print("\t" + matriz[k][k2]);
                
            }
            System.out.println("");
            
        }

   
        leer.close();

    }
    
}
