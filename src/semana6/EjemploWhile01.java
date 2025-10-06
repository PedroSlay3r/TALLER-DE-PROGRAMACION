package semana6;

import javax.lang.model.type.UnionType;


public class EjemploWhile01 {
    /* Estructura repetitiva
    Es una parte de un código que se ejecuta de manera indefinible, dependiendo de la condición o de su valor que se va a repetir.
    Contador: 
    Acumulador: Acumula las veces que se ha 
    
    // Mine
    public static void main(String[] args) {
          
    String palabra = UTP;
    
    while (palabra == UTP) {
            System.out.println(UTP);
    };
      
    }
    
    */
    
    public static void main(String[] args) {
        
        // Ejercicio súper básico para ver el funcionamiento de While.
        int contador = 0;
        
        // Mientras que la variable sea menor que 5, se estará ejecutando el código.
        while (contador < 5) {
            System.out.println("UTP");
            contador = contador + 1;
        }
    }

}
