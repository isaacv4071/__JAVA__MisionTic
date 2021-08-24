import java.util.Arrays;

public class Vectores {
    public static void main(String[] args) {
        // String arreglo[] = new String[5]; //String, float, double
        // arreglo[0] = "1";
        // arreglo[1] = "45";
        // arreglo[2] = "18";
        // arreglo[3] = "21";
        // arreglo[4] = "11";
        // System.out.println(arreglo[2]);

        int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23 };
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println(Arrays.toString(arreglo));
//for each
        for (int numeros: arreglo ){
            System.out.print(numeros + " ");
        }

    }

}
