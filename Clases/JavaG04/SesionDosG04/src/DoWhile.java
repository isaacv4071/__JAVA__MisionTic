import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int numaleatorio =(int)(Math.random()*100);
        System.out.println(numaleatorio);
        Scanner leer = new Scanner(System.in);
        int numero;
        int intentos=0;
        // do{
        //     intentos++;
        //     System.out.print("Ingrese número: ");
        //     numero = leer.nextInt();
        //     if (numaleatorio<numero){
        //         System.out.println("El número es más bajo");
        //     }else if (numaleatorio>numero) {
        //         System.out.println("El número es más alto");
        //     }
        // }while(numero!=numaleatorio);
        // System.out.printf("Muy bien!!, lo lograste en %d intentos",intentos);
        
        System.out.print("Ingrese número: ");
        numero = leer.nextInt();
        while(numero!=numaleatorio){
            intentos++;
            System.out.print("Ingrese número: ");
            numero = leer.nextInt();
            if (numaleatorio<numero){
                System.out.println("El número es más bajo");
            }else if (numaleatorio>numero) {
                System.out.println("El número es más alto");
            }

        }
        System.out.printf("Muy bien!!, lo lograste en %d intentos",intentos);
        leer.close();
    
    }
    
}
/* do{
        intrucciones;
    }while(condicion);

    random() # numeros aleatorios de 0 a 1

*/