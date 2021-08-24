//Realizar un programa que simule las funciones básicas de un cajero automático
// 1. Consulta de saldo
// 2. Retiro de efectivo
// 3. Depósito de efectivo
// 4. Salir 
// El programa debe contener:
// - Abstracción
// - Encapsulamiento
// - Métodos getter y setter
// - Herencia
// - Polimorfismo

package cajero;
import java.util.Scanner;

public abstract class  Atm {
    protected int retiro, deposito;
    private static int saldo;

    Scanner leer = new Scanner(System.in);

    public void Operaciones(){
        boolean salir = false;

        do{
            System.out.println("Menú Cajero Atm");
            System.out.println("1. Consulta de saldo");
            System.out.println("2. Retiro de efectivo");
            System.out.println("3. Deposito de efectivo");
            System.out.println("4. Salir");
            
            System.out.println("Seleccione la opción: ");
            int opcion = leer.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    Atm con = new Consulta();
                    con.transacciones();
                    System.out.println();
                    break;
                case 2:
                    Atm ret = new Retiro();
                    ret.transacciones();
                    System.out.println();
                    break;
                
                case 3:
                    Atm dep = new Deposito();
                    dep.transacciones();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Vuelva pronto");
                    salir = true;
                    break;
            
                default:
                    System.out.println("Opción no válida... Vuelva a intentar");
                    break;
            }

        }while(!salir);
    }

    //Metodo abstracto
    public abstract void transacciones();


    //Método para solicitar cantidad de retiro
    public void retiro(){
        retiro = leer.nextInt();
    }

    //Métod para solicitar la cantidad a depositar
    public void deposito(){
        deposito = leer.nextInt();
    }

    
    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        Atm.saldo = saldo;
    }


    
    
}
