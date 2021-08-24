public class VectoresAlea {
    public static void main(String[] args){
        int arregloAle[] = new int[150];
        for (int i = 0; i < arregloAle.length; i++) {
            arregloAle[i]=(int)(Math.random()*100);
        }

        for(int numeros:arregloAle){
            System.out.print(numeros + " ");
        }
    }
    
}
