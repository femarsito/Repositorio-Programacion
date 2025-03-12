package ut3_Recursividad;

import java.util.Scanner;

public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
Double gFahrenheit;
Double formulaCelsius;
System.out.println("Dime cuantos grados Fahrenheit quieres que te pase a Celsius");
gFahrenheit = leer.nextDouble();
formulaCelsius = convertirACelsius(gFahrenheit);
System.out.println(gFahrenheit + " grados Fahrenheit pasados a Celsius son: " + formulaCelsius);

leer.close();
	}
static Double convertirACelsius (Double Fahrenheit){
	return ((Fahrenheit -32)/1.8);
	
}
}
