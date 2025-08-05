import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tiempo en minutos: ");
        int minutosIngresados = leer.nextInt();

        int dias = minutosIngresados / 1440;
        int minutosRestantes = minutosIngresados % 1440;
        int horas = minutosRestantes / 60;

        System.out.println(minutosIngresados+" minutos equivales a: "+ dias +" dias, "+horas+" horas");
    }
}
