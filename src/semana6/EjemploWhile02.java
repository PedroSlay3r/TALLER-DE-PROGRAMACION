package semana6;


public class EjemploWhile02 {
    
    // Ejercicio: Imprimir los 5 primeros n�meros, adem�s las suma de ellos
    public static void main(String[] args) {
        int contador = 1, suma = 0;
        // M�s r�pido es la forma de arriba
        // int suma = 0;
        
        while (contador < 6) {
            System.out.print( contador + ", ");
            // La importancia de poner primero la suma puesto que sino este sumar� en total 20
            // B�sicamente debemos de tener orden en nuestro c�digo
            suma = suma + contador;
            contador++;
        }
        
        System.out.println("");
        System.out.println("La suma total es: " + suma);
        
    }
}
