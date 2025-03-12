package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
int limite, n;
System.out.println("Dame un valor desde el 1 para tener un limite");
limite = leer.nextInt();

if (limite<=1) {
	do {
		System.out.println("ERROR, el numero debe ser mayor que 1");
		limite = leer.nextInt();
	} while (limite>1);
}

System.out.println("Ahora introduce un numero para decirte todos sus multiplos hasta el limite marcado");
n = leer.nextInt();

while (n<=0) {
	System.out.println("ERROR, introduce un numero mayor que 0");
	n = leer.nextInt();
}

System.out.println("Sus multiplos son:");

for (int multiplo= n; multiplo<=limite; multiplo +=n ) {
	System.out.println(multiplo);
}



leer.close();

	}

}
