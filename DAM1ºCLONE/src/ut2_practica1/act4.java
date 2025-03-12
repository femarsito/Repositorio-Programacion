package ut2_practica1;
import java.util.Scanner;
public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		int n1, n2;
		int suma, resta, multiplicacion;
		double division;
		
		System.out.println ("Dame dos numeros: ");
		n1 = leer.nextInt();
		n2 = leer.nextInt();
		
		suma = n1 + n2;
		resta = n1 - n2;
		multiplicacion = n1 * n2;
		division = n1 / n2;
		
		System.out.println ("La suma da: " + suma);
		System.out.println ("La resta da: " + resta);
		System.out.println ("La multiplicacion da: " + multiplicacion);
		System.out.println ("La division da: " + division);
		
		
	}

}
