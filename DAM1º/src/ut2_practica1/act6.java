package ut2_practica1;
import java.util.Scanner;
public class act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n1, n2;
		double hipotenusa;
		System.out.println ("Introduce dos numeros enteros de dos lados catetos de un triangulo: ");
		n1 = leer.nextInt();
		n2 = leer.nextInt();
		
		hipotenusa = Math.sqrt(Math.pow(n1, 2) + Math.pow(n2, 2));
		System.out.println ("La hipotenusa da: " + hipotenusa);
		
		
		
		
		
	}

}
