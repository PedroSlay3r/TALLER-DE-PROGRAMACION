/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author Pedro
 */
public class EjemploDeUsoDeContadoresYAcumuladores {
    public static void main(String[] args) {
        int i = 0;
        int conteo = 0;
        int suma = 0;
        
        System.out.println("Números pares menos a 20");
        
        while (i < 20) {
            if (i % 2 == 0) { // Recuerda que es doble = para la comparación
                conteo = conteo +1;
                suma = suma + i;
                System.out.print(i + ", ");
            }
            i = i +1;
        }
        
        System.out.println("\nConteo: " + conteo);
        System.out.println("Suma: " + suma);
    }
}
