package ut3_Metodo;
import java.util.Scanner;

public class act6 {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero:");
        int n = leer.nextInt();
        if (esPar(n)) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
}
