package semana4;

import java.util.Scanner;

public class EstructuraSwitchLambda {

    public static void main(String[] args) {

        // Para mostrar el tÃ­tulo
        System.out.println("==============================");
        System.out.println("     PUNTAJE DE EVALUACIÃ“N    ");
        System.out.println("==============================");

        // Para definir el scanner teclado
        Scanner teclado = new Scanner(System.in);

        int score;
        score = teclado.nextInt();
        
        /* System.out.print("Ingrese su puntaje: ");
        // Esto ya no es necesario agregar */

        String descripcion = switch (score) {
            case 0, 1, 2, 3, 4 -> "Detractor";
            case 5 -> "En suspenso";
            case 6 -> "Aceptable";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Puntaje inválido"; // Esto va de cajón, de no ser así no funcionaría el programa
        };
        
        System.out.print("SU ESTADO ES: " + descripcion);
    }
}
