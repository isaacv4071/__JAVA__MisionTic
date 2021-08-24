package ejemplo1.clases;

public class Estudiante extends Persona {
    private double nota1, nota2, nota3;
    private String codigo;

    public void imprimirPadre(){
        System.out.printf("El estudiantes %s %s ",nombre,apellido);
    }

    public double promedio(){
        return ((nota1+nota2+nota3)/3);
    }

    public double getNota1() {  //acceder al valor del atributo
        return nota1;
    }
                           //    4
    public void setNota1(double nota1) { //Modifica o cambia el valor del atributo
        this.nota1 = nota1; //4
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    
}
