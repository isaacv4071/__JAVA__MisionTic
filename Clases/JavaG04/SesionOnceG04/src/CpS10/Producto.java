package CpS10;

public class Producto {
    private int codigo;
    protected String desc;
    protected int pCompra;
    protected int pVenta;
    protected int cBodega;
    protected int cMinRequerida;
    protected int cMaxPermitida;
    protected static double pDescuento = 0.01;

    public Producto(int codigo, String desc, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida) {
        this.codigo = codigo;
        this.desc = desc;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
        this.cMaxPermitida = cMaxPermitida;
    }

    public void mostrar(){
        System.out.printf("%d - %s - %d - %d - %d - %d - %d%n", codigo,desc,pCompra,pVenta, cBodega,cMinRequerida,cMaxPermitida);
    }

    public boolean solicitar(){
        if(cBodega < cMinRequerida){ //5<10=true
            return true;
        }else{
            return false;
        }

    }
                                    
    public double totalAPagar(double unidades){
        return (unidades * pCompra);  
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
