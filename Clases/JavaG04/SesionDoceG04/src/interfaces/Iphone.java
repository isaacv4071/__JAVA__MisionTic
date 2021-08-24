package interfaces;

public class Iphone extends Telefono implements Gps, Camara {

    public Iphone(String marca, String modelo, String serial, String numTelefono) {
        super(marca, modelo, serial, numTelefono);
        
    }

    @Override
    public void encenderFlash() {
    
        System.out.println("Implementación del método encenderFlash dentro de la clase Iphone");
        
    }

    @Override
    public void apagarFlash() {
        System.out.println("Implementación del método apagarFlash dentro de la clase Iphone");

        
    }

    @Override
    public void seleccionarVista() {
        System.out.println("Implementación del método seleccionarVista dentro de la clase Iphone");
        
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Implementación del método obtenerCoordenadas dentro de la clase Iphone");        
    }

    @Override
    public void buscarDireccion() {
        System.out.println("Implementación del método buscarDireccion dentro de la clase Iphone");
 
    }

    public void imprimeVelocidadLuz(){
        System.out.println("Velocidad Luz: " + velocidadLuz);
    }
    
}
