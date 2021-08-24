package ejemplo2;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    public Estudiante() {
        
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrar(){
        System.out.println("nombre " + nombre + " Carrera: " + carrera);
    }

    
    
}
