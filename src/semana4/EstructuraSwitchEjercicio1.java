package semana4;

import java.util.Scanner;

public class EstructuraSwitchEjercicio1 {

    public static void main(String[] args) {
        // Para mostrar el t√≠tulo
        System.out.println("==============================");
        System.out.println("     PUNTAJE DE EVALUACI”N   ");
        System.out.println("==============================");

        // Para definir el scanner teclado
        Scanner teclado = new Scanner(System.in);

        int score;
        System.out.print("Ingrese su puntaje: ");
        score = teclado.nextInt();

        System.out.print("SU ESTADO ES: ");

        // Sin factorizar
        /* switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Descartado");
                break;
            case 5:
                System.out.println("En suspenso");
                break;
            case 6:
                System.out.println("Aceptable");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
        } */
        
        // Factorizado
        switch (score) {
            case 0, 1, 2, 3, 4:
                System.out.println("Descartado");
                break;
            case 5:
                System.out.println("En suspenso");
                break;
            case 6:
                System.out.println("Aceptable");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
        }

    }
}
