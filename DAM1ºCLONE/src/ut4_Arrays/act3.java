package ut4_Arrays;

public class act3 {
//Crea un método que reciba un Array de Strings y un char. Deberá mostrar
//todas las Strings cuya primera letra sea el char pasado como parámetro.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"hola", "mundo", "java", "que tal estas"};
	  char caracter = 'h';
	  	System.out.println("El String que comienza con el caracter " + caracter + " son:");
	  	encontrarCaracter(array, caracter);
}

	public static void encontrarCaracter(String[] array, char caracter) {
	  for (int i = 0; i < array.length; i++) {
	      if (array[i].charAt(0) == caracter) {
	          System.out.println(array[i]);
	      }
	  }
	}

}
