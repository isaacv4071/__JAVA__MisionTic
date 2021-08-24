package cajero;

public class AtmPrincipal {
    public static void main(String[] args) {
        Atm a = new Consulta();
        Atm.setSaldo(1000000);
        a.Operaciones();

    }
    
}
