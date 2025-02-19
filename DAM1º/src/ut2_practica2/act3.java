package ut2_practica2;
import java.util.Scanner;
public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leer = new Scanner(System.in);
	int n;
	System.out.println("Escribe un numero ");
	n = leer.nextInt(); 
	if (n>=0 && n<=100) {
		if (n>=90 && n<= 100) {
			System.out.println("A");
		} else if (n>=80 && n<=89) {
			System.out.println("B");
		} else if (n>=70 && n<= 79) {
			System.out.println("C");
		} else if (n>=60 && n<=69) {
			System.out.println("D");
		} else System.out.println("F");
	}
	}

}
