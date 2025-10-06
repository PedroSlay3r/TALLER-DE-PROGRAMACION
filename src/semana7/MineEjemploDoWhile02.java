package semana7;

import java.util.Scanner;

/* 
    Ingresar por teclado un �mero entero.
    El programa finalizar� cuando el n�mero ingresado
    sea par.
*/

public class MineEjemploDoWhile02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
                
        do {            
            System.out.print("Ingrese su n�mero par: ");
            numero = teclado.nextInt();
        } while (numero % 2 != 0); // Para n�meros impares (numero / 2 == 2 / numero).
        System.out.println("=====================");
        System.out.println("El programa finaliz�");
        System.out.println("=====================");
    }
}
