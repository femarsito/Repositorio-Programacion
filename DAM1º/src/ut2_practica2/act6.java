package ut2_practica2;
import java.util.Scanner;
public class act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		double l1, l2, l3;
		
		System.out.println("dame las 3 longuitudes de los lados de un triangulo, y te dire si puede formar un triangulo o no");
		l1 = leer.nextDouble();
		l2 = leer.nextDouble();
		l3 = leer.nextDouble();

		if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
			if (l1==l2 && l1==l3 && l2==l3) {
				System.out.println("El triangulo es equilatero");
			} else if (l1==l2 || l2==l3 || l1==l3) {
				System.out.println("El triangulo es ísosceles");
			} else System.out.println("El triangulo es escaleno");
		} else System.out.println("Los lados no pueden formar un triangulo");
	}

}
