import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String moneda;
        Double euros;

        System.out.println("Ingrese una cantidad de euros: ");
        euros = leer.nextDouble();
        leer.nextLine();

        System.out.println("""
                *** Euros a ***
                 -Libras
                 -Dolares
                 -Yenes
                """);

        System.out.println("Escriba una moneda para la conversión: ");
        moneda = leer.nextLine().toLowerCase();

        conversorMoneda(euros, moneda);
    }

    static void conversorMoneda(Double euros, String moneda) {

        double conversion;
        switch (moneda){
            case "libras":
                conversion = euros * 0.86;
                System.out.println(euros+"€ equivalen a:  "+ conversion+ "£");
                break;
            case "yenes":
                conversion=euros * 129.852;
                System.out.println(euros+"€ equivalen a:  "+ conversion+ "¥");
                break;
            case "dolares":
                conversion=euros * 1.28611;
                System.out.println(euros+"€ equivalen a:  "+ conversion+ "$");
                break;
        }
    }
}
