/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

import java.util.Scanner;

/**
 * Imprimir por pantalla la tabla de multiplicar de un número
 */
public class EjemploFo05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String menu = """
                      ===========================
                          TABLA DE MULTIPLICAR
                      ===========================""";
        System.out.println(menu);

        // Declarar variables
        int numero;

        // Ingresar el número
        System.out.print("Ingrese un número: ");
        numero = teclado.nextInt();

        System.out.println("======================");
        for (int i = 1; i <= 12; i++) {
            // System.out.println(numero + " x " + i + " = " + numero * i);
            // Otra manera de escribir ?
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
        System.out.println("======================");
    }E
}
