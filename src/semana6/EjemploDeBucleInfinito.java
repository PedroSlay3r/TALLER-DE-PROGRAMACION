/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author Pedro
 */
public class EjemploDeBucleInfinito {
    public static void main(String[] args) {
        
        /*
        // NO ES UN BUCLE INFINITO
        // Resta desde el 98 -3 hasta llegar a -1
        int x = 100;
        while (x > 0) {
            x -=2;
            System.out.println(x--);
        } */
        
        /*
        // NO ES UN BUCLE INFINITO
        // Resta 100 de 1 en 1 hasta llegar a 1
        int x = 100;
        while (x > 0) {
            System.out.println(x--);
        } */
        
        /*
        // NO ES UN BUCLE INFINITO
        // Resta de 98 de 2 en 2 hasta llegar a 0
        int x = 100;
        while (x > 0) {
            x--;
            if (x % 2 == 0) {
                x++;
            } else {
                x--;
            }
            System.out.println(x);
        } */
        
        // ES UN BUCLE INFINITO
        // El cual imprimir 1 infinitas veces
        int x = 13;
        while (x > 0) {
            x /= 2;
            if (x % 2 == 0) {
                x++;
            }
            System.out.println(x);
    }
}
