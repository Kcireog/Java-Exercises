/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class PalindromicString {
    public static void main(String[] args) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        String palabra = "aña";

        palabra = palabra.toLowerCase();

        // TODO: SACAR LA VALIDACIÓN DEL ALFABETO INGLES PARA LA PALABRA

        if (esPalindromo(palabra)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    static boolean esPalindromo(String palabra) {
        int izquierda = 0;
        int derecha = palabra.length() - 1;
        if (palabra.matches("[a-zA-Z]+")) {
            while (izquierda < derecha) {
                if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                    return false; //indicaria que no es palindromo
                }
                izquierda++;
                derecha--;
            }
            return true; // es palindromo
        } else {
            System.out.println("Solo se permiten palabras con el alfabeto ingles");
            return false;
        }
    }


}
