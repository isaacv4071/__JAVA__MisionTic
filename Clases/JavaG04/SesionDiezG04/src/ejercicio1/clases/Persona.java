package ejercicio1.clases;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int id;
    protected String celular;

    
    public Persona(String nombre, String apellido, int id, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.celular = celular;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getCelular() {
        return celular;
    }


    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    

    
}
