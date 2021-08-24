/*
El llamado de un atributo o método estatico es
nombreClase.atributoestatico
nombreClase.metodoestatico()
*/

public class PrinTrabajor {
    public static void main(String[] args){
        System.out.println("El salario básico es de: " + Trabajador.salarioBasico);
        // Trabajador.salarioBasico=200000;

        //Trabajador.auxTransporte=200000;
        System.out.println("El auxilio de transporte : " + Trabajador.auxTransporte);

        Boolean subsidio = Trabajador.derechoTransporte(10000000);
        System.out.println("Requiere subsidio: " + subsidio);
        
        //System.out.println("El iva es del " + Trabajador.getIva() + "%");

        // Trabajador t1 = new Trabajador();
        // System.out.println("El salario básico en la instancia es: " + t1.salarioBasico);
        
    }
    
}
