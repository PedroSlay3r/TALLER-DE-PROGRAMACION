// Para llamar a la carpeta llamada semana2
package semana2;

// Para importar el framework de Scanner
import java.util.Scanner;

// Para crear una clase pública
public class EstructuraSecuencial1 {
    /* SHORTCUT: psvm → System.out.println(); */
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("            SUMA            ");
        System.out.println("============================");
        
        // Para crear un objeto de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Para declarar variables
        double numero1, numero2, suma;
        
        // Para ingresar los números con el teclado
        numero1 = 20;
        numero2 = 8;
        
        // Para calcular suma
        suma = numero1 + numero2;
        
        /* SHORTCUT: sout → System.out.print(); */
        System.out.println("La suma es: " + suma);
        teclado.close();
    }
}
