package ut3_Recursividad;

import java.util.Scanner;

public class Recursividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Introduce una palabra:");
	        String palabra = scanner.nextLine(); 

	        if (estaOrdenada(palabra)) {
	            System.out.println("La palabra \"" + palabra + "\" está ordenada alfabéticamente.");
	        } else {
	            System.out.println("La palabra \"" + palabra + "\" no está ordenada alfabéticamente.");
	        }
	        
	        scanner.close(); 
	    }
	    public static boolean estaOrdenada(String palabra) {
	        if (palabra.length() <= 1) {
	            return true;
	        }
	        return estaOrdenadaRec(palabra, 0);
	    }

	   
	    private static boolean estaOrdenadaRec(String palabra, int index) {
	        if (index == palabra.length() - 1) {
	            return true;
	        }
	        if (palabra.charAt(index) > palabra.charAt(index + 1)) {
	            return false; 
	        }
	        return estaOrdenadaRec(palabra, index + 1);
	}

}
