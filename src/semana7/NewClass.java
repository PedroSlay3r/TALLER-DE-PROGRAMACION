package semana7;

import java.util.Scanner;

/* 
    Ingresar por teclado un �mero entero.
    El programa finalizar� cuando el n�mero ingresado
    sea impar.
*/

/*  Para evaluar el resultado de la divisi�n.
    Ejem: 20 / 14 = 1.428571428571429
    En java lo hacemos de esta manera: 20 \ 14 = 1
    


*/

public class MineEjemploDoWhile01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
                
        do {            
            System.out.print("Ingrese su n�mero par: ");
            numero = teclado.nextInt();
        } while (numero \ 2 = 1); // 
        System.out.println("=====================");
        System.out.println("El programa finaliz�");
        System.out.println("=====================");
    }
}
