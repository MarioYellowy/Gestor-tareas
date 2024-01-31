import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface GestionTareas {
    public static void GestionTarea() {

    }
    //Asignar nivel de prioridad
    List<String> altaPrioridad = new ArrayList<>();
    List<String> mediaPrioridad = new ArrayList<>();
    List<String> bajaPrioridad = new ArrayList<>();
    //Archivos adjuntos
    List<String> archivosAdjuntos = new ArrayList<>();
    //Mostrar comentarios de una tarea en especifico
    public String mostrarComentario();
    //Mostrar dependencias por tarea
    List<String> dependencias = new ArrayList<>();
}
