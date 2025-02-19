package ut3_Recursividad;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Double resultado, n1, n2, n3;
Scanner leer = new Scanner(System.in);
System.out.println("Dame 3 numeros y te dire su promdeio");
n1 = leer.nextDouble();
n2 = leer.nextDouble();
n3 = leer.nextDouble();

resultado = calcularPromedio(n1, n2, n3);

System.out.println("El promedio entre estos dos numeros es de " + resultado);
leer.close();
	}
public static Double calcularPromedio (Double numero1, Double numero2, Double numero3) {
	return ((numero1+numero2+numero3)/3);
}
}
