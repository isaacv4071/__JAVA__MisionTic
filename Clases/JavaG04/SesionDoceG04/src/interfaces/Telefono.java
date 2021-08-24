package interfaces;

/*
 Objetivos:
 - Construir una SuperClase abstracta Telefono.
 - Contruir dos interfaces, GPS y Camara con métodos. Adicionalmente la clase GPS contiene una constante velocidadLuz. 
 - Crear dos clases que implementan/extiende de la superclase y las dos interfaces (IPhone, Samsung)
 - Crear una clase que solo extiende de la superclase(Inalambrico)
 - Implementar los metodos de las interfaces dentro de las subclases
 - Repasar herencia, abstraccion, multiples constructores.

 Partes del programa
 1. Creación de un vector de teléfonos que instancian objetos las SubClases. 
 Se demuestra su adaptabilidad a cada tipo de instancia.
 2. Recorrido del vector de instancias de SubClases para imprimir la informacion basica
 y se muestra la validación y cast para obtener los metodos adicionales para 
 las clases IPhone y Samsung.
 3. Impresión de la variable constante VelocidadLuz
 **/


public abstract class Telefono {
    protected String marca;
    protected String modelo;
    protected String serial;
    protected String numTelefono;

     //Creamos dos contructores
    
    public Telefono(String marca, String modelo, String serial, String numTelefono) {
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.numTelefono = numTelefono;
    }

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    

   
    



    
}
