import java.util.Scanner;

public class SucesionDeFibonacci {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num;
        System.out.println("Ingrese la cantidad de números de la sucesion que desea ver: ");
        num = leer.nextInt();
        leer.close();

        int a = 0;
        int b = 1;

        System.out.println("Los primeros " + num + " números de la secuencia de Fibonacci son:");
        System.out.print(a + " "); // Imprimimos el primer número de la secuencia

        for (int i = 1; i < num; i++) {
            System.out.print(b + " ");
            int temp = b;
            b = a + b; // num actual
            a = temp; // num anterior

            //Guardo el b actual en temp.
            // Calculo el siguiente número de Fibonacci → a + b.
            // Actualizo a al valor anterior de b (que se guardo en temp).
        }


    }
}
