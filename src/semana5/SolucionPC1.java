package semana5;

import java.util.Scanner;

public class SolucionPC1 {
    public static void main(String[] args) {
        
        // Crear objeto de la clase escaner
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("==========================");
        System.out.println("    NOTARIA SÁNCHEZ       ");
        System.out.println("==========================");
        
        // Declarar variables en números reales por el manjeo de datos porcentuales
        double totalHerencia, herenciaHermano1, herenciaHermano2, herenciaHermano3;
        
        // Ingreso de datos
        System.out.print("Herencia total: ");
        totalHerencia = teclado.nextDouble();
        
        // Proceso: determinar la herencia de cada hermano
        herenciaHermano1 = 0.2 * totalHerencia;
        herenciaHermano2 = 0.35 * totalHerencia;
        herenciaHermano3 = totalHerencia - herenciaHermano1 - herenciaHermano2;
        
        // Mostrar resultados
        System.out.println("==========================");
        System.out.println("Herencia heramno 1: " + herenciaHermano1);
        System.out.println("Herencia heramno 2: " + herenciaHermano2);
        System.out.println("Herencia heramno 3: " + herenciaHermano3);
        System.out.println("==========================");
        
    }
}
