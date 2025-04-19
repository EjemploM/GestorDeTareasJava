import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingresa un número.");
                sc.nextLine(); // limpiar la entrada.
                opcion = 0; // volver al menú.
            }
            
            sc.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la tarea: ");
                    String tarea = sc.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    System.out.println("Tareas:");
                    for (String t : tareas) {
                        System.out.println("- " + t);
                    }
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
