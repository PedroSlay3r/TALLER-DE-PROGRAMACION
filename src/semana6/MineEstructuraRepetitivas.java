/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author Pedro
 */
public class MineEstructuraRepetitivas {

    public static void main(String[] args) {

        // Para imprimir 10 veces i
        // Este primero evalua la condición y luego ejecuta el código si es verdadero o falso
        int i = 0;
        while (i < 4) {
            System.out.println("i");
            i++; // No es necesario indicar un incremo i = i + 1, puesto que i++ es lo mismo
        }

        // Para imprimir 10 veces j
        // Este primero ejecuta el código y luego evalua, solo lo muestra si es verdadero o falso
        int j = 0;
        do {
            System.out.println("j");
            j++;
        } while (j < 4);
        
        // Es como  los 2 pero esta es una inicialización
        for (int k = 0; k < 4; k++) {
            System.out.println("k");
        }
    }
}
