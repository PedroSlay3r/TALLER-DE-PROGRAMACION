package semana4;

public class EstructuraSwitchSimple {

    public static void main(String[] args) {
        int estadoProyecto = 3;
        String descripcion = "";

        switch (estadoProyecto) {
            case 0:
                descripcion = "Creado";
                break;
            case 1:
                descripcion = "Asignado";
                break;
            case 2:
                descripcion = "En progreso";
                break;
            case 3:
                descripcion = "Finalizado";
                break;
            case 4:
                descripcion = "Cancelado";
                break;
            case 5:
                descripcion = "Suspendido";
                break;
            default :
                descripcion = "Error";
                break;
        }
        System.out.println("El estado del proyecto es: " + descripcion.toUpperCase());
    }
}
