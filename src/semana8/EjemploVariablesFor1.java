/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

/**
 *
 * @author Pedro
 */
public class EjemploVariablesFor1 {
    public static void main(String[] args) {
        int z = 10;
        for (int x = 1; x <= 10; x ++) {
            System.out.printf("%d - %d = %d\n", x, z, x - z);
            z--;
        }
    }
}
