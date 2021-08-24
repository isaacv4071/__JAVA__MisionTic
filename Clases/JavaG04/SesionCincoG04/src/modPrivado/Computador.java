//Metodo constructor: da un estado inicial a nuestro objetos
/*
Sintaxis
public nombreClase(){  //Puede o no tener parametros

}
Métodos para acceder a una variable privada
Metodos getters y setters

get(Accedemos a las variables) son publicos y tiene retorno de valor
Visibilidad tipo de dato getnombremetodo(){}
public int getnombremetodo{
    return atritutoPrivado
}

set(Modifica o cambia valores en las variables), son publiicos y void
Visibilidad void setnombremetodo(parametro){
public void setnombremetodo(parametro){
    atributoprivado = parametro
}

}
*/

package modPrivado;

public class Computador {
    public String marca;
    public String tipo;
    public String modelo;
    private String sistemaOperativo;
    private int ram;
    public int tamano;
    //private int espacioDD;

    //Metodos constructores

    // public Computador(){
    //     marca = "HP";
    //     tipo = "Escritorio";
    //     sistemaOperativo = "Mac";
    //     ram = 16;
    // }

    public Computador(String marca, String tipo, String modelo, String sistemaOperativo, int ram, int tamano) {
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.tamano = tamano;
    }

    

    //Metodos getters

    public String getSistmaOperativo(){
        return sistemaOperativo;
    }

    public int getRam(){
        return ram;
    }

    public void setSistemaOperativo(String so){
        sistemaOperativo = so;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    //Metodo con retorno sin parametros
    public boolean ampliarRam(){
        if (ram<=4){
            return true;
        }else{
            return false;
        }
    }

}
