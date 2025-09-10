package semana4;

public class EstructuraSwitchSimpleAgrupado {

    public static void main(String[] args) {
        int scoreNPS = 9;
        String descripcion = "";

        // Código switch no factorizado/simplificado
        /*switch (scoreNPS) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Detractor");
                break;
            case 7:
            case 8:
                System.out.println("Pasivo");
                break;
            case 9:
            case 10:
                System.out.println("Promotor");
                break;
        }*/
        
        // Código switch factorizado/simplificado
        switch (scoreNPS) {
            case 0, 1, 2, 3, 4, 5, 6:
                System.out.println("Detractor");
                break;
            case 7, 8:
                System.out.println("Pasivo");
                break;
            case 9, 10:
                System.out.println("Promotor");
                break;
        }
    }
}
