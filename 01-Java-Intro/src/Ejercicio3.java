import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String palabra = leer.nextLine();

        System.out.println("Minusculas: "+palabra.toLowerCase());
        System.out.println("Mayusculas: "+palabra.toUpperCase());
    }
}
