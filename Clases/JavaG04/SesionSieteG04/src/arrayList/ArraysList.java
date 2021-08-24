package arrayList;
import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args){
        ArrayList <Persona> vPersona = new ArrayList<Persona>();
        Persona p1 = new Persona("Daniel", 1001, 23);
        Persona p2 = new Persona("Jesús", 1002, 33);
        Persona p3 = new Persona("Melissa", 1003, 28);

        //Adicionar los objetos al arrays

        vPersona.add(p1); // Daniel, 1001,23 pos 0
        vPersona.add(p2); // Jesus, 1002, 33 pos 1
        vPersona.add(p3); // Melissa, 1003, 28 pos 2

        //Imprimir el arrays de la forma convencional
        //size()= devuelve el tamaño del arrayslist
        
        // for (int i = 0; i < vPersona.size(); i++) {
        //     System.out.println(vPersona.get(i).toString());
        //     System.out.println(vPersona.get(i).getNombre());
            
        // }

        for (Persona p : vPersona) {
            System.out.println(p);  //Daniel, 1001,23 pos 0
            //System.out.println(p.getNombre());
            
        }
        
        //Remover un elemento de la lista
        // vPersona.remove(1);
        // System.out.println(vPersona.size());

        //Cambiar un elemento del vector
        vPersona.get(0).setNombre("Daniela");
        for (Persona p : vPersona) {
            System.out.println(p.getNombre());
        }


    }

    
}
