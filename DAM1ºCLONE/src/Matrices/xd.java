package Matrices;
import java.util.*;

public class xd {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar el número de días de compras
System.out.println("Indique el numero de dias de compras:");
int dias = leer.nextInt();
leer.nextLine(); // Limpiar el buffer

// Crear una matriz irregular para almacenar los artículos
String[][] listaCompras = new String[dias][];

// Llenar la matriz con los artículos de cada día
for (int i = 0; i < dias; i++) {
	System.out.println("Dia " + (i + 1) + ":");
	listaCompras[i] = compra(leer); // Almacenar los artículos del día
}

// Mostrar la lista completa de compras
System.out.println("Lista completa de compras:");
mostrarListaCompras(listaCompras);
}

// Método para registrar los artículos de un día
public static String[] compra(Scanner leer) {
	System.out.println("Cuantos productos va a comprar?");
	int numProd = leer.nextInt();
	leer.nextLine(); // Limpiar el buffer
	
	String[] productos = new String[numProd]; // Array para los productos del día
	
	// Solicitar los nombres de los productos
	for (int i = 0; i < numProd; i++) {
		System.out.println("Nombre del producto " + (i + 1) + ":");
		productos[i] = leer.nextLine();
	}
	
	return productos; // Devolver el array de productos
}

// Método para mostrar la lista completa de compras
public static void mostrarListaCompras(String[][] listaCompras) {
	for (int i = 0; i < listaCompras.length; i++) {
		System.out.println("Día " + (i + 1) + ":");
		for (int j = 0; j < listaCompras[i].length; j++) {
			System.out.println("- " + listaCompras[i][j]);
		}
	}
}
}
