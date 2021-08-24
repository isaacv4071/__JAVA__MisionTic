package ejemplo2;

public abstract class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(){
        this.nombre = "Carmen";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo abstracto
    public abstract void mostrar();
    
    
}
