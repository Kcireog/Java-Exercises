public class Ejercicio17 {
    public static void main(String[] args) {

        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999) + 1;// 1-99999
        }
        int[] numDigitos = new int[6];  // Índice 0 no se utiliza, del 1 al 5 dígitos. No hay números con 0 digitos

        contabilizarDigitos(vector, numDigitos);
        mostrarVector(vector);
        mostrarResultados(numDigitos);
    }

    private static void contabilizarDigitos(int[] vector, int[] numDigitos) {

        for (int num : vector) {
            int digitos = contarDigitos(num);
            if (digitos >= 1 && digitos <= 5) {
                numDigitos[digitos]++;
            }
        }
    }

    private static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        int digitos = 0;
        digitos = (int) Math.floor(Math.log10(Math.abs(numero)) + 1);
        return digitos;
    }

    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println();
    }

    private static void mostrarResultados(int[] numDigitos) {
        System.out.println("\nResultados:");
        for (int i = 1; i < numDigitos.length; i++) {
            System.out.println("Números de " + i + " dígito(s): " + numDigitos[i]);
        }
    }
}