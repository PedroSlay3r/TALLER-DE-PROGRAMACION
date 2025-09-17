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
public class EjemploDeUsoWhile {
    public static void main(String[] args) {
        int edad = -1;
        Scanner lector = new Scanner(System.in);
        
        while (edad < 0) {
            System.out.println("===============");
            System.out.println("Ingrese su edad:");
            System.out.println("===============");
            edad = lector.nextInt();
            lector.nextLine();
        }
        
        System.out.println("Edad ingresada: " + edad);
    }
}
