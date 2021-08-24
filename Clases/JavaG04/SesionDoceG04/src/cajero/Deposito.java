package cajero;

public class Deposito extends Atm{

    public void transacciones(){
        System.out.println("Cuánto es tu deposito: ");
        deposito();

        setSaldo(getSaldo() + deposito);
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu nuevo saldo es: " + getSaldo());
    }
    
}
