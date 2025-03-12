package ut3_Recursividad;

import java.util.Scanner;

public class Recursividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int numero;
System.out.println("Dame un numero decimal");
numero = leer.nextInt();
System.out.println("El numero binario de " + numero + " es: " + convBinario(numero));
leer.close();
	}
static String convBinario(int num) {
	if (num==0) {
		return "";
	}
	//Llamada recursiva
	String binario = convBinario(num/2);
	return binario+(num%2);
}
}
