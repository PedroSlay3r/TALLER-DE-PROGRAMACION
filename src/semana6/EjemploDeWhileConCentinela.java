/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class EjemploDeWhileConCentinela {
    
    // Los centinela son útiles para que el usuario vuelva a poner un valor que exista.
    // Si el usuario ingresa un valor que no existe se le solicitará de nuevo.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean esDiaInvalido = true;
        
        int dia = 0;
        
        while (esDiaInvalido) {
            System.out.println("Ingrese día de la semana (1-7): ");
            dia = teclado.nextInt();
            teclado.nextLine();
            esDiaInvalido = (dia < 1 || dia > 7);
        }
        System.out.println("Día ingresado: " + dia);
    }
}
