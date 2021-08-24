package CpS10;

public class Calzado extends Producto{

    private int talla;

    public Calzado(int codigo, String desc, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida,int talla) {
        super(codigo, desc, pCompra, pVenta, cBodega, cMinRequerida, cMaxPermitida);
        this.talla = talla;
    }

    @Override
    public void mostrar(){
        System.out.printf("%d - %s - %d - %d - %d - %d - %d - %s%n", getCodigo(),desc,pCompra,pVenta, cBodega,cMinRequerida,cMaxPermitida,talla);
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    
    
}
