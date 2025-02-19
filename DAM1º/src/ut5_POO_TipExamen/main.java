package ut5_POO_TipExamen;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		//Coche
		System.out.println("Introduce la marca del coche:");
		String marca = leer.next();
		System.out.println("Introduce el numero de matricula:");
		int numero = leer.nextInt();
		System.out.println("Introduce el precio de coste:");
		int precioCoste = leer.nextInt();
		System.out.println("Introduce el precio de venta:");
		int precioVenta = leer.nextInt();
		
		Coche coche1 = new Coche(marca, numero, precioCoste, precioVenta);
		
		//Carroceria
		System.out.println("Introduce el color de la carroceria:");
		String color = leer.next();
		System.out.println("Introduce la condicion de la carroceria:");
		String condicion = leer.next();
		
		Carroceria carroceria = new Carroceria (color, condicion);
		
		//Motor
		System.out.println("Introduce el numero de bastidor:");
		int numBastidor = leer.nextInt();
		
		Motor motor = new Motor(numBastidor);
		
		//Ruedas
		ArrayList<Ruedas> ruedass = new ArrayList<>(); //Crear array auxliar
		System.out.println("Cuantas ruedas lleva el coche?");
		int numRuedas = leer.nextInt();
		for (int i = 0; i<numRuedas; i++) {
			System.out.println("Introduce el tamaño de la rueda");
			float tamaño = leer.nextInt();
			System.out.println("Introduce el estado de la rueda:");
			String condicionR = leer.next();
			Ruedas ruedas = new Ruedas (tamaño, condicionR); //Llamar a la clase
			ruedass.add(ruedas); //Pasar array auxiliar al principal
		}
		
		
		//Estandar, Deportivo, Monovolumen
		System.out.println("Introduce el tipo de coche Estandar, Deportivo, Monovolumen:");
		String resultado = leer.next();
		if (resultado.equals("Estandar")) { //	.equals()
			System.out.println("Introduce el numero de puertas:");
			int puertas = leer.nextInt();
			Coche estandar = new Estandar(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedass, reparacion, puertas);
			} else if (resultado.equals("Deportivo")) {
				Coche deportivo = new Deportivo(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedass, reparacion);
			} else if (resultado.equals("Monovolumen")) {
				System.out.println("Introduce el numero de plazas:");
				int plazas = leer.nextInt();
				Coche monovolumen = new Monovolumen(marca, numero, precioCoste, precioVenta, carroceria, motor,
													ruedass, reparacion, plazas);
			}
		
		coche1.toString();
	}

}
