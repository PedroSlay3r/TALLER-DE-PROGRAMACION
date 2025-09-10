package semana3;

import java.util.Scanner;

public class EstructuraCondicionalDoble {

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("PROGRESIÓN ARITMÉTICA");
        System.out.println("======================");
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Numero 1: ");
        n1 = teclado.nextInt();
        System.out.print("Numero 2: ");
        n2 = teclado.nextInt();
        System.out.print("Numero 3: ");
        n3 = teclado.nextInt();
        if (n2 - n1 == n3 - n2) {
            System.out.println("============================");
            System.out.println("ES UNA PROGRESIÓN ARITMÉTICA");
            System.out.println("============================");
        } else {
            System.out.println("================================");
            System.out.println("NO ES UNA PROGRESIÓN ARITMÉTICA");
            System.out.println("================================");
        }
        teclado.close();
    }
}
