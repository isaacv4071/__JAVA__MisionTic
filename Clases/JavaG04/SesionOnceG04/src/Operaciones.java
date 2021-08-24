/**
 * Polimorfismo:
Es la capacidad que tiene un método para responder de diferentes formas.
El polimorfismo se puede definir como la cualidad que tienen los objetos para responder de distinto modo a un mismo mensaje.
Para conseguir un comportamiento polimórfico en un programa Java se debe cumplir lo siguiente:
- Los métodos deben estar declarados (métodos abstractos) y a veces también pueden estar implementados (métodos no abstractos) en la clase base. (no se pueden crear objetos de una clase abstracta)
- Los métodos debes estar redefinidos en las clases derivadas.
- Los objetos deben ser manipulados utilizando referencias a la clase base.

El polimorfismo es posible porque, cuando se invoca un método mediante una referencia a una clase base, se ejecuta la versión del método correspondiente a la clase del objeto referenciado y no al de la clase de la variable que lo referencia.

Por lo tanto, el método que se ejecuta se decide durante la ejecución del programa.
A este proceso de decidir en tiempo de ejecución qué método se ejecuta se le denomina enlazado dinámico.

El enlazado dinámico es el mecanismo que hace posible el polimorfismo.
 
 */

import java.util.Scanner;

public abstract class Operaciones {
    protected int valorUno, valorDos, resultado;

    Scanner leer = new Scanner(System.in);

    public void pedirDatos(){
        System.out.print("Ingrese el primer valor: ");
        valorUno = Integer.parseInt(leer.nextLine());
        System.out.print("Ingrese el segundo valor: ");
        valorDos = Integer.parseInt(leer.nextLine());
   }

    public abstract void Operacion();

    public int mostrarResultado(){
        return resultado;
    }
    
}
