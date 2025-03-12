package ut3_Recursividad;

public class act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(esNumeroValido("123"));           // true
        System.out.println(esNumeroValido("-456"));          // true
        System.out.println(esNumeroValido("12.34"));         // false
        System.out.println(esNumeroValido("abc"));           // false
        System.out.println(esNumeroValido(""));              // false
        System.out.println(esNumeroValido("2147483647"));    // true (máximo valor entero)
        System.out.println(esNumeroValido("2147483648"));    // false (fuera del rango)
        System.out.println(esNumeroValido("-2147483648"));   // true (mínimo valor entero)
        System.out.println(esNumeroValido("-2147483649"));   // false (fuera del rango)
    }

    public static boolean esNumeroValido(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }

        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
}
}
