public class NuevoEncargado  {
    public void NuevoEncargado(String miembroAsign, String tareaAsign) {
        Tareas nuevaListaTareas = new Tareas();
        nuevaListaTareas.agregarTarea(tareaAsign);
        System.out.println("La tarea se agrego con exito");
    }
}
