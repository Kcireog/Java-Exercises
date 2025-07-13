import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase/palabra: ");
        String frase = leer.nextLine();

        if (frase.substring(0,1).equals("A")){ //substring(beginIndex) - substring(beginIndex,endIndex)
                                              //The beginIndex is inclusive and the endIndex is exclusive.
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
