package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
int sumaPares=0, sumaImpares=0, contadorImp=1, contadorPar=2;

System.out.println("La suma de los numeros impares entre el 1 y el 100");
while (contadorImp < 100) {
	sumaImpares= sumaImpares+contadorImp;
	contadorImp= contadorImp+2;
}
System.out.println(sumaImpares);
System.out.println("La suma de los numeros pares entre el 1 y el 100");


while (contadorPar <= 100) {
	sumaPares= sumaPares+contadorPar;
	contadorPar= contadorPar+2;
}
System.out.println(sumaPares);

leer.close();
	}

}
