package ut2_SwitchOperadorTernario;

import java.util.Scanner;

public class act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
int valor;
double descuento;
System.out.println("Cual es el valor de su compra?");
valor = leer.nextInt();
descuento = valor>100 ? valor*0.90 : valor*0.95;

if (valor>100) {
	System.out.println("Se le ha aplicado un desceunto del 10%, el precio a pagar es de " + descuento + " €");
} else System.out.println("Se le ha aplicado un descuento del 5%, el precio a pagar es de " + descuento + " €");
leer.close();
	}

}
