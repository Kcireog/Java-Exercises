import java.util.ArrayList;
import java.util.List;

public class Ejercicio21 {
    public static void main(String[] args) {

        int[][] matrizM = {
                {1, 2, 3, 47, 5, 6, 72, 81, 95, 10},
                {4, 5, 6, 21, 41, 22, 67, 20, 10, 61},
                {7, 8, 9, 90, 9, 90, 17, 12, 87, 67},
                {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
                {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}
        };

        int[][] matrizP = {
                {47, 5, 6},
                {21, 41, 22},
                {90, 9, 90},
        };

       List<int[]> posiciones = comprobarMatrizPEnMatrizM(matrizM,matrizP);
       mostrarMatrices(matrizM,matrizP);
       mostrarPosiciones(posiciones);

    }

    public static List<int[]> comprobarMatrizPEnMatrizM(int[][] matrizM, int[][] matrizP) {
        List<int[]> posiciones = new ArrayList<>();
        //Última fila válida desde donde puede empezar una submatriz 3x3 es 10 - 3 = 7
        for (int i = 0; i < (matrizM.length - matrizP.length); i++) {//para asegurar que las submatrices no se salgan del limite
            for (int j = 0; j < (matrizM[0].length - matrizP[0].length); j++) {
                if (esSubMatriz(matrizM, matrizP, i, j)) {
                    posiciones.add(new int[]{i, j});
                }
            }
        }
        return posiciones;
    }

    private static boolean esSubMatriz(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio) {

        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[0].length; j++) {
                // sumamos los indices de P para poder mover(estar en la posición correcta de M)
                // la ventana de 3x3 en la matriz M
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {// iterara 3 veces para comprobar los valores
                    // de matrizP en matrizM
                    return false;
                }
            }
        }
        return true;
    }

    public static void mostrarMatrices(int[][] matrizM, int [][] matrizP) {
        for(int []fila:matrizM){
            for (int valor:fila){
                System.out.println("["+valor+"] ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        for(int []fila:matrizP){
            for (int valor:fila){
                System.out.println("["+valor+"] ");
            }
            System.out.println();
        }
    }

    public static void mostrarPosiciones(List<int[]> posiciones){
        if(posiciones.isEmpty()){
            System.out.println("La submatriz P no se encuentra en la matriz M");
        }else{
            System.out.println("La submatriz P inicia en la siguientes posiciones de la matriz M:");
            for (int[] posicion:posiciones){
                System.out.println("Fila: "+posicion[0] + " Columna: " + posicion[1]);
            }
        }
    }
}
