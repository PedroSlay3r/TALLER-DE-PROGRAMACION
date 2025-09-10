package semana4;

public class EstructuraSwitchIncognita {

    public static void main(String[] args) {
        /* int i = 0;
        switch (i) {
            default:
                System.out.println("Default");
            case 1:
                System.out.println("1");
                break;
            case 0:
                System.out.println("0");
            case 2:
                System.out.println("2");
                break;
        // Imprime 0 y 2
        } */
        
        int i = 65;
        switch (i) {
            case 95: System.out.println("95");
            case 96: System.out.println("96");
            case 'a': System.out.println("a");
            case 'b': System.out.println("b");
            case 'c': System.out.println("c");
            case 'A': System.out.println("65");
            case 100: System.out.println("Imprime 65 y el de abajo porque no hay break");
            case 92: System.out.println("Ya sabemos que las letras son números en ASCII");
        }
    }
}
