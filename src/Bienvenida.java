import java.util.Scanner;
public class Bienvenida implements SeleccionarRol{
    int opcion;
    public Bienvenida () {

    }
    public boolean mostrarBienvenida () {
            System.out.println("Bienvenido al gestor de tareas de Jala university\nPor favor selecciona que uso le daras:\n" +
                    "Selecciona 1 si el uso sera personal\n" +
                    "Selecciona 2 si el uso sera de manera colaborativa");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            if (opcion == 1) {
                System.out.println("Gracias por indicar que el uso sera de manera personal");
                return true;
            } else if (opcion == 2) {
                System.out.println("Gracias por indicar que el uso sera de manera colaborativa");
                System.out.println("Por favor indica tu rol");
                seleccionarRol();
                return true;
            } else {
                System.out.println("Valor invalido");
                return false;
            }
    }
}
