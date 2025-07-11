import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados celsius °C: ");
        Double celsius = leer.nextDouble();

        Double farenheit = 32 + (9 * celsius/5);

        System.out.println("***Celsius a Farenheit***");
        System.out.println(celsius + "°C en farenheit: " + farenheit +"°F");
    }
}
