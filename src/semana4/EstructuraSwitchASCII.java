package semana4;

import java.util.Scanner;

public class EstructuraSwitchASCII {

    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("BIENVENIDOS A LA TABLA ASCII");
        System.out.println("============================");

        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa tu número: ");
        n = teclado.nextInt();
        
        char caracter = (char) n;
        
        System.out.println("============================");
        System.out.println("Tu caracter en ASCII es: " + caracter);
        System.out.println("============================");
    }
}
