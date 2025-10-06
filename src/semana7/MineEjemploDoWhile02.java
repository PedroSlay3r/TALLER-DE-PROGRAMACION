package semana7;

import java.util.Scanner;

/* 
    Ingresar por teclado un úmero entero.
    El programa finalizará cuando el número ingresado
    sea par.
*/

public class MineEjemploDoWhile02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
                
        do {            
            System.out.print("Ingrese su número par: ");
            numero = teclado.nextInt();
        } while (numero % 2 != 0); // Para números impares (numero / 2 == 2 / numero).
        System.out.println("=====================");
        System.out.println("El programa finalizó");
        System.out.println("=====================");
    }
}
