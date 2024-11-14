/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos;

/**
 *
 * @author melan
 */
public class EVA3_9_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] billetes = {20,50,100,500,1000};
        System.out.println(billetes.length);
        
        String[][] ciudades = {{"Aguascalientes","Calvillo","Jesus Maria"},
            {"Ensenada","Mexicali","Tecate","Tijuana"},
            {"La paz", "cabo San lucas", "San jose del cabo"}};
        
       
                for(int i = 0; i < ciudades.length; i++){
             for(int j = 0; j < ciudades[1].length; i++){
                 System.out.println(ciudades[i][j]);
                 
             }
            
        
        }
        
    }
        
    
    
}
