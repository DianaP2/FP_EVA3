package eva3_2_valor_retorno;

/**
 *
 * @author melan
 */
public class EVA3_2_VALOR_RETORNO {

    public static void main(String[] args) {
        //Necesitamos recuperar el valor, para hacer algo con el
        int resu;
        resu=sumarDosNumeros(5,10);
        System.out.println("Resultado: " + resu);
        
        //Segunda alternativa --> Se utiliza si solo lo vas a utilizar una ves
        System.out.println("Resultado: " + sumarDosNumeros(5,10));
        
        //No les interesa el resultado
        sumarDosNumeros(5,10); //El resultado se pierde
    }
    public static int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
    
}
