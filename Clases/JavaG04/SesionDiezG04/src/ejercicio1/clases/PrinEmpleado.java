package ejercicio1.clases;

public class PrinEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Carolina", "Muñoz", 32789, "301234567", "A23", "Bancolombia", 9999999, 7);
        System.out.printf("%s %s cuenta de ahorros %s #%d%n",e1.getNombre(), e1.getApellido(),e1.getBanco(),e1.getNroCuenta());
    }
    
}
