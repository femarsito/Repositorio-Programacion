package ut2_practica2;
import java.util.Scanner;
public class act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
int nota;
System.out.println("Dame tu nota del 0-100");
nota = leer.nextInt();
if (nota>=0 && nota<=100) {
	if (nota >= 90 && nota <= 100) {
		System.out.println("Esta aprobado con un excelente.");
	} else if (nota >= 70 && nota <= 89) {
		System.out.println("Esta aprobado con un bueno");
	} else if (nota >= 50 && nota <= 69) {
		System.out.println("Esta aprobado con un regular.");
	} else System.out.println("Esta reprobado");
} else System.out.println("Mal, la nota tiene que estar entre 0-100");
nota = leer.nextInt();
	}

}
