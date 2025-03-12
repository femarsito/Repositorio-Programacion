package ut2_practica1;

//IMPORTANTE TENER ESTO:
import java.util.Scanner;

public class act2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 2: Conversión de Temperaturas
//		Crea un programa que lea una temperatura en grados Celsius (utilizando Scanner) 
//		y la convierta a Fahrenheit utilizando la fórmula:
//		F = (C * 9/5) +32
		
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese la temperatura en Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = leer.nextDouble(); // Leer el valor ingresado

        // Convertir la temperatura de Celsius a Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Imprimir el resultado de la conversión
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

       
	}

}
