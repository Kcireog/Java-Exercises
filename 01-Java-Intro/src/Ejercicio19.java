import java.util.Random;

public class Ejercicio19 {

    public static void main(String[] args) {

        int[][] matrizA = new int[3][3];
        int[][] matrizT = new int[3][3];


        llenarMatrices(matrizA, matrizT);
        boolean esAntiSimetrica = comprobarAntisimetrica(matrizA, matrizT);
        if (esAntiSimetrica) {
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
        mostrarMatrices(matrizA, matrizT);
    }

    public static void llenarMatrices(int[][] matrizA, int[][] matrizT) {

        Random random = new Random();
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizA[i][j] = random.nextInt(21) - 10;// valores entre -10 y 10
            }
        }

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
                matrizT[j][i] = matrizA[i][j];
            }
        }
    }

    public static boolean comprobarAntisimetrica(int[][] matrizA, int[][] matrizT) {

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                if (matrizA[i][j] != -matrizT[i][j]) {//al negar el valor de la trasnpuesta
//                                                          estaremos invirtiendo el signo del num
                    return false;
                }
            }
        }

        return true;
    }

    public static void mostrarMatrices(int[][] matrizA, int[][] matrizT) {

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("[" + matrizA[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
                System.out.print("[" + matrizT[i][j] + "] ");
            }
            System.out.println();
        }
    }

}
