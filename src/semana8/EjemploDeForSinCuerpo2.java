/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

/**
 *
 * @author Pedro
 */
public class EjemploDeForSinCuerpo2 {

    public static void main(String[] args) {

        String menu = """
                      |================================= |
                      | CONJUNTO DE NÚMERO PARA SUMAR   |
                      |================================= |
                      """;
        System.out.print(menu);

        int suma = 0;

        for (int i = 0; i < 10; suma += i++);
        System.out.println("La suma total es: " + suma);
    }
}
