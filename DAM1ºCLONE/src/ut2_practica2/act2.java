package ut2_practica2;
import java.util.Scanner;

public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int n;
		System.out.println("Dime tu edad: ");
		n = leer.nextInt();
		if (n>=0 && n<=12) {
			System.out.println("Niño");
		} else if (n>12 && n<=17){
			System.out.println("Adolescente");
		} else if (n>17 && n<=64) {
			System.out.println("Adulto");
		}else if (n>64) {
			System.out.println("Adulto mayor");
		}
	}
}
