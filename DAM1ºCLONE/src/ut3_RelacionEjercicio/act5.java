package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
	    double mediaPos = 0, mediaNeg = 0, sumaPos = 0, sumaNeg = 0;
	    int ceros = 0, contPos = 0, contNeg = 0;
	    Scanner leer = new Scanner(System.in);

	    System.out.println("Dame 10 numeros");

	    for (int contador = 0; contador < 10; contador++) {
	         n = leer.nextDouble();
	        if (n < 0) {
	            sumaNeg += n;
	            contNeg++;
	       } else if (n > 0) {
	           sumaPos += n;
	          contPos++;
	       } else {
	          ceros++;
	       }
	    }

	   // Calcular medias solo si hay números positivos o negativos
	    if (contPos > 0) {
	     mediaPos = sumaPos / contPos;
	    }
	    if (contNeg > 0) {
	      mediaNeg = sumaNeg / contNeg;
	 }

	 System.out.println("La media de los positivos da " + mediaPos);
	 System.out.println("La media de los negativos da " + mediaNeg);
	 System.out.println("Hay " + ceros + " numeros 0");

	leer.close();
	}
}
