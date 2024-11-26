import java.util.Scanner;

public class JuegoDelGato {
    private static char[][] tablero = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    private static char turno = 'X';

    public static void main(String[] args) {
        boolean jugando = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego del gato!");
        imprimirTablero();

        while (jugando) {
            System.out.println("Turno del jugador " + turno + ". Ingresa tu jugada (fila y columna): ");
            int fila = scanner.nextInt() - 1; // Restar 1 para usar índices de matriz (0-2)
            int columna = scanner.nextInt() - 1;

            if (esJugadaValida(fila, columna)) {
                tablero[fila][columna] = turno;
                imprimirTablero();

                if (hayGanador()) {
                    System.out.println("¡Jugador " + turno + " ha ganado!");
                    jugando = false;
                } else if (esEmpate()) {
                    System.out.println("¡Es un empate!");
                    jugando = false;
                } else {
                    cambiarTurno();
                }
            } else {
                System.out.println("Jugada inválida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }

    private static void imprimirTablero() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    private static boolean esJugadaValida(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    private static void cambiarTurno() {
        turno = (turno == 'X') ? 'O' : 'X';
    }

    private static boolean hayGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == turno && tablero[i][1] == turno && tablero[i][2] == turno) return true;
            if (tablero[0][i] == turno && tablero[1][i] == turno && tablero[2][i] == turno) return true;
        }
        // Verificar diagonales
        if (tablero[0][0] == turno && tablero[1][1] == turno && tablero[2][2] == turno) return true;
        if (tablero[0][2] == turno && tablero[1][1] == turno && tablero[2][0] == turno) return true;

        return false;
    }

    private static boolean esEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') return false;
            }
        }
        return true;
    }
}
