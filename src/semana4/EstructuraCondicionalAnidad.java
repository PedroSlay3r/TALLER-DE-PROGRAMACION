package semana4;

// Llamar las funciones de Java Scanner
import java.util.Scanner;

public class EstructuraCondicionalAnidad {

    public static void main(String[] args) {

        // SHORTCUT (Ctrl + shift + ? ? ? ?)
        System.out.println("===================================");
        System.out.println("BIENVENIDOS A LA CONSULTA DE BONO");
        System.out.println("===================================");

        Scanner teclado = new Scanner(System.in);

        // Variables
        int edad, ingresos;
        // String bono;

        System.out.println("Escriba su edad: ");
        edad = teclado.nextInt();
        System.out.println("Escriba sus ingresos: ");
        ingresos = teclado.nextInt();

        /*
        // Una manera de resolverlo
        if (edad >= 65) {
            if (ingresos <= 800) {
                System.out.println("=================");
                System.out.println("Recibiras el bono");
                System.out.println("=================");
            }

        } else {
            System.out.println("===================");
            System.out.println("No recibirá el bono");
            System.out.println("===================");
        }
         */
        // Otra manera de resolverlo
        if (edad >= 65 && ingresos <= 800) {
            System.out.println("=================");
            System.out.println("Recibiras el bono");
            System.out.println("=================");
        } else {
            System.out.println("===================");
            System.out.println("No recibirá el bono");
            System.out.println("===================");
        }
        System.out.println("Fin de la consulta");
    }
}
