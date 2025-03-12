package ut3_Metodo;
import java.util.Scanner;
public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
System.out.println("Escribe un numero");
int n = leer.nextInt();
for (int i=1; i <= 10; i++) {
	int solucion = tablaMult (n,i);
	System.out.println(n+ " x " + i+ " = " +solucion);
}
	}
public static int tablaMult (int num, int i)
{
	int resultado = num * i;
	return resultado;
	}
}
