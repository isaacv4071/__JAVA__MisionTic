/*
Variables y métodos estaticos

- No actuan sobre objetos
- No acceden  a los campos copias(variables, constantes, declaradas en la clase)
- para llamarlos se utiliza el nombreclase.nombremeto() nombreclase.nombreatributo
*/

public class Trabajador {
    private static float iva = 19;
    public static final float salarioBasico = 908526;
    public static float auxTransporte = 102853;
    
    public static boolean derechoTransporte(float salario){
        return salario<=2*salarioBasico;
    }


    public static float getIva() {
        return iva;
    }
    public static void setIva(float iva) {
        Trabajador.iva = iva;
    }

}
