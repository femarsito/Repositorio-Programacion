package ut4_Arrays;

public class act1 {
//Crea un método que dado un Array de enteros y un valor entero, muestre la
//cantidad de veces que aparece el entero en el Array.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = {4, 6, 3, 2, 4, 2, 2};
	        int n = 2;
	        System.out.println("El numero entero " + n + " aparece " + contarAparicion(array, n) + " veces en el array");
}

	public static int contarAparicion(int[] array, int valor) {
	  int contador = 0;
	  for (int i = 0; i < array.length; i++) {
	      if (array[i] == valor) {
	          contador++;
	      }
	  }
	  return contador;
	}

}
