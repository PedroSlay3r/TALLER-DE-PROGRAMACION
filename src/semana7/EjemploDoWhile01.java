package semana7;

import java.util.Scanner;
    /* 
        Ingresar por telcado un número. El proceso finalizará cuando el número ingresado sea cero.
        Ingresar número: 10 // no acepta repite
        Ingresar número: -10 // no acepta repite
        Ingresa
        
    */

public class EjemploDoWhile01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        do {            
            System.out.print("Ingrese número: ");
            numero = teclado.nextInt();
        } while (numero != 0); // Cuando el número sea difente de cero.
        
        System.out.println("====================");
        System.out.println("El programa finalizó");
        System.out.println("====================");
    }
}
