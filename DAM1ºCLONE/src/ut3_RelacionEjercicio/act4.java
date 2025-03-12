package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int n;
String caraOpuesta;
System.out.println("Dame un numero del 1 al 6");
n = leer.nextInt();

if (n<1 || n >6) {
	System.out.println("ERROR: numero incorrecto");
	n = leer.nextInt();
} else {
	switch (n) {
	case 1: caraOpuesta = "seis"; break; 
	case 2: caraOpuesta = "cinco"; break; 
	case 3: caraOpuesta = "cuatro"; break; 
	case 4: caraOpuesta = "tres"; break; 
	case 5: caraOpuesta = "dos"; break; 
	case 6: caraOpuesta = "uno"; break; 
	default:  caraOpuesta = ""; 
	}
	System.out.println("La cara opuesta es " + caraOpuesta);
}
leer.close();
}

	


	}

