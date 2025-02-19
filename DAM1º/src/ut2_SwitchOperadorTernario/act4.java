package ut2_SwitchOperadorTernario;

import java.util.Scanner;

public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int edad;

System.out.println("Indica tu edad para saber si puedes votar o no:");
edad = leer.nextInt();

//Operador Ternario

//variable = (condicion) ? valor_si_verdadero : valor_si_falso;
String mensaje = edad>=18 ? "Puede votar" : "No puede votar";

System.out.println(mensaje);
leer.close();
	}

}
