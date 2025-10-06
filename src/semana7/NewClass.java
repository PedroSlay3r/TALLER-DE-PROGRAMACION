package semana7;

import java.util.Scanner;

/* 
    Ingresar por teclado un úmero entero.
    El programa finalizará cuando el número ingresado
    sea impar.
*/

/*  Para evaluar el resultado de la división.
    Ejem: 20 / 14 = 1.428571428571429
    En java lo hacemos de esta manera: 20 \ 14 = 1
    


*/

public class MineEjemploDoWhile01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
                
        do {            
            System.out.print("Ingrese su número par: ");
            numero = teclado.nextInt();
        } while (numero \ 2 = 1); // 
        System.out.println("=====================");
        System.out.println("El programa finalizó");
        System.out.println("=====================");
    }
}
