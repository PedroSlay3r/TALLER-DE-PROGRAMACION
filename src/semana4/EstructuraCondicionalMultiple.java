/*
UNA EMPRESA DESEA ASIGNAR UN INCENTIVO A SUS TRABAJADORES DEPENDIENDO DEL TURNO EN QUE LABORES. EL INCENTIVO
SERÁ DE 100 SOLES, SI LABORA EN LA MAÑANA, DE 200 SI LA LABORA EN LA TARDE Y DE 300 EN DASO QUE LABORE EN LA NOCHE.
MOSTRAR EL VALOR DEL INCENTIVO
 */
package semana4;

import java.util.Scanner;

public class EstructuraCondicionalMultiple {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("PROGRAMA DE INCETIVOS");
        System.out.println("======================");

        // Variables
        int incentivo = 0; // No funcionaba porque no había inicializado el valor de "incentivo"
        String turno;

        // Print
        System.out.println("Turno: ");
        turno = teclado.next();

        // Determinar incentivo
        switch (turno) {
            case "Mañana":
                incentivo = 100;
                break;
            case "Tarde":
                incentivo = 100;
                break;
            case "Noche":
                incentivo = 100;
                break;
            default:
                System.out.println("No hay incetivos");
                /* incentivo = 0; // Aquí también podemos asegurar su valor por posibles conflictos */
                break;
        }      
        
        System.out.println("==================");
        System.out.println("Incentivo: " + incentivo);
        System.out.println("==================");
    }
}

// Investigar las funciones de la clase String
// Uppercase and Lowercase
