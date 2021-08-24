package interfaces;

public interface Gps {
    //Implicitamente este atributo es constante y static
    public double velocidadLuz = 300000000;

    //Los métodos son abstractos
    public void obtenerCoordenadas();
    public void buscarDireccion();



    
}
