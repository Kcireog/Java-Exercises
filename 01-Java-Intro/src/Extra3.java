import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        String letra = scanner.nextLine();

        if(esVocal(letra)){
            System.out.println("El letra es una vocal");
        }else{
            System.out.println("El letra no es una vocal");
        }

    }

    public static boolean esVocal(String vocal){

        vocal = vocal.toLowerCase();

        return switch (vocal) {
            case "a", "e", "i", "o", "u" -> true;
            default -> false;
        };
    }
}
