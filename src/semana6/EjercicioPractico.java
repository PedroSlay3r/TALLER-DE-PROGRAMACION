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
public class EjercicioPractico {
    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("INICIO DE SESIÓN");
        System.out.println("=================");
        
        System.out.println("Por favor, ingrese su código de alumno (ejem. U24321298)");
        Scanner teclado = new Scanner(System.in);
        
        String codigo = "vacio";
       codigo = teclado.nextLine();

        System.out.println(codigo);
    }
}
