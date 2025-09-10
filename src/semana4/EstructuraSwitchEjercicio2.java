package semana4;

import java.util.Scanner;

public class EstructuraSwitchEjercicio2 {
    public static void main(String[] args) {
        // Para imprimir esto:
        System.out.println("=====================");
        System.out.println("CONVERTIDOR DE MONEDA");
        System.out.println("=====================");
                
        Scanner teclado = new Scanner(System.in);
        
        // Variables de entrada
        int moneda;
        int monto;
        
        System.out.print("De soles a qué quiere convertir: ");
        System.out.println("1. USD / 2. EUR");
        System.out.print("Escriba su opción: ");
        moneda = teclado.nextInt();
        
        System.out.println("Escriba su monto en soles: ");
        monto = teclado.nextInt();
                    
        switch (moneda) {
            case 1:
                System.out.println("Su conversión a USD es: " + monto / 3.82);
                break;
            case 2:
                System.out.println("Su conversión a USD es: " + monto * 4.17);
                break;
            default:
                System.out.println("FATAL ERROR");
                break;
        }
    }
 }
