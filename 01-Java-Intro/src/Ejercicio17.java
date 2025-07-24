public class Ejercicio17 {
    public static void main(String[] args) {

        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000) + 1;// 1-10000
        }

        contabilizarDigitos(vector);
    }

    static void contabilizarDigitos(int[] vector) {

        int contUno = 0;
        int contDos = 0;
        int contTres = 0;
        int contCuatro = 0;
        int contCinco = 0;
        for (int i = 0; i < vector.length; i++) {
            int digito = (int) Math.floor(Math.log10(Math.abs(vector[i])) + 1);
            switch (digito) {
                case 1:
                    contUno++;
                    break;
                case 2:
                    contDos++;
                    break;
                case 3:
                    contTres++;
                    break;
                case 4:
                    contCuatro++;
                    break;
                case 5:
                    contCinco++;
                    break;
            }
        }
        mostrarVector(vector);

        System.out.println("***CONTADOR DIGITOS***");
        System.out.println("Uno: " + contUno);
        System.out.println("Dos: " + contDos);
        System.out.println("Tres: " + contTres);
        System.out.println("Cuatro: " + contCuatro);
        System.out.println("Cinco: " + contCinco);


    }

    static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println();
    }
}
