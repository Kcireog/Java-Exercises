import java.util.Arrays;

public class Ejercicio15 {
    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("[" + array[i] + "] ");
            if(i% 10 == 0){ //multiplos de 10, par ver mejor en consola
                System.out.println();
            }
        }
    }
}
