package ut3_Recursividad;

import java.util.Scanner;

public class act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
	        
	    System.out.println("Introduce un número natural mayor que cero:");
	    int n = leer.nextInt(); 

	    if (n > 0) {
	        int suma = sumarNaturales(n);
	            
	        System.out.println("La suma de los números naturales desde 1 hasta " + n + " es: " + suma);
	    } else {
	        System.out.println("El número debe ser mayor que cero.");
	    }
	    leer.close();
	    }
	public static int sumarNaturales(int n) {
	    if (n == 1) {
	        System.out.print("1");
	        return 1;
	    }
	    int sumaAnterior = sumarNaturales(n - 1);
	    if (n != 1) {
	        System.out.print(" + " + n);
	    }
	    return sumaAnterior + n; 

}
}
