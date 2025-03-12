package retojueves;

import java.util.Scanner;

/**
 * @author Arturo, Fernando, Ivan
 * @version 1.0
 * 
 * Clase main donde se implementa el menú
 */

public class App {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú del Museo:");
            System.out.println("1. Añadir obra");
            System.out.println("2. Eliminar obra");
            System.out.println("3. Buscar obra");
            System.out.println("4. Calcular superficie total de pinturas");
            System.out.println("5. Encontrar escultura más alta");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Número de inventario: ");
                    int numInv = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nombre del autor: ");
                    String nombreAutor = scanner.nextLine();
                    System.out.print("Lugar de nacimiento del autor: ");
                    String lugarAutor = scanner.nextLine();
                    System.out.print("Año de nacimiento del autor: ");
                    int anoNac = scanner.nextInt();
                    System.out.print("Año de fallecimiento del autor (o -1 si aún vive): ");
                    int anoFalle = scanner.nextInt();
                    Integer fallecimiento = (anoFalle == -1) ? null : anoFalle;
                    Artista autor = new Artista(nombreAutor, lugarAutor, anoNac, fallecimiento);
                    
                    System.out.print("Tipo de obra (1. Pintura, 2. Escultura): ");
                    int tipo = scanner.nextInt();
                    
                    if (tipo == 1) {
                        System.out.print("Ancho: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Alto: ");
                        double alto = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Soporte: ");
                        String soporte = scanner.nextLine();

                    } else {
                        System.out.print("Material: ");
                        scanner.nextLine();
                        String material = scanner.nextLine();
                        System.out.print("Altura: ");
                        double altura = scanner.nextDouble();
                        catalogo.anadeObra(new Escultura(titulo, numInv, autor, anoNac, material, altura));
                    }
                    System.out.println("Obra añadida con éxito.");
                    break;
                
                case 2:
                    System.out.print("Ingrese número de inventario: ");
                    int num = scanner.nextInt();
                    System.out.println(catalogo.eliminaObra(num) ? "Obra eliminada." : "Obra no encontrada.");
                    break;
                
                case 3:
                    System.out.print("Ingrese número de inventario: ");
                    num = scanner.nextInt();
                    Obra obra = catalogo.buscaObra(num);
                    if (obra != null) {
                        obra.muestra();
                    } else {
                        System.out.println("Obra no encontrada.");
                    }
                    break;
                
                case 4:
                    System.out.println("Superficie total de pinturas: " + catalogo.superficie() + " metros cuadrados.");
                    break;
                
                case 5:
                    int esculturaMasAlta = catalogo.masAlta();
                    if (esculturaMasAlta != -1) {
                        System.out.println("La escultura más alta tiene número de inventario: " + esculturaMasAlta);
                    } else {
                        System.out.println("No hay esculturas en el catálogo.");
                    }
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
}
