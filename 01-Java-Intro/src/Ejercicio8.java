import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        do {

            System.out.println("Ingrese una frase o palabra: ");
            frase = leer.nextLine();

            if (frase.length() > 8) {
                System.out.println("La frase/palabra solo puede ser de 8 caracteres");
            }

        } while (frase.length() > 8);

        System.out.println("CORRECTO");
    }
}
