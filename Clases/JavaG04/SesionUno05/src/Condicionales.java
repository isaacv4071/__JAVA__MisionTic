import java.util.Scanner;

// public class Condicionales {
//     public static void main(String[] args) {
//         Scanner leer = new Scanner(System.in);

//         System.out.print("Ingrese un valor: ");
//         int x = leer.nextInt();
//         if (x < 0) {
//             System.out.printf("%d es negativo %n", x);
//         } else {
//             System.out.printf("%d es positivo o 0 %n", x);
//         }
//         System.out.println("Esto ya está por fuera del condicional");
//         leer.close();
//     }
// }

// CONDICIONALES MULTIPLES
// public class Condicionales {
//     public static void main(String[] args) {
//         Scanner leer = new Scanner(System.in);

//         System.out.print("Ingrese un valor: ");
//         int x = leer.nextInt();
//         if (x < 0) {
//             System.out.printf("%d es negativo %n", x);
//         } else if (x == 0) {
//             System.out.printf("%d es cero %n", x);
//         } else {
//             System.out.printf("%d es positivo %n", x);
//         }
//         System.out.println("Esto ya está por fuera del condicional");
//         leer.close();
//     }
// }

// CONDICIONALES ANIDADOS
// Para un semáforo, consideremos una variable luz que puede tomar 
// el valor verde, amarillo o rojo 
// y una variable booleana que nos indica si hay peaton o no (hayPeaton), 
// las condiciones cambian así:
// Verde -------- 
// Si hay peaton - Pare, Sino - Siga
// Amarillo ----------- 
// Si hay peaton - Pare, Sino - Precaución
// Rojo = Pare

public class Condicionales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            String luz = "", resp ="";
            boolean peaton = true;
            
            System.out.print("Ingrese el color de la luz del semáforo: ");
            luz = leer.nextLine();
        
            System.out.print("Hay peatón [SI - NO]: ");
            resp = leer.nextLine();
        
            if (resp.equalsIgnoreCase("si")){
              peaton = true;
            } else{
              peaton = false;
            }
        
            if (luz.equalsIgnoreCase("verde")){
              if (peaton == true){
                System.out.println("PARE");
              } else{
                System.out.println("SIGA");
              } 
            } else if (luz.equalsIgnoreCase("amarillo")){
              if (peaton == true){
                System.out.println("PARE");
              } else{
                System.out.println("PRECAUCION");
              } 
            } else if (luz.equalsIgnoreCase("rojo") ){
              System.out.println("PARE");
            }
            leer.close();
    }
}