
package eva3_8_arreglos_multi;

/**
 *
 * @author melan
 */

public class EVA3_8_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int[][][] cubo = new int [2][5][3];
        
        //Llenado
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 3; k++){
                  cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
        
        //Imprimir valores
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 3; k++){
                  cubo[i][j][k] = (int)(Math.random() * 100);
                  System.out.print("[" + cubo[i][j][k] + "]");
                }
            }
        }
    }
    
}
