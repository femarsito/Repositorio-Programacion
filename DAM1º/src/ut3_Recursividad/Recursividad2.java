package ut3_Recursividad;

import java.util.Scanner;

public class Recursividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int numero;
System.out.println("Dame un numero positivos para invertirlo");
numero = leer.nextInt();
String resultado = Invertido(numero);
System.out.println("El numero inverso es: " + resultado);

//int numero;
//System.out.println("Dame un numero para invertirlo");
//numero = leer.nextInt();
//String resultado = invertido(numero);
//
//System.out.println("El numero invertido es " + resultado);
//	leer.close();
	}
public static String Invertido(int num) {
	if (num==0) {
		return "";
	}
	return (num%10) + Invertido(num/10);
}
	
	
	
	//public static String invertido (int num) {
//	if (num == 0) {
//		return "";
//	}
//	return (num%10) + invertido(num/10);
//}
}
