/* SubClase Taxi - Uso de super (diferentes formas)
Se define la SubClase Taxi con los atributos
boolean: AA
y los parámetros de la SuperClase que son heredados
String: matricula
int: numSillas

Se definen tres constructores:
Taxi(boolean AA) se usa super sin paso de parámetros para llamar al constructor de la SuperClase sin paso de parámetros. El parámetro AA se inicia en el constructor Taxi.
Taxi(String matricula, boolean AA) se usa super con paso de parámetro matrícula  para llamar al constructor de la SuperClase que utiliza este parámetro. El parámetro AA se inicia en el constructor Taxi.
Taxi(String matricula, int numSillas) se usa super con paso de parámetro matrícula y numSillas para llamar al constructor de la SuperClase que utiliza todos los parámetros. El parámetro AA se inicia en el constructor Taxi.

Se definen los métodos set y get para la variable de instancia AA de Taxi
*/


package ejercicio2;

public class Taxi extends Vehiculo {
    private boolean aa;

    public Taxi(boolean aa) { // Constructor 1
        super();
        this.aa = aa;
    }

    public Taxi(String matricula, boolean aa) { // Constructor 2
        super(matricula);
        this.aa = aa;
    }

    public Taxi(String matricula, int numSillas, boolean aa) {
        super(matricula, numSillas);
        this.aa = aa;
    }

    public boolean isAa() {
        return aa;
    }

    public void setAa(boolean aa) {
        this.aa = aa;
    }

    
    
    
    
}
