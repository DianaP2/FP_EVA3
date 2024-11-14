package eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author melan
 */

public class EVA3_6_EXAMEN_2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;

    public static void main(String[] args) {
        
        int jugadaUsu;
        int jugadaComp;
        int resuJugada;
        
        do{
            jugadaUsu = capturarJugada("Introduce tu jugada (1-Piedra, 2-Papel, 3-Tijeras, 0-Salir)");
            jugadaComp = generarJugadaComp();
            resuJugada = evaluarJugadas(jugadaUsu, jugadaComp);
            System.out.println(resuJugada);
            
        }while(jugadaUsu != 0);
       
    }
    
    //Pedir datos al usuario
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        return resu;
    }
    
    //Generar jugada de la computadora
    public static int generarJugadaComp(){
        int resu;
        double valor = Math.random();
        if((valor >= 0) && (valor < 0.3))
            resu = 1; //Piedra
        
        else if((valor >= 0.3) && (valor <0.6))
            resu = 2; //Papel
        
        else
            resu = 3; //Tijera
        
        return resu;
    }
    
    //Evaluar jugadas: 0-Empate, 1-Gano, 2-Perdio
    public static int evaluarJugadas(int jugadaU, int jugadaC){
        int resu;
        if ((jugadaU == PIEDRA) && (jugadaC == PIEDRA))
            resu = EMPATE;
        
        else if ((jugadaU == PIEDRA) && (jugadaC == PAPEL))
            resu = PIERDE;
        
        else if ((jugadaU == PIEDRA) && (jugadaC == TIJERA))
            resu = GANA;
        
        else if ((jugadaU == PAPEL) && (jugadaC == PIEDRA))
            resu = GANA;
        
        else if ((jugadaU == PAPEL) && (jugadaC == TIJERA))
            resu = EMPATE;
        
        else if ((jugadaU == PAPEL) && (jugadaC == TIJERA))
            resu = GANA;
        
        else if ((jugadaU == TIJERA) && (jugadaC == PIEDRA))
            resu =PIERDE;
        
        else if ((jugadaU == TIJERA) && (jugadaC == PAPEL))
            resu = GANA;
        
        else
            resu = EMPATE;
        
        return resu;
        
    }
    
    
}
