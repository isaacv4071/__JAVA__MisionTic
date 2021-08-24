package CpS10;

public class Prenda extends Producto {
    private String talla;
    private boolean plancha;

    public Prenda(int codigo, String desc, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida,
            String talla, boolean plancha) {
        super(codigo, desc, pCompra, pVenta, cBodega, cMinRequerida, cMaxPermitida);
        this.talla = talla;
        this.plancha = plancha;
    }

    @Override
    public void mostrar() {
        System.out.printf("%d - %s - %d - %d - %d - %d - %d - %s - %s%n", getCodigo(), desc, pCompra, pVenta, cBodega,cMinRequerida, cMaxPermitida, talla, plancha);
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPlancha() {
        return plancha;
    }

    public void setPlancha(boolean plancha) {
        this.plancha = plancha;
    }

}
