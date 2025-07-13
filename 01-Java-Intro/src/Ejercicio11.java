import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String salir = "n";
        int suma = 0, resta = 0, multi = 0, divi = 0, opcion;

        System.out.println("Ingrese 2 números enteros positivos: ");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();

        do {
            System.out.println("""
                    -------------------
                        MENU
                       1. Sumar
                       2. Restar
                       3. Multiplicar
                       4. Dividir
                       5. Salir
                       Elija opcion:
                    -------------------
                    """);
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    suma = n1 + n2;
                    System.out.println(n1 + "+" + n2 + "=" + suma);
                    break;
                case 2:
                    resta = n1 - n2;
                    System.out.println(n1 + "-" + n2 + "=" + resta);
                    break;
                case 3:
                    multi = n1 * n2;
                    System.out.println(n1 + "x" + n2 + "=" + multi);
                    break;
                case 4:
                    divi = n1 / n2;
                    System.out.println(n1 + "/" + n2 + "=" + divi);
                    break;
                case 5:
                    System.out.println("Desea salir? S/N: ");
                    salir = leer.nextLine().toLowerCase();
                    break;
                default:
                    System.out.println("Opcion no valida!");
                    break;
            }

        } while (salir.equals("n"));
    }
}
