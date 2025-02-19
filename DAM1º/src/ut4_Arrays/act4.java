package ut4_Arrays;

public class act4 {
//Crea un método que reciba dos Arrays como parámetros, y devuelva un Array
//con los valores máximos en cada una de las posiciones. Se debe tener en
//cuenta que los Arrays podrán ser de tamaños distintos.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array1 = {4, 8, 15, 1};
int [] array2 = {7, 2, 11, 18};
int[] resultado = ParametroMayor(array1, array2);
System.out.println(Arrays.toString(resultado));
	}
	public static int[] ParametroMayor(int[] array1, int[] array2) {
		int length1 = array1.length;
		int length2 = array2.length;
		int maxLength = length1 > length2 ? length1 : length2;
		int[] resultado = new int [maxLength];
	
		for (int i = 0; i<maxLength; i++) {
		int  valor1 = i < length1 ? array1[i] : 0;
		int valor2 = i < length2 ? array2[i] : 0;
		
		if (i < length1 && i < length2) {
			resultado[i] = (valor1>valor2 ? valor1 : valor2);
		} else if (i<length1) {
			resultado[i] = valor1;
		} else if (i<length2) {
			resultado[i] = valor2;
		}
		}
		return resultado;
	}
}
