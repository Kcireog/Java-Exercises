import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {



        int [] vectorAdivinar = new int[10];

        for (int i = 0; i < vectorAdivinar.length; i++) {
            vectorAdivinar[i] = (int) (Math.random()*11);// 0-10
        }

        buscarNumeroVector(vectorAdivinar);

    }

    static void buscarNumeroVector(int[] vectorAdivinar){

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contarOcurrencias = 0;
        ArrayList<Integer> posicionOcurrencias = new ArrayList<Integer>();

        System.out.println("Número para buscar en el vector(0-10): ");
        int num = leer.nextInt();

        for (int i = 0; i < vectorAdivinar.length; i++) {
            if(vectorAdivinar[i] == num){
                posicionOcurrencias.add(i);
                contarOcurrencias++;
            }
        }
        mostrarVector(vectorAdivinar);
        System.out.println("El ("+num+") se encuentra en la posición: "+posicionOcurrencias);
        System.out.println("Y esta repetido "+contarOcurrencias+" veces");

    }

    static void mostrarVector(int[] vectorAdivinar){
        for (int i = 0; i < vectorAdivinar.length; i++) {
            System.out.print("["+vectorAdivinar[i]+"] ");
        }
        System.out.println();
    }

}
