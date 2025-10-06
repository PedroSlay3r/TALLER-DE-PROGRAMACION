/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

/**
 *
 * @author Pedro
 */
public class EjemploPruebaCondicional {
    public static void main(String[] args) {
        boolean seEncontroMultiploDeCinco = false;
        int i;
        for (i = 1; !seEncontroMultiploDeCinco; i++) {
            if (i % 5 == 0) {
                seEncontroMultiploDeCinco = true;
                System.out.println("El primer múltiplo de 5 es: " + i);
            }
        }
    }
}