package MetodoRecursividad;

import java.util.Scanner;

public class act {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int size;
		System.out.println("Cuantos numeros quieres meter");
		size = leer.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Dame los numeros ");
			int numeros = leer.nextInt();
			array[i] = numeros;
			
			}
		for (int i = 0; i<array.length; i++){
			System.out.print(array[i]+ ", ") ;
	
		}
}
}