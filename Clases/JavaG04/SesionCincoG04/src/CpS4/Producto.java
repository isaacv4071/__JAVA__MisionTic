package CpS4;

public class Producto {
    public int codigo;
    public int pCompra;
    public int cBodega;
    public int cMinRequerida;

    public boolean solicitarP(){
        if(cBodega<cMinRequerida){
            return true;
        }else{
            return false;
        }
    }

}
