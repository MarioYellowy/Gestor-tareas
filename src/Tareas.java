import java.util.ArrayList;
import java.util.List;

public class Tareas {
    private List<String> Tareas;
    public Tareas() {
        this.Tareas = new ArrayList<>();
    }
    public void agregarTarea(String tarea) {
        Tareas.add(tarea);
    }
}
