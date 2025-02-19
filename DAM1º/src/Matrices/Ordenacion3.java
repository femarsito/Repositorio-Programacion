package Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
//Reino de España
System.out.println("Introduzca cuantos caballeros quiere registrar en España");
int numCabE = leer.nextInt();
int [] habilidadEspaña =  new int [numCabE];

for (int i = 0; i<numCabE; i++) {
	System.out.println("Ingresa el nivel del caballero " + (i+1) + ":");
	habilidadEspaña[i] = leer.nextInt();
}

//Reino de Francia
System.out.println("Introduzca cuantos caballeros quiere registrar en Francia");
int numCabF = leer.nextInt();
int [] habilidadFrancia = new int [numCabF];

for (int i = 0; i<numCabF; i++) {
	System.out.println("Ingresa el nivel del caballero " + (i+1) + ":");
	habilidadFrancia[i] = leer.nextInt();
}
//Mostrar lista desordenda de España
System.out.println("Listado del Reino de España: ");

for (int fila : habilidadEspaña) {
	System.out.print(fila + " ");
}
System.out.println();

//Mostrar lista desordenda de Francia
System.out.println("Listado del Reino de Francia: ");

for (int fila : habilidadFrancia) {
	System.out.print(fila + " ");
}
System.out.println();

int [] combinarListas = new int [numCabE + numCabF];
for (int i = 0; i<numCabE; i++) {
	combinarListas[i]=habilidadEspaña[i];
}
for (int i = 0; i<numCabF; i++) {
	combinarListas[numCabE+i]=habilidadFrancia[i];
}

 Arrays.sort(combinarListas); //Ordenamos las listas de menor a mayor.
 
 System.out.println("Las listas combinadas y ordenadas: ");
 for (int combinar : combinarListas) {
	 System.out.print(combinar + " ");
 }
	}
}