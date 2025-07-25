public class Ejercicio18 {
    public static void main(String[] args) {

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        llenarMatrices(matrizA, matrizB);
        mostrarMatrices(matrizA, matrizB);

    }

    public static void llenarMatrices(int[][] matrizA, int[][] matrizB) {

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                //j pasa a ser fila y i columna
                matrizB[j][i] = matrizA[i][j]; // ponemos lo que estaba en filas a columnas, así conseguimos la transpuesta
            }
        }
    }

    public static void mostrarMatrices(int[][] matrizA, int[][] matrizB) {
        System.out.println("Matriz principal");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("[" + matrizA[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.print("[" + matrizB[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
