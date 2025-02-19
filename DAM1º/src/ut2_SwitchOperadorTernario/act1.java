package ut2_SwitchOperadorTernario;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
int n;
System.out.println("Dame un numero del 1-7");
n = leer.nextInt();
	switch (n) {
	case 1: System.out.println("Lunes"); break;
	case 2: System.out.println("Martes"); break;
	case 3: System.out.println("Miercoles"); break;
	case 4: System.out.println("Jueves"); break;
	case 5: System.out.println("Viernes"); break;
	case 6: System.out.println("Sabado"); break;
	case 7: System.out.println("Domingo"); break;
	default: System.out.println("El numero no se encuentra entre el 1 y 7"); break;
	}
leer.close();
	}
	
}
