import java.util.Scanner;

public class Extra4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número (1-10): ");
        int num = scanner.nextInt();

        conversorNumerosRomanos(num);
    }

    public static void conversorNumerosRomanos(int num){

        String numRomano;

        String [] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String [] decenas = {"","X"};

        int indexDecenas,indexUnidades;

        //contamos las decenas
        indexDecenas = num / 10; // cuantas veces cabe 10 en el número actual
        //quitamos las decenas del num
        num = num % 10;

        indexUnidades = num;// el restante luego de las operaciones seran las unidades (1-9)

        System.out.println(num+ " en números romanos es: \n"+decenas[indexDecenas] +unidades[indexUnidades]);
    }
}
