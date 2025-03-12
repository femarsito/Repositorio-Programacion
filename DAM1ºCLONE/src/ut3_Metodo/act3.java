package ut3_Metodo;
import java.util.Scanner;
public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
System.out.println("Escribe un primer numero para multiplicar ");
Double a = leer.nextDouble();
System.out.println("Escribe un segundo numero para multiplicar ");
Double b = leer.nextDouble();

Double Solucion = multiplicacion (a, b);
System.out.println("El resultado de la multiplicación es " + Solucion);
	}
	static double multiplicacion(double n1, double n2) {
		double resultado = n1*n2;
		return resultado;
		}
}
