public class Extra2 {
    public static void main(String[] args) {

        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        System.out.printf("""
                Valores Iniciales
                 A: %d
                 B: %d
                 C: %d
                 D: %d
                """, A, B, C, D);
        intercambiarValores(A, B, C, D);

    }

    public static void intercambiarValores(int A, int B, int C, int D) {

        int temp = B;

        B = C;
        C = A;
        A = D;
        D = temp;

        System.out.printf("""
                Valores Finales
                 A: %d
                 B: %d
                 C: %d
                 D: %d
                """, A, B, C, D);
    }
}
