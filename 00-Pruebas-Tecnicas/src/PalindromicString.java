import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromicString {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palabra = br.readLine();

        //Validacion alfabeto ingles
        if (!palabra.matches("[a-z]+")) {
            System.out.println("NO");
            return;
        }

        if (esPalindromo(palabra)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    static boolean esPalindromo(String palabra) {
        int izquierda = 0;
        int derecha = palabra.length() - 1;
        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false; //indicaria que no es palindromo
            }
            izquierda++;
            derecha--;
        }
        return true; // es palindromo
    }

}
