package semana6;

import javax.lang.model.type.UnionType;


public class EjemploWhile01 {
    /* Estructura repetitiva
    Es una parte de un c�digo que se ejecuta de manera indefinible, dependiendo de la condici�n o de su valor que se va a repetir.
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
        
        // Ejercicio s�per b�sico para ver el funcionamiento de While.
        int contador = 0;
        
        // Mientras que la variable sea menor que 5, se estar� ejecutando el c�digo.
        while (contador < 5) {
            System.out.println("UTP");
            contador = contador + 1;
        }
    }

}
