public class Computador {
    public String marca;
    public String tipo;
    public String modelo;
    public String sistemaOperativo;
    public int ram;
    public int tamano;
    public int espacioDD;

    //Metodo con retorno sin parametros
    public boolean ampliarRam(){
        if (ram<=4){
            return true;
        }else{
            return false;
        }
    }

}
