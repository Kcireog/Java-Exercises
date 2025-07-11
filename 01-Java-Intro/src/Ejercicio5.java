import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = leer.nextInt();

        System.out.println("*************");
        System.out.println(numero);
        System.out.println("Doble: "+ numero*2);
        System.out.println("Doble: "+ numero*3);
        System.out.println("Raíz cuadrada: "+ Math.sqrt(numero));
    }
}
