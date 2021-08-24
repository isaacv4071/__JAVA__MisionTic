/* Herencia: SuperClase Vehículo
Acciones:
Se define la SuperClase Vehículo con los atributos
String: matricula
int: numSillas

Se definen tres constructores:
Vehiculo() sin paso de paso de parámetros. Los paramétros se inician de forma fija dentro del constructor.
Vehiculo(String matricula) con paso de parámetro matrícula y se fija el número de sillas.
Vehiculo(String matricula, int numSillas) con paso de todos  los parámetros

Se definen los métodos set y get para cada una de las variables de instancias
*/


package ejercicio2;

public class Vehiculo {
    protected String matricula;
    protected int numSillas;
    
    public Vehiculo(){  //Constructor 1
        this.matricula = "QAP678";
        this.numSillas = 3;
    }
    
    
    public Vehiculo(String matricula) {  //Constructor 2
        this.matricula = matricula;
        this.numSillas = 3;
    }



    public Vehiculo(String matricula, int numSillas) { //Constructor 3
        this.matricula = matricula;
        this.numSillas = numSillas;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public int getNumSillas() {
        return numSillas;
    }


    public void setNumSillas(int numSillas) {
        this.numSillas = numSillas;
    }

    


    
    
    
}
