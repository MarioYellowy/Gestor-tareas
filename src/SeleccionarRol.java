import java.util.Scanner;

public interface SeleccionarRol {
    Scanner input = new Scanner(System.in);

    public default void seleccionarRol() {
        System.out.println("Encargado selecciona: 1\nMiembro selecciona: 2");
        int rol = input.nextInt();
        if (rol == 1) {
            Scanner inputEncargado = new Scanner(System.in);
            System.out.println("Bienvenido encargado, por favor ingrese su nombre:");
            String nombreEncargado = inputEncargado.nextLine();
            Scanner inputEdad = new Scanner(System.in);
            System.out.println("Ahora ingrese su edad por favor:");
            int edadEncargado = inputEdad.nextInt();
            System.out.println("Muchas gracias :D");
            Encargado newEncargado = new Encargado(nombreEncargado, edadEncargado) {
                @Override
                public String crearTarea(String miembroAsign, String tareaAsign) {
                    Tareas nuevaListaTareas = new Tareas();
                    return null;
                }

                @Override
                public String crearTarea(String tareaAsign) {
                    return null;
                }

                @Override
                public String mostrarComentario() {
                    return null;
                }
                @Override
                public String asignarTarea() {
                    return null;
                }
                @Override
                public String asignarFechaVencimiento() {
                    return null;
                }
                @Override
                public String asignarNivelPrioridad() {
                    return null;
                }
                @Override
                public String seguimientoTarea() {
                    return null;
                }
                @Override
                public String notificacionTarea() {
                    return null;
                }
            };
        } else if (rol == 2){

        }
    }
}

