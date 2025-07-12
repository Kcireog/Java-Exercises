import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabraCorrecta = "eureka";

        System.out.println("Ingrese una palabra: ");
        String frase = leer.nextLine();
        frase.toLowerCase();

        if(frase.equals(palabraCorrecta)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }



    }
}
