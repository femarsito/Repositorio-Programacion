package ut2_practica1;
import java.util.Scanner;
public class act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		double nDecim, redondeoArriba, redondeoAbajo;
		long valorRedondeado;
		
		System.out.println ("Ingresa un numero decimal: ");

		  
		nDecim = leer.nextDouble();
		
		valorRedondeado = Math.round(nDecim);
		redondeoArriba = Math.ceil(nDecim);
		redondeoAbajo = Math.floor(nDecim);
		
		  System.out.println("Valor redondeado: " + valorRedondeado);
	      System.out.println("Valor redondeado hacia arriba (Math.ceil): " + redondeoArriba);
	      System.out.println("Valor redondeado hacia abajo (Math.floor): " + redondeoAbajo);
		
	}

}
