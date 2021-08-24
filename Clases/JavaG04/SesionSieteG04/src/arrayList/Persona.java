package arrayList;

public class Persona {
    private String nombre;
    private int id;
    private int edad;


    public Persona(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    

    @Override
    public String toString() {
        String mensaje= "La persona se llama " + nombre + " con número de identificación "+ id + " y tiene " + edad + " edad";
        return mensaje;
    }



    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
}
