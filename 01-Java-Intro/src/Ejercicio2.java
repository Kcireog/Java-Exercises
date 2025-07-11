import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Hola "+nombre);
    }
}
