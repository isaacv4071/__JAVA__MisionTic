/* SubClase Camioneta - Uso de super y sobre-escritura de métodos
Se define la SubClase Camioneta con los atributos
int sillasAdicionales; Nuevo atributos 
boolean: AA
y los parámetros de la SuperClase que son heredados
String: matricula
int: numSillas

Se definen un constructor:
Camioneta (String matricula, boolean AA) se usa super con paso de parámetro matrícula para llamar al constructor de la SuperClase que utiliza este parámetro. 
El númerode sillas por defecto es 3. 
El parámetro AA se inicia en el constructor Camioneta.

Se definen los métodos set y get para la variable de instancia AA de Camioneta
Se definen los métodos set y get para la variable de instancia sillasAdicionales
y con el método get se sobre-escribe el método getnumSillas de la SuperClase Vehiculo.
*/



package ejercicio2;

public class Camioneta extends Vehiculo{

    private boolean aa;
    private int sillasAdicionales;
    
    public Camioneta(String matricula, boolean aa) {
        super(matricula);
        this.aa = aa;
    }

    public boolean isAa() {
        return aa;
    }

    public void setAa(boolean aa) {
        this.aa = aa;
    }

    public int getSillasAdicionales() {
        return sillasAdicionales;
    }

    public void setSillasAdicionales(int sillasAdicionales) {
        this.sillasAdicionales = sillasAdicionales;
    }

    // Sobre- escribiendo metodo de la super clases Vehiculo.

    @Override
    public int getNumSillas() {
        int numSillasCam = super.getNumSillas()+sillasAdicionales;
        return numSillasCam;
    }

    
    
}
