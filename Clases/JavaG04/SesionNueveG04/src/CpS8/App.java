package CpS8;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de productos");
        int n = Integer.parseInt(leer.nextLine());
        Producto productos[] = new Producto[n]; // Declaramos el vector de objetos
        for (int i = 0; i < n; i++) {
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

            productos[i] = new Producto(cod, vCompra, vVenta, cantB, cMin, cantM); // Constructor da valores iniciales a
                                                                                   // los atributos
        }
        System.out.println();
        boolean salir = false;

        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Verificar productos a pedir");
            System.out.println("2. Producto con mayor cantidad de unidades");
            System.out.println("3. Total a pagar por pedido a realizar");
            System.out.println("4. Modificar cantidad mínima requerida en bodega");
            System.out.println("5. Vender producto");
            System.out.println("6. Salir");
            System.out.print("Digite la opciòn deseada: ");
            int op = leer.nextInt();
            System.out.println();
            int cp;

            switch (op) {
                case 1:
                    for (int i = 0; i < n; i++) { // i=3
                        if (productos[i].solicitar()) {
                            System.out.println("Alerta Generada para el código " + productos[i].getCodigo());
                        } else {
                            System.out.println("No se solicitara producto de código " + productos[i].getCodigo());
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    int may = productos[0].getcBodega(); // 10
                    Producto pMay = productos[0]; // codigo,pCompra,cBodega,cMinReq,cMaxPermi

                    for (int i = 0; i < n; i++) { // i=3

                        if (productos[i].getcBodega() > may) { // 5>20
                            may = productos[i].getcBodega(); // 20
                            pMay = productos[i]; // codigo13,pCompra15000,cBodega20,cMinReq15,cMaxPerm80
                        }
                    }

                    System.out.println("El codigo del producto con el mayor numero de unidades en bodega es "
                            + pMay.getCodigo() + " con una cantidad en bodega de: " + may);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite el código del producto: ");
                    cp = leer.nextInt();
                    System.out.println("Digite las unidades de compra: ");
                    double uc = leer.nextDouble(); // 120
                    boolean sw = true;

                    for (int i = 0; i < n; i++) { // i=1
                        if (productos[i].getCodigo() == cp) { // 13==13
                            if (uc < productos[i].getcMaxPermitida()) {
                                double vDesc = productos[i].totalAPagar(uc) * Producto.getpDescuento();
                                System.out.printf("El descuento para el código %d es: $ %,.0f%n", cp, vDesc);
                                double vNeto = productos[i].totalAPagar(uc) - vDesc;
                                System.out.printf("El total a pagar es: $ %,.0f%n", vNeto);
                            } else {
                                System.out.printf("Las unidades de compra %,.0f superan la cantidad max en bodega %d%n",
                                        uc, productos[i].getcMaxPermitida());
                            }
                            sw = false;
                            break;

                        }
                    }
                    if (sw == true) {
                        System.out.println("Código no encontrado");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Digite el código del producto: ");
                    cp = leer.nextInt();
                    System.out.println("Digite la nueva cantidad minima requerida en bodega");
                    int cmn = leer.nextInt();
                    sw = true;
                    int getcmn = 0;
                    for (int i = 0; i < n; i++) {
                        if (productos[i].getCodigo() == cp) {
                            if (cmn < productos[i].getcMaxPermitida()) {
                                productos[i].setcMinRequerida(cmn);

                            } else {
                                System.out.printf(
                                        "Las unidades nuevas requeridas %d superan la cantidad max en bodega %d%n", cmn,
                                        productos[i].getcMaxPermitida());
                            }
                            getcmn = productos[i].getcMinRequerida(); // 3
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
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Digite el código del producto: ");
                    cp = leer.nextInt();
                    System.out.println("Digite la cantidad a vender");
                    int cv = leer.nextInt();
                    sw = true;
                    for (int i = 0; i < n; i++) {
                        if (productos[i].getCodigo() == cp) {
                            if (cv <= productos[i].getcBodega()){
                                double tFacSinDes = cv * productos[i].getpVenta();
                                double tFacConDes = tFacSinDes-(tFacSinDes*Producto.getpDescuento());

                                System.out.printf("Valor factura sin descuento: %,.0f%n",tFacSinDes);
                                System.out.printf("Valor factura con descuento: %,.0f%n",tFacConDes);

                                productos[i].setcBodega(productos[i].getcBodega()-cv);

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
                    System.out.println();
                    break;
                case 6:
                    salir = true;
            }
        } while (!salir);
        leer.close();

    }
}
