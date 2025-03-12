package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int numSecreto = (int)(Math.random() * 100) + 1;
int n, numIntentos=0; 
System.out.println("Adivina el numero entre el 1 y el 100 ");

n = leer.nextInt();
while (n != numSecreto) {
	;
	numIntentos++;
	if (n> numSecreto) {
		System.out.println("El numero secreto es menor, vuelve a introducir otro numero ");
		
	}else if (n< numSecreto) {
		System.out.println("El numero secreto es mayor, vuelve a introducir otro numero");
		
	}
	n = leer.nextInt();
	
}
System.out.println("Lo acertaste!");
System.out.println("Y lo intentaste un total de " + numIntentos + " veces");

leer.close();
	}

}
