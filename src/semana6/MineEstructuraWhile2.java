package semana6;

// Para usar el Scanner
import java.util.Scanner;

public class MineEstructuraWhile2 {
    
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("GENERARDOR DE IM�GENES");
        System.out.println("=========================");
        
        System.out.print("Porfavor escriba cu�ntas im�genes quiere generar (1 - 80): ");
        // Para obtener datos
        Scanner teclado = new Scanner(System.in);
        
        // Declaraci�n de variables
        int cantidad = 0;
        cantidad = teclado.nextInt();
        
        System.out.println("GENERANDO...");
        
        while (cantidad <=80) {
            cantidad = cantidad + 1;
            System.out.println("Imagen " + cantidad);
        }      
    }    
}
