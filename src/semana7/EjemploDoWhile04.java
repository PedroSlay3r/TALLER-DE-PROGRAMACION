package semana7;

import java.util.Scanner;

/* 
Elaborar un programa que permita mostrar un menú
con tres opciones:
1. Agregar notas.
2. Ver promedio.
3. Salir.

? Al ingresar la opción 3, el programa debe terminar.
 */
public class EjemploDoWhile04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        String menu = """
                      |====================================|
                      | Acciones disponibles:              |
                      | [1] Agregar notas                  |
                      | [2] Ver promedio                   |
                      | [3] Salir                          |
                      |====================================|
                      """;
        System.out.println(menu);
        do {
            System.out.print("Ingresa una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Se agregaron las notas");
                    break;
                case 2:
                    System.out.println("Se visualizó el promedio");
                    break;
                case 3:
                    System.out.println("El programa se está cerrando");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
            teclado.nextLine();
        } while (opcion != 3);

        System.out.println("====================");
        System.out.println("El programa finalizó");
        System.out.println("====================");
    }
}
