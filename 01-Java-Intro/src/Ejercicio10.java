import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int limiteSuma = 0;
        int suma = 0;

        do {
            if (suma == 0) {
                System.out.println("Ingrese el valor limite para la suma: ");
                limiteSuma = leer.nextInt();
                leer.nextLine();
            }

            System.out.println("Ingrese un número: ");
            int numero = leer.nextInt();
            leer.nextLine();

            suma += numero;

        } while (suma < limiteSuma);
        System.out.println("La suma es: " + suma);
    }
}
