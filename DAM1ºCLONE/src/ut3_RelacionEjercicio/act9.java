package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);

double n1, n2, suma, resta, mult, div;
int eleccion;
System.out.println("Dame dos numeros");
n1 = leer.nextInt();
n2 = leer.nextInt();


do {
	System.out.println("Que operacion quieres realizar?");

	System.out.println("1. Suma");
	System.out.println("2. Resta");
	System.out.println("3. Multiplicación");
	System.out.println("4. División");
	System.out.println("5. Salir");

	eleccion = leer.nextInt();	
	
	switch (eleccion) {
	
	case 1: System.out.println("La suma da "); 
	suma = n1 + n2; 
	System.out.println(suma); break;
	
	case 2: System.out.println("La resta da ");
	resta = n1 - n2; 
	System.out.println(resta); break;
	
	case 3: System.out.println("La multiplicacion da ");
	mult = n1 * n2;
	System.out.println(mult); break;
	
	case 4: System.out.println(" ");
	div = n1/n2;
	while (n2 == 0) {
		System.out.println("ERROR, introduzca otro divisor diferente de 0");
		n2 = leer.nextInt();
		div = n1/n2;
	}
	System.out.println("La division da " + div); break;
	
	case 5: System.out.println("Ha salido del programa"); break;
	
	default: System.out.println("Esa funcion no existe"); 
	
	if (eleccion !=5) {
		System.out.println("Dame dos numeros");
		n1 = leer.nextInt();
		n2 = leer.nextInt();
	}
}
}while (eleccion !=5);
	
leer.close();
	}

}
