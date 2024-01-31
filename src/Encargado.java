import java.util.Scanner;

public abstract class Encargado implements GestionTareas {
    String nombre, miembroAsign, tareaAsign;
    int edad;
    String bienvenida = "Que quiere hacer ahora?:\n" +
            "1: Crear una tarea.\n" +
            "2: Asignar una tarea.\n" +
            "3: Asignarle una fecha de vencimiento a una tarea\n" +
            "4: Asignar un grado de prioridad\n" +
            "5: Checar el seguimiento de una tarea\n" +
            "6: Seguimiento de una tarea\n";
    public Encargado(String nombre, int edad) {
        this.miembroAsign = miembroAsign;
        this.tareaAsign = tareaAsign;
        String primerPaso = "Comencemos creando una tarea nueva.\n" +
                "Por favor indica a quien le asignaras la tarea:";
        System.out.println(primerPaso);
        Scanner inputMiembro = new Scanner(System.in);
        miembroAsign = inputMiembro.nextLine();
        System.out.println("Bien, ahora indica que tarea sera por favor:");
        Scanner inputTarea = new Scanner(System.in);
        tareaAsign = inputTarea.nextLine();
        crearTarea(miembroAsign, tareaAsign);
    }
    public abstract String crearTarea(String miembroAsign, String tareaAsign);
    public abstract String crearTarea(String tareaAsign);
    public abstract String asignarTarea();
    public abstract String asignarFechaVencimiento();
    public abstract String asignarNivelPrioridad();
    public abstract String seguimientoTarea();
    public abstract String notificacionTarea ();

}
