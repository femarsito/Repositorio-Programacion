package ut2_practica1;

import java.util.Scanner;

public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in); 
		double area;
		double radio;
		
		System.out.println ("Ingresa el radio para calcular el area de un circulo");
		radio = leer.nextDouble();
		
		area = Math.PI * Math.pow(radio, 2);
		System.out.println ("El area del circulo es: " + area);
	}

}
