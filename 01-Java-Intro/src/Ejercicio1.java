import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");


        System.out.println("Ingrese el número 1: ");
        int num1 = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el número 2: ");
        int num2 = leer.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
