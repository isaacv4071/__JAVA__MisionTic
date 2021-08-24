package CpS6;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de productos");
        int n = Integer.parseInt(leer.nextLine());
        Producto productos[]= new Producto[n]; //Declaramos el vector de objetos
        for(int i = 0; i < n; i++){
            System.out.println("Digite el codigo del producto: ");
            int cod = Integer.parseInt(leer.nextLine());
            System.out.println("Digite el precio de compra del producto: ");
            int valor = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la cantidad en bodega del producto: ");
            int cantB = Integer.parseInt(leer.nextLine());
            System.out.println("Cantidad máxima de inventario permitida: ");
            int cantM = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la cantidad minima requerida en bodega: ");
            int cMin = Integer.parseInt(leer.nextLine());
            
            productos[i] = new Producto(cod, valor, cantB, cMin, cantM); //Constructor da valores iniciales a los atributos
        }

        int may = productos[0].getcBodega();  // 10
        Producto pMay = productos[0]; // codigo,pCompra,cBodega,cMinReq,cMaxPermi

        for(int i = 0; i < n; i++){            //i=3
            if(productos[i].solicitar()){
                System.out.println("Alerta Generada para el código " + productos[i].getCodigo());
            }else{
                System.out.println("No se solicitara producto de código " + productos[i].getCodigo());
            }
            if(productos[i].getcBodega() > may){ //5>20
                may = productos[i].getcBodega(); //20
                pMay = productos[i];  //codigo13,pCompra15000,cBodega20,cMinReq15,cMaxPerm80
            }
        }  
        
        System.out.println("El codigo del producto con el mayor numero de unidades en bodega es " + pMay.getCodigo() + " con una cantidad en bodega de: " + may);

        System.out.println("Digite el código del producto: "); 
        int cp = Integer.parseInt(leer.nextLine()); //13
        System.out.println("Digite las unidades de compra: ");
        double uc = Double.parseDouble(leer.nextLine()); //120
        boolean sw = true;
        
        for (int i = 0; i < n; i++) { //i=1
            if(productos[i].getCodigo()==cp){ //13==13
                if(uc<productos[i].getcMaxPermitida()){//120<80
                    double vDesc = productos[i].totalAPagar(uc)*Producto.getpDescuento();
                    System.out.printf("El descuento para el código %d es: $ %,.0f%n",cp,vDesc);
                    double vNeto = productos[i].totalAPagar(uc)-vDesc;
                    System.out.printf("El total a pagar es: $ %,.0f%n",vNeto);
                }else{
                    System.out.printf("Las unidades de compra %,.0f superan la cantidad max en bodega %d%n", uc, productos[i].getcMaxPermitida());
                }
                sw=false;
                
            }
        }
        if (sw == true){
            System.out.println("Código no encontrado");
        }

        leer.close();
    
    }
}
