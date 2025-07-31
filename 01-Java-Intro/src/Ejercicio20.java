import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int[][] cuadradoMagico = new int[3][3];
        llenarMatriz(cuadradoMagico);

        boolean esCuadradoMagico = verificarCuadradoMagico(cuadradoMagico);
        mostrarMatriz(cuadradoMagico);
        if (esCuadradoMagico) {
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("No es un cuadrado magico");
        }

    }

    public static void llenarMatriz(int[][] cuadradoMagico) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los 9 valores (1-9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor;
                do {
                    System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
                    valor = leer.nextInt();
                    if ((valor < 1 || valor > 9)) {
                        System.out.println("Solo se permiten valores entre 1 y 9...");
                        valor = -1;
                    }
                } while (valor == -1);
                cuadradoMagico[i][j] = valor;
            }
        }
    }

    public static boolean verificarCuadradoMagico(int[][] m) {
        int suma = m[0][0] + m[0][1] + m[0][2]; // sumamos la primer fila, para tener valor de referencia

        // Verificar filas
        for (int i = 1; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += m[i][j];
            }
            if (sumaFila != suma) return false;
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 3; i++) {
                sumaCol += m[i][j];
            }
            if (sumaCol != suma) return false;
        }

        // Verificar diagonales
        int diag1 = m[0][0] + m[1][1] + m[2][2];
        int diag2 = m[0][2] + m[1][1] + m[2][0];
        if (diag1 != suma || diag2 != suma) return false;

        return true;

    }

    public static void mostrarMatriz(int[][] cuadradoMagico) {
        System.out.println("\nMatriz ingresada:");
        //for each solo para leer valores, para asignar se necesita del for tradicional
        for (int[] fila : cuadradoMagico) {// recorre cada fila de la matriz
            for (int val : fila) {// recorre cada número dentro de la fila
                System.out.print("[" + val + "] ");
            }
            System.out.println();
        }

    }
}
