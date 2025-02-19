package ut3_Recursividad;

public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadena1 = "Hola";
String cadena2 = " mundo!";
String resultado = concatenar (cadena1, cadena2);
System.out.println("Resultado: " + resultado);
	}
	
	static String concatenar(String primero, String segundo){
	return primero + segundo;
}
	

}
