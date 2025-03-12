package ut5_POO_Practicar2;
import java.util.*;
public class main {

	public static void main(String[] args){
	
		Scanner leer = new Scanner(System.in);
		
		//Coche
		System.out.println("Introduce la marca del coche:");
		String marca = leer.next();		
		System.out.println("Introduce numero de matricula:");
		int numero = leer.nextInt();
		System.out.println("Introduce el precio de coste:");
		Float precioCoste = leer.nextFloat();
		System.out.println("Introduce el precio de venta:");
		Float precioVenta = leer.nextFloat();
		
		//Carroceria
		System.out.println("Introduce el color de la carroceria:");
		String color = leer.next();
		System.out.println("Introduce el estado de la carroceria");
		String condicion = leer.next();
		Carroceria carroceria = new Carroceria(color, condicion);
		
		//Motor
		System.out.println("Introduce el numero de bastidor");
		String numBastidor = leer.next();
		Motor motor = new Motor(numBastidor);
		
		//Ruedas
		ArrayList<Ruedas> ruedass = new ArrayList<>();
		System.out.println("Cuantas ruedas quieres?");
		int numRuedas = leer.nextInt();
		for (int i = 0; i<numRuedas; i++) {
			System.out.println("Tamaño de rueda:");
			float tamaño = leer.nextInt();
			System.out.println("Condicion:");
			String condicionR = leer.next();
			Ruedas ruedas = new Ruedas(tamaño, condicionR);
			ruedass.add(ruedas);								//me raya
			}
		
		//Estandar, Monovolumen, Deportivo
		System.out.println("Que tipo de coche quieres: Estandar, Monovolumen, Deportivo");
		String resultado = leer.next();
		
		if (resultado.equals("Estandar")) {
			System.out.println("Cuantas puertas tiene?");
			int puertas = leer.nextInt();
			Coche estandar = new Estandar(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedass, puertas);
			System.out.println(estandar.toString());
		} else if (resultado.equals("Monovolumen")) {
			System.out.println("Cuantas plazas tiene?");
			int plazas = leer.nextInt();
			Coche estandar = new Monovolumen (marca, numero, precioCoste, precioVenta, carroceria, motor, ruedass, plazas);
			System.out.println(estandar.toString());
		} else if (resultado.equals("Deportivo")) {
			Coche estandar = new Deportivo(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedass);
			System.out.println(estandar.toString());
		}
	}


