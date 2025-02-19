package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leer = new Scanner(System.in);


			int baliza, cantNum, numeros, cantidadIntro=0, mayor=0, menor=0, sumaNum=0;
			System.out.println("Dame el numero baliza: ");
			baliza = leer.nextInt();
			System.out.println("Dime la cantidad de numeros que quieres introducir: ");
			cantNum = leer.nextInt();
			
		System.out.println("Introduce los numeros a comparar con la baliza:");
		
		do {
			numeros = leer.nextInt();
			cantidadIntro ++;
			if (numeros>baliza) {
				mayor ++;
				sumaNum += numeros;
			}else if (numeros<baliza) {
				menor ++;
			}
		}while (cantidadIntro<cantNum);
			
		System.out.println("Hay " + mayor + " número/s mayor/es que la baliza, " + menor + " menores y la suma de los mayores es " + sumaNum);
		leer.close();
	}

}
