package semana6;

// Ejercicio: Ingresar por teclado las 05 notas de un estudiante
// Al finalizar mostrar su promedio
// Mostrar las notas aprobadas y desaprobadas

import java.util.Scanner;

public class EjemploWhile03 {
    
    public static void main(String[] args) {
    
        /* 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=======================");
        System.out.println(" INGRESE LAS 05 NOTAS  ");
        System.out.println("=======================");
        
        double promedio, nota1, nota2, nota3, nota4, nota5 = 0;
        System.out.print("Ingrese la primera nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = teclado.nextDouble();
        System.out.print("Ingrese la cuarta nota: ");
        nota4 = teclado.nextDouble();
        System.out.print("Ingrese la quinta nota: ");
        nota5 = teclado.nextDouble();
        
        promedio = nota1 + nota2 + nota3 + nota4 + nota5 / 5;
        
        System.out.println(promedio); */
        
        /* 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=======================");
        System.out.println(" INGRESE LAS 05 NOTAS  ");
        System.out.println("=======================");
        
        double contador = 0, acumulador = 0;
        double notas = 0;
        
        while (contador < 2) {
            notas = teclado.nextInt();
            acumulador = acumulador + contador;
            contador++;
            System.out.println(notas + acumulador + contador);
        }
        
        System.out.println("Número de notas: " + acumulador);
        System.out.println("El promedio es: " + notas / contador);
        */
        
        Scanner teclado = new Scanner(System.in);
        int contador = 0, suma = 0, promedio, nota, nAprobadas = 0, nDesaprobadas = 0;
        
        while (contador < 5) {
            System.out.print("Nota " + (contador + 1) + ": ");
            nota = teclado.nextInt();
            if(nota >= 12)
                nAprobadas++;
            else 
                nDesaprobadas++;
            
            suma = suma + nota;
            contador++;
        }
        
        // Total de números de notas: 11 + 11 + 12 + 12 + 12 = 58 / 11
        System.out.println("La suma total es: " + suma);
        System.out.println("Promedio: " + suma / contador);
        System.out.println("Número de notas aprobadas: " + nAprobadas);
        System.out.println("Número de notas desprobadas: " + nDesaprobadas);
    }
}
