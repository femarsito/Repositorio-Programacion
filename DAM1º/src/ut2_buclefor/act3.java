package ut2_buclefor;
import java.util.Scanner;
public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n, num1, num2, siguiente;
		num1 = 0;
		num2 = 1;
        System.out.print("Introduce el número de términos de la serie de Fibonacci que quieres ver: ");
        n = leer.nextInt();

        System.out.println("Serie de Fibonacci con " + n + " términos:");

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");

            siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;

	}
	leer.close();
	}
	
}
