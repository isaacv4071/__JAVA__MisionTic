package cajero;

public class Consulta extends Atm {

    public void transacciones(){
        System.out.println("Tu saldo actual es: " + getSaldo());
    }
    
}
