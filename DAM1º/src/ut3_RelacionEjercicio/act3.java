package ut3_RelacionEjercicio;
import java.util.Scanner;
public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		int n;
		int cantidadPrimos = 0; 

		System.out.println("Dame un numero del 1 al 100");
		n = leer.nextInt();
		
		if (n<1 || n>100) {
			System.out.println("El numero debe estar entre el 1 y el 100");
			n = leer.nextInt();
		} else {
			for (int i = 1; i<=n; i++) {
				if (esPrimo(i)) {
					cantidadPrimos++;
				}
			}
		}
		System.out.println("Hay " + cantidadPrimos + " numeros primos");
	
		leer.close();
	}
	static boolean esPrimo(int numero) {
		if (numero<2 ) {
			return false;
		}
		for (int i = 2 ; i<=Math.sqrt(numero); i++){
			if (numero % i == 0){
				return false;
			}
		}
		return true;
		}
}
