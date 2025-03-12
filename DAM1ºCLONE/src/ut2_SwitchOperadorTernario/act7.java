package ut2_SwitchOperadorTernario;
import java.util.Scanner;
public class act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
int categoria;
double tasaImpuestos;
String clasificacionImpuesto;
 // Solicitar al usuario que introduzca su categoría
System.out.println("Introduce tu categoría (1, 2, 3 o 4): ");
categoria = leer.nextInt();
	        
// Variable para almacenar la tasa de impuestos
tasaImpuestos = 0;

switch (categoria) {
case 1: tasaImpuestos = 5.0; break;
case 2: tasaImpuestos = 10.0; break;
case 3: tasaImpuestos = 15.0; break;
case 4: tasaImpuestos = 20.0; break;
default: System.out.println("Categoría no válida. Debe ser 1, 2, 3 o 4."); break; // Salir si la categoría no es válida

}
// Usar un operador ternario para determinar si el impuesto es bajo, medio o alto
clasificacionImpuesto = (tasaImpuestos <= 5) ? "bajo" : (tasaImpuestos <= 15) ? "medio" : "alto";


System.out.println("Para la categoría " + categoria + ", la tasa de impuestos es "  + tasaImpuestos + "%, lo cual se considera " + clasificacionImpuesto + ".");
leer.close();
}
	
}
