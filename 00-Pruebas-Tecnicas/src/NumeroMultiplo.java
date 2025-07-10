import java.util.Scanner;

public class NumeroMultiplo {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese primer número: ");
        int n1 = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese segundo número: ");
        int n2 = leer.nextInt();
        leer.nextLine();

        Boolean esMultiplo = esMultiplo(n1,n2);

        if (esMultiplo) {
            System.out.println(n1 +" es multiplo de "+n2);
        }else{
            System.out.println(n1 + " no es multiplo de "+n2);
        }

    }

    static Boolean esMultiplo(int n1, int n2) {
        double resultantDivision = (double) n1 /n2;
        return resultantDivision % 2 == 0 || resultantDivision % 2 == 1;
    }
}
