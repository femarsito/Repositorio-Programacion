package ut3_Recursividad;

import java.util.Scanner;

public class Recursividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int base, exponente;
Scanner leer = new Scanner(System.in);
System.out.println("Dame una Base y luego un exponente para ir calculado los resultados ");
base = leer.nextInt();
exponente = leer.nextInt();
//
	int resultado = potencia(base, exponente);
	System.out.println(base + " ^ " + exponente + " = " + resultado);
leer.close();


	}
	
	
	
	
	
	
	
public static int potencia (int base, int exponente) {
	if (exponente==0) {
		return 1;
	}
	//Llamada recursiva
	return base * potencia(base, exponente - 1);
}
}
