package semana3;
import java.util.Scanner;
public class EstructuraCondicionalSimple {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println(" JOYERIA EL BRILLITO ");
        System.out.println("=====================");
        Scanner teclado = new Scanner(System.in);
        double montoCompra;
        System.out.println("Ingrese el moto de la compra: ");
        montoCompra = teclado.nextDouble();
        
        if(montoCompra >= 2500) {
            System.out.println("=======================");
            System.out.println("Se aplica el descuento");
        }
        System.out.println("=======================");
        teclado.close();
    }
}
