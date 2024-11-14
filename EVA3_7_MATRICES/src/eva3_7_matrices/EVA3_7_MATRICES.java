
package eva3_7_matrices;

/**
 *
 * @author melan
 */

public class EVA3_7_MATRICES {

    public static void main(String[] args) {
        int[] arreglo = new int [5]; //Arreglo unidimensional
        int[][] matriz = new int[3][3]; 
        matriz[0][0] = 100; //Primera posicion
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900; //Ultima posicion
        
        for(int i = 0; i < 3; i++){ //Filas
            for(int j = 0; j < 3; j++){  //Columnas --> 2DA Dim
                System.out.print("[" + matriz[1][j] + "]"); 
            }
            System.out.println("");
        }
    }
    
}
