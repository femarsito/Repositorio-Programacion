package ut3_Recursividad;


public class sumaDigitos {
    public static int sumarDigitos(int
numero) {

        // Caso base: si el número es menor que 10, no hay más dígitos que sumar

        if (numero < 10) {

            return numero;

        }

        // Caso recursivo: sumar el último dígito al resultado de la recursión sobre el resto

        return (numero % 10) + sumarDigitos(numero / 10);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dado un numero entero positivo, calcula la suma de sus digitos usando recursividad. Por ejemplo: Entrada: 1234 - Salida: 1+2+3+4=10
        int numero = 1234; // Número de ejemplo

        System.out.println("La suma de los dígitos de " + numero + " es: " + sumarDigitos(numero));
		
	}

}
