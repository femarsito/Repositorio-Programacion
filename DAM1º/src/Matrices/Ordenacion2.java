package Matrices;

import java.util.Arrays;
import java.util.Scanner;
public class Ordenacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);

System.out.println("Cuantos nombres quieres ingresar");
int n = leer.nextInt();
leer.nextLine();
String [] nombres = new String[n];
System.out.println("Introduce los nombres:");
for (int i=0; i<n; i++) {
	nombres[i]=leer.nextLine();
}
Arrays.sort(nombres); //Ordena alfabeticamente 

System.out.println("La lista de nombres ordenada alfabeticamente es:");
for (String nombre : nombres) {
	System.out.print(nombre + " ");
}
	}
}

