package ut3_Recursividad;

import java.util.Scanner;

public class act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int num;
System.out.println("Dame un año y te dire si es bisiesto o no ");
num = leer.nextInt();
boolean resultado = esBisiesto (num);
if (resultado) {
	System.out.println("Es bisiesto");
}else System.out.println("No es bisiesto");
	
	leer.close();
	}
public static boolean esBisiesto (int anno) {
	if (anno%4==0) {
		if (anno%100==0) {
			return anno%400==0;
		}
		return true;
	}return false;
}
}
