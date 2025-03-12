package ut2_practica1;
import java.util.Scanner;

public class act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int horas, minutos, segundos;
		 System.out.print("Ingresa una cantidad de horas: ");
		 horas = leer.nextInt();
		 minutos = horas*60;
		 segundos = horas*3600;
		 
		 System.out.println(horas + " horas equivalen a " + minutos + " minutos.");
	     System.out.println(horas + " horas equivalen a " + segundos + " segundos.");

		 
	}

}
