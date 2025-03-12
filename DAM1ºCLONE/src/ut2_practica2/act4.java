package ut2_practica2;
import java.util.Scanner;
public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduce 3 numeros: " );
		n1= leer.nextInt();
		n2= leer.nextInt();
		n3= leer.nextInt();
		
	if (n1>n2 && n1>n3) {
		System.out.println(n1 + " es el  mayor");
	} else if (n2>n1 && n2>n3) {
		System.out.println(n2 + " es el mayor ");
	} else System.out.println(n3 + " es el mayor");
	}
}
