import java.util.Scanner;

public class CodificadorDeVocales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Escriba la frase o palabra que desa codificar: ");
        String entradaUsuario = leer.nextLine();
        entradaUsuario = entradaUsuario.toLowerCase();


        String salidaUsuario = codificarFrase(entradaUsuario);

        System.out.println("Codificación: " + salidaUsuario);
    }

    static String codificarFrase(String entrada) {
        String salida = " ";
        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            switch (letra) {
                case 'a':
                    salida = salida.concat("@");
                    break;
                case 'e':
                    salida = salida.concat("#");
                    break;
                case 'i':
                    salida = salida.concat("$");
                    break;

                case 'o':
                    salida = salida.concat("%");
                    break;

                case 'u':
                    salida = salida.concat("*");
                    break;
                default:
                    salida = salida.concat(String.valueOf(entrada.charAt(i)));

            }
        }
        return salida;
    }
}
