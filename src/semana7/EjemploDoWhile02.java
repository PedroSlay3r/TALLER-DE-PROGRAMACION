package semana7;

import java.util.Scanner;

/* Ingresar por el teclado la nota de un estudiante
El programa finalizar� al ingresar un nota v�lida,
es decir que est� comprendida entre 0 y 20 */

public class EjemploDoWhile02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        
        do {            
            System.out.print("Ingrese su nota: ");
            nota = teclado.nextInt();
        } while (nota < 0 || nota > 20); // Operador de disyunci�n ||
        
        System.out.println("=================");
        System.out.println("Tu nota es: " + nota);
        System.out.println("=================");
        teclado.close();
    }
}
