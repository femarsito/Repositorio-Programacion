package ut3_Metodo;
import java.util.Scanner;

public class act5 {
    public static void mostrarMenu(String[] opciones) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            System.out.println((opciones.length + 1) + ". Salir");

            opcion = scanner.nextInt();

            if (opcion == opciones.length + 1) {
                System.out.println("Saliendo...");
            } else if (opcion >= 1 && opcion <= opciones.length) {
                System.out.println("Seleccionaste la opción " + opcion + ": " + opciones[opcion - 1]);
            } else {
                System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != opciones.length + 1);
    }

    public static void main(String[] args) {
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        mostrarMenu(opciones);
    }
}
