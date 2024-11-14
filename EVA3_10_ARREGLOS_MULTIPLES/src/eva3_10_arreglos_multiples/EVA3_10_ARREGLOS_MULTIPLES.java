package eva3_10_arreglos_multiples;

/**
 *
 * @author melan
 */

public class EVA3_10_ARREGLOS_MULTIPLES {

    public static void main(String[] args) {
          int[][][][][] cubo = new int [2][5][3][4][5];
        
        //Llenado
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                for(int l = 0; l<3; l++){
                     for(int k = 0; k < 4; k++){
                         for(int s = 0; s < 5; s++){
                             cubo[i][j][l][k][s] = (int)(Math.random() * 100);
                  
                        }
                  
                    }
                    
                }
               
            }
        }
        
        //Imprimir valores
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                for(int l = 0; l<3; l++){
                     for(int k = 0; k < 4; k++){
                         for(int s = 0; s < 5; s++){
                             cubo[i][j][l][k][s] = (int)(Math.random() * 100);
                             System.out.print("[" + cubo[i][j][l][k][s] + "]");
                  
                        }
                  
                    }
                    
                }
               
            }
        }
    }
    
}
