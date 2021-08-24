package CpS5;
import java.util.Scanner;

public class PrincBod {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Producto p = new Producto(); //Metodo constructor
        System.out.print("Digite código del producto");
        p.codigo=leer.nextInt();
        System.out.print("Digite precio de compra del producto");
        p.pCompra=leer.nextInt();
        System.out.print("Digite la cantidad en bodega del producto");
        p.cBodega=leer.nextInt();
        System.out.print("Digite cantidad mínima requerida del producto");
        p.cMinRequerida=leer.nextInt();

        if(p.solicitarP()){
            System.out.println("Alerta!!! debe hacer pedido al proveedor");

        }else{
            System.out.print("No se debe hacer pedido al proveedor");
        }

        leer.close();
    }
    
}
