package semana4;

public class EstructuraSwitchSimpleBreakError {

    public static void main(String[] args) {
        int estadoProyecto = 5;
        String descripcion = "";
        switch (estadoProyecto) {
            case 0:
                descripcion = "CREADO";
                break;
            case 1:
                descripcion = "ASIGNADO";
                break;
            case 2:
                descripcion = "EN PROGRESO";
            case 3:
                descripcion = "FINALIZADO";
            case 4:
                descripcion = "CANCELADO";
                break;
            case 5:
                descripcion = "SUSPENDIDO";
            default:
                descripcion = "DESCONOCIDO";
                break;
        }
        System.out.println("El estado es: " + descripcion.toLowerCase());
    }
}
