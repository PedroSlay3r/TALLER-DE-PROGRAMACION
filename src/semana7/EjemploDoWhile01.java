package semana7;

import java.util.Scanner;
    /* 
        Ingresar por telcado un n�mero. El proceso finalizar� cuando el n�mero ingresado sea cero.
        Ingresar n�mero: 10 // no acepta repite
        Ingresar n�mero: -10 // no acepta repite
        Ingresa
        
    */

public class EjemploDoWhile01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        do {            
            System.out.print("Ingrese n�mero: ");
            numero = teclado.nextInt();
        } while (numero != 0); // Cuando el n�mero sea difente de cero.
        
        System.out.println("====================");
        System.out.println("El programa finaliz�");
        System.out.println("====================");
    }
}
