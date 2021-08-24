/*
SINTAXIS
int matriz[][] = new [100][100];
int matriz[][] = {{1,2,3},
                  {4,5,6}}
*/
public class Matrices {

    public static void main(String[] args){
        int matriz[][] = {{1,2,3},
                          {4,5,6}};
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
            
        }

    }
}

