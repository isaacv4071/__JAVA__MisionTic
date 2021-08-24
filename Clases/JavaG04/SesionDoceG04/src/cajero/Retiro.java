package cajero;

public class Retiro extends Atm {

    public void transacciones(){
        System.out.println("Cantidad a retirar: ");
        retiro();
        if (retiro <= getSaldo()){
            //transacciones = getSaldo();
            setSaldo(getSaldo()-retiro);
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu nuevo saldo es: " + getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
}
