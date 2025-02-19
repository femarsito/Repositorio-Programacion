package ut3_RelacionEjercicio;
import java.util.Scanner;
public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int numero;
		int n1, n2, n3, n4;
		int contador = 1000;
		System.out.println("Dame un numero de 4 cifras");
		numero = leer.nextInt();
		
		
			n1 = numero/contador;
			System.out.println(n1);
			contador=contador/10;
			n2 = numero/contador-(n1*10);
			System.out.println(n2);
			contador=contador/10;
			n3 = numero/contador-(n1*100+n2*10);
			System.out.println(n3);
			contador=contador/10;
			n4 = numero/contador-(n1*1000+n2*100+n3*10);
			System.out.println(n4);
		
		leer.close();
		
	}

}
