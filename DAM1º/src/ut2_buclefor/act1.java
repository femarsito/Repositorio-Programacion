package ut2_buclefor;
import java.util.Scanner;
public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);
int n, invertido, numDigitos, digito, m;
System.out.println("Dame un numero y te lo dare invertido: ");
n = leer.nextInt();

numDigitos =(int) Math.log10(n) +1;
invertido=0;

for(m= 0; m<numDigitos; m++) {
	digito= n%10;
	invertido= invertido*10+digito;
	n/=10;
}
System.out.println("El numero invertido da: " + invertido);

	}

}
