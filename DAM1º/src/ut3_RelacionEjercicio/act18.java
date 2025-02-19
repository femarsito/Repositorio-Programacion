package ut3_RelacionEjercicio;

public class act18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int n = 100;  
	   int sumaTotal = n * (n + 1) / 2;
	   int sumaIzquierda = 0;

	     for (int k = 1; k <= n; k++) {
	         
	     int sumaDerecha = sumaTotal - sumaIzquierda - k;

	      if (sumaIzquierda == sumaDerecha) {
	          System.out.println("Centro numérico encontrado: " + k);
	       }
	    sumaIzquierda += k;
	        }
	}

}
