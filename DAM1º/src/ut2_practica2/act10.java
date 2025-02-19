package ut2_practica2;
import java.util.Scanner;

public class act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su ingreso anual: ");
        double ingresoAnual = leer.nextDouble();
        double impuesto = 0;

        if (ingresoAnual < 10000) {
            impuesto = 0;
        } else if (ingresoAnual >= 10000 && ingresoAnual <= 20000) {
            impuesto = ingresoAnual * 0.10;
        } else if (ingresoAnual > 20000 && ingresoAnual <= 30000) {
            impuesto = ingresoAnual * 0.15;
        } else if (ingresoAnual > 30000) {
            impuesto = ingresoAnual * 0.20;
        }

        System.out.printf("El impuesto a pagar es: %.2f%n", impuesto);
        leer.close();

	}

}
