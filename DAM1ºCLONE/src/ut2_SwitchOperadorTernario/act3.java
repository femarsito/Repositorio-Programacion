package ut2_SwitchOperadorTernario;

import java.util.Scanner;

public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int nota;
System.out.println("Que nota has sacado? (1-4)");
nota = leer.nextInt();
switch (nota) {
case 1: System.out.println("Nivel novato"); break;
case 2: System.out.println("Nivel Intermedio"); break;
case 3: System.out.println("Nivel Avanzado"); break;
case 4: System.out.println("Nivel Experto"); break;
default: System.out.println("Esa nota no existe"); break;
}
leer.close();
	}

}
