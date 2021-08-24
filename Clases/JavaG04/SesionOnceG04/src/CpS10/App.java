package CpS10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de productos de calzado: ");
        int nc = Integer.parseInt(leer.nextLine());
        Producto productosC[] = new Producto[nc]; 
        
        for (int i = 0; i < nc; i++) {
            System.out.println("Digite el codigo del producto: ");
            int cod = Integer.parseInt(leer.nextLine());
            System.out.println("Digite el precio de compra del producto: ");
            int vCompra = Integer.parseInt(leer.nextLine());
            System.out.println("Digite el precio de venta del producto: ");
            int vVenta = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la cantidad en bodega del producto: ");
            int cantB = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la cantidad minima requerida en bodega: ");
            int cMin = Integer.parseInt(leer.nextLine());
            System.out.println("Cantidad máxima de inventario permitida: ");
            int cantM = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la descripcion del producto: ");
            String desc = leer.nextLine();
            System.out.println("Digite la cantidad la talla del producto: ");
            int talla = Integer.parseInt(leer.nextLine());

            productosC[i] = new Calzado(cod, desc, vCompra, vVenta, cantB, cMin, cantM,talla); 
        }

        System.out.println("Digite la cantidad de productos prendas: ");
        int np = Integer.parseInt(leer.nextLine());
        Producto productosP[] = new Producto[np]; 

        for (int i = 0; i < np; i++) {
            System.out.println("Digite el codigo del producto: ");
            int cod = Integer.parseInt(leer.nextLine());
            System.out.println("Digite el precio de compra del producto: ");
            int vCompra = Integer.parseInt(leer.nextLine());
            System.out.println("Digite el precio de venta del producto: ");
            int vVenta = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la cantidad en bodega del producto: ");
            int cantB = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la cantidad minima requerida en bodega: ");
            int cMin = Integer.parseInt(leer.nextLine());
            System.out.println("Cantidad máxima de inventario permitida: ");
            int cantM = Integer.parseInt(leer.nextLine());
            System.out.println("Digite la descripcion del prodcuto: ");
            String desc = leer.nextLine();
            System.out.println("Digite la talla del prodcuto: ");
            String talla = leer.nextLine();
            System.out.println("Digite 1 si se puede planchar el producto, 0 en caso contrario: ");
            String pla = leer.nextLine();

            if(pla.equalsIgnoreCase("1")){
                productosP[i] = new Prenda(cod, desc, vCompra, vVenta, cantB, cMin, cantM, talla, true);
            }else{
                productosP[i] = new Prenda(cod, desc, vCompra, vVenta, cantB, cMin, cantM, talla, false);
            }

        }
        System.out.println();
        boolean salir = false;
        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Verificar productos a pedir de calzado y prendas");
            System.out.println("2. Verificar productos a pedir de calzado y prendas");
            System.out.println("3. Calzado con mayor cantidad de unidadess");
            System.out.println("4. Prenda con mayor cantidad de unidades");
            System.out.println("5. Modificar cantidad mínima requerida en bodega");
            System.out.println("6. Vender producto");
            System.out.println("7. Salir");
            System.out.print("Digite la opción deseada: ");
            int op = leer.nextInt();
            leer.nextLine();
            System.out.println();
            int cp, cv;
            String tp;
            boolean sw;

            switch (op) {
                case 1:
                System.out.println("Digite el código del producto: ");
                cp = Integer.parseInt(leer.nextLine());
                System.out.println("Digite el tipo de producto (P: prenda, C: calzado): ");
                tp = leer.nextLine();
                sw = true;
                if(tp.equalsIgnoreCase("p")){
                    for (int i = 0; i < np; i++) {
                        if (productosP[i].getCodigo() == cp) {
                            productosP[i].mostrar();
                            sw = false;
                            break;
                        }
                    }
                    if (sw){
                        System.out.println("Código no encontrado");
                    }

                }else{
                    for (int i = 0; i < nc ;i++) {
                        if (productosC[i].getCodigo() == cp) {
                            productosC[i].mostrar();
                            sw = false;
                            break;
                        }
                        
                    }
                    if (sw){
                        System.out.println("Código no encontrado");
                    }
                }
                
                System.out.println();
                break;

                case 2:
                    for (int i = 0; i < nc; i++) {
                        if (productosC[i].solicitar()) {
                            System.out.println("Alerta Generada para el código " + productosC[i].getCodigo());
                        } else {
                            System.out.println("No se solicitara producto de código " + productosC[i].getCodigo());
                        }
                    }
                    System.out.println();
                    for (int i = 0; i < np; i++) {
                        if (productosP[i].solicitar()) {
                            System.out.println("Alerta Generada para el código " + productosP[i].getCodigo());
                        } else {
                            System.out.println("No se solicitara producto de código " + productosP[i].getCodigo());
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    int mayC = productosC[0].getcBodega();
                    Producto pMayC = productosC[0]; 

                    for (int i = 0; i < nc; i++) { 

                        if (productosC[i].getcBodega() > mayC) { 
                            mayC = productosC[i].getcBodega(); 
                            pMayC = productosC[i]; 
                        }
                    }

                    System.out.println("El codigo del producto de calzado con el mayor numero de unidades en bodega es "
                            + pMayC.getCodigo() + " con una cantidad en bodega de: " + mayC);
                    System.out.println();
                    break;
                case 4:
                    int mayP = productosP[0].getcBodega();
                    Producto pMayP = productosP[0]; 

                    for (int i = 0; i < np; i++) { 

                        if (productosP[i].getcBodega() > mayP) { 
                            mayP = productosP[i].getcBodega(); 
                            pMayP = productosP[i]; 
                        }
                    }

                    System.out.println("El codigo del producto con el mayor numero de unidades en bodega es "
                            + pMayP.getCodigo() + " con una cantidad en bodega de: " + mayP);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Digite el código del producto: ");
                    cp = Integer.parseInt(leer.nextLine());
                    System.out.println("Digite el tipo de producto (P: prenda, C: calzado): ");
                    tp = leer.nextLine();
                    System.out.println("Digite la nueva cantidad minima requerida para el producto:");
                    int cmn = leer.nextInt();
                    sw = true;
                    int getcmn = 0;
                    if(tp.equalsIgnoreCase("p")){
                        for (int i = 0; i < np; i++) {
                            if (productosP[i].getCodigo() == cp) {
                                if (cmn < productosP[i].getcMaxPermitida()) {
                                    productosP[i].setcMinRequerida(cmn);

                                } else {
                                    System.out.printf(
                                            "Las unidades nuevas requeridas %d superan la cantidad max en bodega %d%n", cmn,
                                            productosP[i].getcMaxPermitida());
                                }
                                getcmn = productosP[i].getcMinRequerida(); 
                                sw = false;
                                break;
                            }
                        }
                        if (sw) {
                            System.out.println("Código no encontrado");
                        } else {
                            System.out.printf("La nueva cantidad mínima requerida en bodega para el producto %d es %d%n",
                                    cp, getcmn);
                        }
                    }else{
                        for (int i = 0; i < nc; i++) {
                            if (productosC[i].getCodigo() == cp) {
                                if (cmn < productosC[i].getcMaxPermitida()) {
                                    productosC[i].setcMinRequerida(cmn);

                                } else {
                                    System.out.printf(
                                            "Las unidades nuevas requeridas %d superan la cantidad max en bodega %d%n", cmn,
                                            productosC[i].getcMaxPermitida());
                                }
                                getcmn = productosC[i].getcMinRequerida(); 
                                sw = false;
                                break;
                            }
                        }
                        if (sw) {
                            System.out.println("Código no encontrado");
                        } else {
                            System.out.printf("La nueva cantidad mínima requerida en bodega para el producto %d es %d%n",
                                    cp, getcmn);
                        }

                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Digite el código del producto: ");
                    cp = Integer.parseInt(leer.nextLine());
                    System.out.println("Digite el tipo de producto (P: prenda, C: calzado): ");
                    tp = leer.nextLine();
                    System.out.println("Digite las unidades a vender");
                    cv = leer.nextInt();
                    sw = true;
                    if(tp.equalsIgnoreCase("p")){
                        for (int i = 0; i < np; i++) {
                            if (productosP[i].getCodigo() == cp) {
                                if (cv <= productosP[i].getcBodega()){
                                    double tFacSinDes = cv * productosP[i].getpVenta();
                                    double tFacConDes = tFacSinDes-(tFacSinDes*Producto.getpDescuento());
    
                                    System.out.printf("Valor factura sin descuento: %,.0f%n",tFacSinDes);
                                    System.out.printf("Valor factura con descuento: %,.0f%n",tFacConDes);
    
                                    productosP[i].setcBodega(productosP[i].getcBodega()-cv);
    
                                }else{
                                    System.out.println("Cantidad a vender supera las existencias en bodega");
                                }
                                sw = false;
                                break;
                            }
                            
                        }
                        if (sw){
                            System.out.println("Código no encontrado");
                        }

                    }else{
                        for (int i = 0; i < nc ;i++) {
                            if (productosC[i].getCodigo() == cp) {
                                if (cv <= productosC[i].getcBodega()){
                                    double tFacSinDes = cv * productosC[i].getpVenta();
                                    double tFacConDes = tFacSinDes-(tFacSinDes*Producto.getpDescuento());
    
                                    System.out.printf("Valor factura sin descuento: %,.0f%n",tFacSinDes);
                                    System.out.printf("Valor factura con descuento: %,.0f%n",tFacConDes);
    
                                    productosC[i].setcBodega(productosC[i].getcBodega()-cv);
    
                                }else{
                                    System.out.println("Cantidad a vender supera las existencias en bodega");
                                }
                                sw = false;
                                break;
                            }
                            
                        }
                        if (sw){
                            System.out.println("Código no encontrado");
                        }
                    }
                    
                    System.out.println();
                    break;
                case 7:
                    salir = true;
            }
        } while (!salir);
        leer.close();
    }
}
