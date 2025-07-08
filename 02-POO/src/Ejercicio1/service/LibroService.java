package Ejercicio1.service;

import Ejercicio1.entity.Libro;

import java.util.Scanner;

public class LibroService {

    private Scanner leer;

    public LibroService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    //hacer un metodo privado solo cuando lo vayamos a usar exclusivamente dentro de la clase
    public void crearLibro() {

        System.out.println("-DATOS LIBRO-");

        System.out.println("Ingrese el ISBN: ");
        String isbn = leer.nextLine();
        System.out.println("Ingrese el titulo: ");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = leer.nextLine();
        System.out.println("Ingrese el numero de paginas: ");
        int numPaginas = leer.nextInt();

        Libro libro = new Libro(isbn, titulo, autor, numPaginas);

        listarLibros(libro);
    }

    private void listarLibros(Libro libro) {
        System.out.println(libro);
    }
}
