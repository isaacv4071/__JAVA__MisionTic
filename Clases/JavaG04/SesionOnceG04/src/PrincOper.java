public class PrincOper {
    public static void main(String[] args) {
        
        Operaciones sum = new Suma();
        sum.pedirDatos();
        sum.Operacion();
        System.out.printf("El resultado de la suma es: %d ", sum.mostrarResultado());
        System.out.println();

        Resta res = new Resta();
        res.pedirDatos();
        res.Operacion();
        System.out.printf("El resultado de la suma es: %d ", res.mostrarResultado());
        System.out.println();

    }
    
}
