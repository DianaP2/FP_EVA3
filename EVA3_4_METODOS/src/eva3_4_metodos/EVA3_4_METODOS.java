package eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author melan
 */

public class EVA3_4_METODOS {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        /*System.out.println(encontrarMayor(8,7));*/
        System.out.println(diaSemana(1));
        
    
    }
    
    //Valor mas grande entre dos enteros
    public static int encontrarMayor(int num1, int num2){
        /*int resu;
        
        if (num1 > num2)
            resu = num1;
        else 
            resu = num2;
        
        return resu;*/
        
        if (num1>num2){
            return num1;
        
        }else{
            return num2;
        }
        
    }
    
    //Metodo que regrese el dia de la semana en texto. Pide el numero
    //1 a 7 y regresa num de la semana
    
    public static String diaSemana (int dia){
        
       switch(dia){
           case 1:
               return "Lunes";
           case 2:
               return "Martes";
            case 3:
               return "Miercoles";
            case 4:
               return "Jueves";
            case 5:
               return "Viernes";
            case 6:
               return "Sabado";
            case 7:
               return "Domingo";
            default:
                System.out.println("No valido");
       }
        return null;
       
        
    }
}
