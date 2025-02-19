package ut2_buclefor;
import java.util.Scanner;
public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leer = new Scanner(System.in);

	        System.out.print("Introduce un número entero para encontrar los primos hasta ese número: ");
	        int lim, n, divisor;
	        lim = leer.nextInt();

	        System.out.println("Números primos hasta " + lim + ":");
	        for (n = 2; n <= lim; n++) {
	        	boolean esPrimo = true;

	            for (divisor = 2; divisor <= Math.sqrt(n); divisor++) {
	                if (n % divisor == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }
	            if (esPrimo) {
	                System.out.print(n + " ");
	            }
	        }
	}

}
