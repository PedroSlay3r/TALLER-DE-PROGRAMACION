package semana2;

/* Desarrollar una aplicaicÃ³n en java que permita
ingresar 02 nÃºmeros y visualizar la suma de ellos */

import java.util.Scanner;

public class EstrucutraSecuencial2 {

    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("        SUMA         ");
        System.out.println("=====================");
        // Crea un objeto de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        // Declarar variables
        double numero1, numero2, suma;
        // Ingresar los nÃºmeros
        System.out.print("Número 1: ");
        numero1 = teclado.nextDouble();
        System.out.print("Número 2: ");
        numero2 = teclado.nextDouble();
        // Calcular la suma
        suma = numero1 + numero2;
        // Mostrar la suma
        System.out.println("=====================");
        System.out.println("El resultado es: " + suma);
        System.out.println("=====================");   
    }
}
