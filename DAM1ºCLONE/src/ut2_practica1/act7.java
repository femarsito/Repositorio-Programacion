package ut2_practica1;
import java.util.Scanner;
public class act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n1;
		int modulo;
		int valorAbsoluto; 
		System.out.println("Dame dos numeros ");
		n1 = leer.nextInt();
		valorAbsoluto = Math.abs(n1);
		modulo = n1 % 2;
		
		System.out.println("El valor absoluto del numero es: " + valorAbsoluto);
		System.out.println("El resto de dividir el numero por 2 es: " + modulo);
		
	}

}
