package ut3_Recursividad;

import java.util.Scanner;

public class Recursividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int numero; 
System.out.println("Dame un numero y te dire si es binario o no ");
numero = leer.nextInt();

if (esBinario(numero)) {
	System.out.println("El numero " + numero + " es binario");
} else System.out.println("El numero " + numero + " no es binario");
	leer.close();
	}
	
public static boolean esBinario (int num) {
	if (num == 0 || num == 1) {
		return true;
	}
	int ultDigit = num%10;
	if(ultDigit !=0 && ultDigit !=1) {
		return false;
	}
	return esBinario (num/10);
}
}
