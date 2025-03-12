package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
		int n, n1, n2, sumaIntervalo=0, contadorFuera=0;
		

		System.out.println("Dame dos valores para crear un intervalo");
		n1 = leer.nextInt();
		n2 = leer.nextInt();
		
		if (n1>=n2) {
			do {
				System.out.println("El primer valor no puede ser más pequeño que el segundo");
				n1 = leer.nextInt();
				n2 = leer.nextInt();
			}while (n1>n2);
		}
		
		System.out.println("Introduce los numeros que quieras (0 para terminar)");
		n= leer.nextInt();
		while (n!=0) {
			if (n>n1 && n<n2) {
				sumaIntervalo= sumaIntervalo+n;
			} else if (n<n1 || n>n2) {
				contadorFuera=contadorFuera+1;
			
			}else if (n == n1 || n == n2) {
				System.out.println("El numero introducido es igual al limite del intervalo");
			}
			n = leer.nextInt();
		}
		
		System.out.println("La suma de los numeros que estan dentro del intervalo da: " + sumaIntervalo);
		System.out.println("Hay " + contadorFuera + " numeros fuera del intervalo");
		
		leer.close();
	}

}
