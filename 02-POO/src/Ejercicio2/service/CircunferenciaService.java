package Ejercicio2.service;

import Ejercicio2.entity.Circunferencia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircunferenciaService {

    private Scanner leer;

    public CircunferenciaService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearCircunferencia(){
        System.out.println("Radio de la circunferencia: ");
        Double radio = leer.nextDouble();

        Circunferencia circunferencia = new Circunferencia(radio);

        calcularArea(circunferencia);
        calcularPerimetro(circunferencia);
        mostrarCircunferencia(circunferencia);
    }

    private Double calcularArea(Circunferencia circunferencia){

        return Math.pow(circunferencia.getRadio(), 2)*Math.PI;
    }

    private Double calcularPerimetro(Circunferencia circunferencia){
        return 2*Math.PI*circunferencia.getRadio();
    }

    private void mostrarCircunferencia(Circunferencia circunferencia){
        System.out.println("***DATOS CIRCUNFERENCIA");
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Radio: " + circunferencia.getRadio());
        System.out.println("Area: " + df.format(calcularArea(circunferencia)));
        System.out.println("Perimetro: " + df.format(calcularPerimetro(circunferencia)));
    }
}
