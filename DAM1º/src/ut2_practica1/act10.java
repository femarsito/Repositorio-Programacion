package ut2_practica1;
import java.util.Scanner;
public class act10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
	int nacimiento, edad, actual;
	System.out.println ("Ingresa tu año de nacimiento: ");
	nacimiento = leer.nextInt();
	System.out.println ("Ingresa el año actual: ");
	actual = leer.nextInt();
	
	edad = actual - nacimiento;
	
	System.out.println ("La edad que tiene es: " + edad);
	}

}
