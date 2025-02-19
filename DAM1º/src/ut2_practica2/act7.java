package ut2_practica2;
import java.util.Scanner;
public class act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int n;
System.out.println("Dame un numero");
n = leer.nextInt();
if (n==0) {
	System.out.println("El numero es 0");
} else if (n<0) {
	System.out.println("El numero es negativo");
} else if (n>0) {
	System.out.println("El numero es positivo");
	if (n%2==0) {
		System.out.println ( n + " es par");
	} else System.out.println( n + " es impar");
}
	}

}
