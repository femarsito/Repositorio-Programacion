package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
String continuar;
do {
	int n1, n2, contadorn1=1, sumadivn1=0, contadorn2=1, sumadivn2=0;
	

	System.out.println("Introduce dos numeros y te dire si son amigos");
	n1 = leer.nextInt();
	n2 = leer.nextInt();
	do {
		
		if ( n1%contadorn1==0) {
			
			System.out.println(contadorn1);
			sumadivn1= sumadivn1+contadorn1;
		}
		contadorn1++;
	}while (contadorn1 < n1);
	System.out.println("La suma total de los divisores da " + sumadivn1);

	do {
		
		if (n2%contadorn2==0){
			
			System.out.println(contadorn2);
			sumadivn2= sumadivn2+contadorn2;
		}
		contadorn2++;
	}while (contadorn2 < n2);
	System.out.println("La suma total de los divisores da " + sumadivn2);
		if (sumadivn1==n2 && sumadivn2==n1) {
			System.out.println(n1 + " y " + n2 + " son numeros amigos");
		} else System.out.println("No son numeros amigos");
		System.out.println("Quiere continuar? (s/n)");
		continuar=leer.next();
} while (continuar.equalsIgnoreCase("s"));

	leer.close();
	}
	
}
