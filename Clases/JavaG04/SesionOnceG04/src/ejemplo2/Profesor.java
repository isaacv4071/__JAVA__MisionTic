package ejemplo2;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre + " materia: " + materia);
    }

 
    
    
}
