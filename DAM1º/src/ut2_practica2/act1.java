package ut2_practica2;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n1, n2;
		System.out.println("Dame un numero para decirte si es par o impar: ");
		n1 = leer.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("El numero es par");
		} else {

			System.out.println("El numero es impar");
		}

	}
}
