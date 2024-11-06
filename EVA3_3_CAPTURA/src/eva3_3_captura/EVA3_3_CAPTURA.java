package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido = capturarTexto("Introduce tu apellido");
        int edad2 = capturarEdad("Introduce tu edad");
        double salario = capturarSalario("Introduce salario");
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("Edad " + edad2);
        System.out.println("salario" + salario);

    }
    
    //Capturar texto
    public static String capturarTexto(String mensaje){
        Scanner captu= new Scanner (System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
    }
    
    public static int capturarEdad (String edad){
        Scanner captu2 = new Scanner (System.in);
        System.out.println(edad);
        int numero = captu2.nextInt();
        return numero;
        
    }
    
    public static double capturarSalario (String salario){
        Scanner captu3 = new Scanner (System.in);
        System.out.println(salario);
        double sal = captu3.nextDouble();
        return sal;
    }

   
    
}
