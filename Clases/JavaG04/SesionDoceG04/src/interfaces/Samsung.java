package interfaces;

public class Samsung extends Telefono implements Gps,Camara {

    public Samsung(String marca, String modelo) {
        super(marca, modelo);
        
    }

    @Override
    public void encenderFlash() {
        System.out.println("Implementación del método encenderFlash dentro de la clase Samsung");
        
    }

    @Override
    public void apagarFlash() {
        System.out.println("Implementación del método apagarFlash dentro de la clase Samsung");
        
    }

    @Override
    public void seleccionarVista() {
        System.out.println("Implementación del método seleccionarVista dentro de la clase Samsung");
        
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Implementación del método obtenerCoordenadas dentro de la clase Samsung");
        
    }

    @Override
    public void buscarDireccion() {
        System.out.println("Implementación del método buscarDirección dentro de la clase Samsung");
        
    }
    
}
