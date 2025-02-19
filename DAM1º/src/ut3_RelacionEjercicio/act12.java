package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int numTiradas, vecesTiradas=0, contador1=0, contador2=0, contador3=0, contador4=0, contador5=0, contador6=0;

System.out.println("Cuantas veces quieres tirar el dado?");
numTiradas = leer.nextInt();
do {
	int resultado = ((int)(Math.random() * 6)+1);
	switch (resultado) {
	case 1: contador1++; break;
	case 2: contador2++; break;
	case 3: contador3++; break;
	case 4: contador4++; break;
	case 5: contador5++; break;
	case 6: contador6++; break;

}
	
	vecesTiradas++;
}while(vecesTiradas<numTiradas);

System.out.println("Cara 1: " + (contador1 * 100.0 /numTiradas));
System.out.println("Cara 2: " + (contador2 * 100.0 /numTiradas));
System.out.println("Cara 3: " + (contador3 * 100.0 /numTiradas));
System.out.println("Cara 4: " + (contador4 * 100.0 /numTiradas));
System.out.println("Cara 5: " + (contador5 * 100.0 /numTiradas));
System.out.println("Cara 6: " + (contador6 * 100.0 /numTiradas));

leer.close();
	}

}
