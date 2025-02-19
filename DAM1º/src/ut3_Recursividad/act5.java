package ut3_Recursividad;

import java.util.Scanner;

public class act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);  
int num1, num2;
System.out.println("Dame dos numeros para sumar y luego te dare su raiz cuadrada");
num1 = leer.nextInt();
num2 = leer.nextInt();
Double resultado= calcularRaizSuma(num1, num2);
System.out.println("La raiz de "+ num1 + " y " + num2 + " da: " + resultado);
leer.close();
	}
static Double calcularRaizSuma (int n1, int n2) {
	int n3 = n1 + n2; 
	Double raiz = Math.sqrt(n3);
	return raiz;
}
}
