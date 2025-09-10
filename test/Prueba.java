
public class Prueba {

    public static void main(String[] args) {

        /* 
        // Todas las variables númericas tienen su equivalente en Mayúscula y completo
        // Solo se utilizan para las intefacez gráficas
        int x;
        Integer y;

        x = 10; 
        y = 20;
        
        // Con Int se puede hacer operaciones SWAP
        // 
        y.
         */
        // Variables
        int edad = 20;
        String mensaje;

        // Otra forma de hacerlo
        //String mensaje = edad >= 18 ? mensaje = "Eres mayor de edad" : "Eres menor de edad";
        if (edad >= 18) {
            mensaje = "Mayor de edad";
        } else {
            mensaje = "Menor de edad";
            System.out.println(mensaje);
        }       
    }
}