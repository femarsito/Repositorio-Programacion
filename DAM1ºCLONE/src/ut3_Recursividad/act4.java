package ut3_Recursividad;

import java.util.Scanner;

public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
int numEstrellas;
System.out.println("Cuantas estrilltas quieres ver");
numEstrellas = leer.nextInt();
String resultado = generarEstrellas (numEstrellas);
System.out.println(" Aqui esta las estrellitas " + resultado);
leer.close();
	}
public static String generarEstrellas (int contEstrellas) {
	String estrellas = "";
	for (int i=0; i<contEstrellas; i++) {
		estrellas += "*";
	}
	return estrellas;
}
}
