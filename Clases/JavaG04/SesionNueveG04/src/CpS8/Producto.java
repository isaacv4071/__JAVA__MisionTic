package CpS8;

//Incluir atributo del CPS8
public class Producto {
    private int codigo;
    private int pCompra;
    private int pVenta;
    private int cBodega;
    private int cMinRequerida;
    private int cMaxPermitida;
    private static double pDescuento = 0.01;

    public Producto(int codigo, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida) {
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
        this.cMaxPermitida = cMaxPermitida;
    }

    public boolean solicitar(){
        if(cBodega < cMinRequerida){ //5<10=true
            return true;
        }else{
            return false;
        }

    }
                                    //30
    public double totalAPagar(double unidades){
        return (unidades * pCompra);  //30*15000
    }

    public int getcMaxPermitida() {
        return cMaxPermitida;
    }

    public void setcMaxPermitida(int cMaxPermitida) {
        this.cMaxPermitida = cMaxPermitida;
    }

    

    public static double getpDescuento() {
        return pDescuento;
    }

    public static void setpDescuento(double pDescuento) {
        Producto.pDescuento = pDescuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getcBodega() {
        return cBodega;
    }

    public int getcMinRequerida() {
        return cMinRequerida;
    }

    public double getpCompra() {
        return pCompra;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setcBodega(int cBodega) {
        this.cBodega = cBodega;
    }
                                    //50
    public void setcMinRequerida(int cMinRequerida) {
        if (cMinRequerida<0){
            this.cMinRequerida = 0;
        }else{
            this.cMinRequerida = cMinRequerida;
        }
        
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int getpVenta() {
        return pVenta;
    }

    public void setpVenta(int pVenta) {
        this.pVenta = pVenta;
    }

    
}
