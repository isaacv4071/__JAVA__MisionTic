package interfaces;

public class TelPrincipal {
    public static void main(String[] args) {
        
        Telefono tels[] = new Telefono[4];
        //Telefono t = new Telefono();

        tels[0] = new Iphone("Apple", "iPhone 12", "VST222", "300555555");
        tels[1] = new Samsung("Samsung", "Galaxy S21");
        tels[2] = new Inalambrico("Vtex", "10.4", "VTD444", "3016667777");
        tels[3] = new Iphone("Apple", "iPhone 16", "VXT000", "3218889999");

        for (int i = 0; i < tels.length; i++) {
            System.out.printf("Marca:  %s Modelo: %s%n",tels[i].marca,tels[i].modelo);

            if (tels[i] instanceof Iphone ){
                Iphone p = (Iphone)tels[i];
                p.obtenerCoordenadas();
                p.imprimeVelocidadLuz();
                System.out.println();
            } else if (tels[i] instanceof Samsung){
                Samsung s = (Samsung)tels[i];
                s.apagarFlash();
                System.out.println();
            }else{
                System.out.println("No eres instancia de Iphone ni de Samsung");
                System.out.println();
            }
        }



    }
    
}
