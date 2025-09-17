/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6;

/**
 *
 * @author Pedro
 */
public class EjemploDeWhileInfinito {
    public static void main(String[] args) {
        
        // Consume mucha memoria del CPU y del GPU
        int numero = 1;
      
        while (numero > 0) {
            System.out.println(numero);
            numero++;
        }
    }
}
