package ut2_SwitchOperadorTernario;

import java.util.Scanner;

public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int n;

System.out.println("Dame un numero del 1-4 ");
n = leer.nextInt();

switch (n) {
case 1: System.out.println("Primavera");
case 2: System.out.println("Verano");
case 3: System.out.println("Otoño");
case 4: System.out.println("Invierno");
}
leer.close();
	}


}
