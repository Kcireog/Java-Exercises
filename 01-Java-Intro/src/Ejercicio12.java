import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contLecturasCorrectas = 0;
        int contLecturasIncorrectas = 0;
        boolean largoCadena = false;
        String texto = "";
        while (true) {
            largoCadena = false; // para reiniciar la toma de la cadena de texto
            while (!largoCadena && !texto.equals("&&&&&")) {
                System.out.println("Ingrese una cadena de texto: ");
                texto = leer.nextLine().toUpperCase();
                largoCadena = validarCadenaDeCincoCaracteres(texto);
            }

            if (texto.equals("&&&&&")) { //condición de salida
                break;
            }
            if (texto.length() <= 5 && texto.charAt(0) == 'X' && texto.charAt(texto.length() - 1) == 'O') {
                contLecturasCorrectas++;
            } else {
                contLecturasIncorrectas++;
            }


        }
        System.out.println("Lecturas Correctas: " + contLecturasCorrectas
                + "\nLecturas Incorrectas: " + contLecturasIncorrectas);
    }

    static boolean validarCadenaDeCincoCaracteres(String cadena) {
        return cadena.length() <= 5;
    }
}
