package ut2_SwitchOperadorTernario;

import java.util.Scanner;

public class act6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		double valor;
		String unidadOrigen, unidadDestino, resultado;

		// Pedir la unidad de origen, valor y la unidad de destino
		System.out.println("Introduce la unidad de origen (cm, m, km): ");
		unidadOrigen = leer.nextLine().trim().toLowerCase();

		System.out.println("Introduce la cantidad a convertir: ");
		valor = leer.nextDouble();
		leer.nextLine(); // Limpiar buffer

		System.out.println("Introduce la unidad de destino (cm, m, km): ");
		unidadDestino = leer.nextLine().trim().toLowerCase();

		// Validar si las unidades son válidas con el operador ternario
		boolean esValido = (unidadOrigen.equals("cm") || unidadOrigen.equals("m") || unidadOrigen.equals("km"))
				&& (unidadDestino.equals("cm") || unidadDestino.equals("m") || unidadDestino.equals("km"));

		// Si es válido, hacemos la conversión, si no, mostramos un mensaje de error
		resultado = esValido ? convertir(unidadOrigen, unidadDestino, valor)
				: "Error: Conversión no válida. Unidades deben ser 'cm', 'm', o 'km'.";

		// Imprimir el resultado
		System.out.println(resultado);
		leer.close();
	}

	// Función para realizar la conversión
	public static String convertir(String origen, String destino, double valor) {
		double resultado = 0;

		// Switch para hacer la conversión dependiendo de las unidades
		switch (origen) {
		case "cm":
			resultado = destino.equals("m") ? valor / 100 : destino.equals("km") ? valor / 100000 : valor;
			break;
		case "m":
			resultado = destino.equals("cm") ? valor * 100 : destino.equals("km") ? valor / 1000 : valor;
			break;
		case "km":
			resultado = destino.equals("cm") ? valor * 100000 : destino.equals("m") ? valor * 1000 : valor;
			break;
		default:
			return "Unidad de origen no válida";
		}

		return valor + " " + origen + " son " + resultado + " " + destino;
	
		
	}

}
