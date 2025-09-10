package semana4;

import java.util.Scanner;

public class EstructuraSwitchLambda {

    public static void main(String[] args) {

        // Para mostrar el título
        System.out.println("==============================");
        System.out.println("     PUNTAJE DE EVALUACIÓN    ");
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
            default -> "Puntaje inv�lido"; // Esto va de caj�n, de no ser as� no funcionar�a el programa
        };
        
        System.out.print("SU ESTADO ES: " + descripcion);
    }
}
