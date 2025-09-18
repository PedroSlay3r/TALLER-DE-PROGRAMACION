package pedro.pablo.gomez.estrada;

import java.util.Scanner;

public class PEDROPABLOGOMEZESTRADA {

    public static void main(String[] args) {
        // Acción Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Mostrar en pantalla
        System.out.println("Ingrese el monto de la herencia");
        
        // Variable de entrada
        int herencia = teclado.nextInt();
       
        // Varialbe de salida
        int herencia1, herencia2, herencia3;
        
        // Proceso
        herencia1 = (herencia * 20) / 100;
        herencia2 = (herencia * 35) / 100;
        herencia3 = (herencia * 45) / 100;
        
        // Salida 
        System.out.println("A cada uno le corresponderá");
        System.out.println("Hermano 1 (20%): " + herencia1);
        System.out.println("Hermano 2 (35%): " + herencia2);
        System.out.println("Hermano 3 (45%): " + herencia3);
    }
}
