package ut4_Arrays;
import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		
		 // Solicitar al usuario que ingrese 5 nombres
String[] nombres = new String[5];
System.out.println("Ingrese 5 nombres:");

for (int i = 0; i < 5; i++) {
	System.out.print("Nombre " + (i + 1) + ": ");
	nombres[i] = leer.nextLine();
}

// Ordenar los nombres alfabéticamente (burbuja)
for (int i = 0; i < nombres.length - 1; i++) {
	for (int j = i + 1; j < nombres.length; j++) {
		if (nombres[i].compareToIgnoreCase(nombres[j]) > 0) {
			// Intercambiar nombres
			String temp = nombres[i];
			nombres[i] = nombres[j];
			nombres[j] = temp;
		}
	}
}

// Mostrar la lista completa de nombres ordenada
System.out.println("Lista completa de nombres ordenada:");
for (String nombre : nombres) {
	System.out.println(nombre);
}

// Filtrar y mostrar nombres que comienzan con una vocal
System.out.println("Nombres que comienzan con una vocal:");
for (String nombre : nombres) {
	if (comienzaConVocal(nombre)) {
		System.out.println(nombre);
	}
}
}

// Método para verificar si un nombre comienza con una vocal
public static boolean comienzaConVocal(String nombre) {
	if (nombre.isEmpty()) {
		return false;
	}
	char primeraLetra = Character.toUpperCase(nombre.charAt(0));
	return primeraLetra == 'A' || primeraLetra == 'E' || primeraLetra == 'I' || primeraLetra == 'O' || primeraLetra == 'U';
}
}