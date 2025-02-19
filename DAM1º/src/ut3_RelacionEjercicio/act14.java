package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		int cobroDesplaz, ventas, sueldoFijo, comision, km, dietas, retencionSS;
		retencionSS = 150;
		double sueldoLiquido, IRPFrestado = 0.82;
		System.out.println("Introduzca el su sueldo fijo");
		sueldoFijo = leer.nextInt();
		System.out.println("Cuanto dinero saco de las ventas realizadas?");
		ventas = leer.nextInt();
		comision = ((ventas*5)/100);
		System.out.println("Cuantos kilometros se ha desplazado?");
		km = leer.nextInt();
		System.out.println("Cuantos dias se ha desplazado?");
		dietas = leer.nextInt();
		cobroDesplaz = dietas * 60;
		sueldoLiquido = (sueldoFijo * IRPFrestado) + comision + km + cobroDesplaz - retencionSS; 
		System.out.println("El suedo liquido es de: " + sueldoLiquido + " €");
		leer.close();	}

}
