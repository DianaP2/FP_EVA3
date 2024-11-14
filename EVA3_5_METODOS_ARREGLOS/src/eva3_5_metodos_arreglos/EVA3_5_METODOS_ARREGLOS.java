package eva3_5_metodos_arreglos;

/**
 *
 * @author melan
 */

public class EVA3_5_METODOS_ARREGLOS {

    public static void main(String[] args) {
       String diasSemana[] = {"Lunes","Marstes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
       imprimirArreglo(diasSemana);
       
       System.out.println();
       
       String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
       imprimirArreglo(meses);
       
       System.out.println();
       
       int billetes[] = {20,50,100,200,500,1000};
       imprimirBilletes(billetes);
       
    }
    public static void imprimirArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
    }
    
     public static void imprimirBilletes(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
    }
    
    
    
}
