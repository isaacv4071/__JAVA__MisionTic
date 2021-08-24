package modPrivado;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Computador c1 = new Computador("IMB", "Portatil", "xxx", "Linux", 32, 16); // Metodo constructor

        //c1.marca="Acer";
        // c1.tipo="Portátil";
        // c1.modelo="Aspire E5";
        // c1.sistemaOperativo="Windows10";
        // c1.tamano=14;
        // c1.ram=8;

        // System.out.print("Marca del computador: ");
        // c1.marca = leer.nextLine();
        // System.out.print("tipo del computador: ");
        // c1.tipo = leer.nextLine();
        // System.out.print("modelo del computador: ");
        // c1.modelo = leer.nextLine();

        System.out.print("RAM del computador: ");
        int cRam = Integer.parseInt(leer.nextLine());
        System.out.print("SO del computador: ");
        String sistemaO = leer.nextLine();
        
        c1.setSistemaOperativo(sistemaO);
        c1.setRam(cRam);

        System.out.printf("Mi Pc marca %s es un tipo %s con SO %s y RAM de %d",c1.marca, c1.tipo,c1.getSistmaOperativo(),c1.getRam());
        
        System.out.println("");
        if(c1.ampliarRam()){
            System.out.println("Debe ampliar su memoria RAM");
        }else{
            System.out.println("Su memoria RAM es la adecuada");
        }
        leer.close();
    }
}
