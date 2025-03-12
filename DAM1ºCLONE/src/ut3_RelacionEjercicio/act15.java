package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números en la secuencia: ");
        int cantidadNumeros = leer.nextInt();

        if (cantidadNumeros < 2) {
            System.out.println("Debe introducir al menos dos números.");
            
        }

        System.out.print("Introduce el número 1: ");
        int mayor1 = leer.nextInt();

        System.out.print("Introduce el número 2: ");
        int mayor2 = leer.nextInt();

        if (mayor2 > mayor1) {
            int temp = mayor1;
            mayor1 = mayor2;
            mayor2 = temp;
        }

        for (int i = 3; i <= cantidadNumeros; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = leer.nextInt();

            if (numero > mayor1) {
                mayor2 = mayor1;
                mayor1 = numero;
            } else if (numero > mayor2) {
                mayor2 = numero;
            }
        }

        System.out.println("Los dos números mayores son: ");
        System.out.println("Mayor 1: " + mayor1);
        System.out.println("Mayor 2: " + mayor2);
        
        leer.close();
	}

}
