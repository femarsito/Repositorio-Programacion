package ut3_practica;
import java.util.Scanner;
public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
double prog, leng, bdd, entorno, sistemas, fol, media;

System.out.println("Por favor introduzca la nota de programación");
prog = leer.nextDouble();
System.out.println("Por favor introduzca la nota de Lenguaje de Marcas");
leng = leer.nextDouble();
System.out.println("Por favor introduzca la nota de Base de Datos");
bdd = leer.nextDouble();
System.out.println("Por favor introduzca la nota de Sistemas Informaticos");
sistemas = leer.nextDouble();
System.out.println("Por favor introduzca la nota de FOL");
fol = leer.nextDouble();
	
	media = (prog+leng+bdd+sistemas+fol)/5;
	System.out.println("La media de las asignaturas es de "+media);
	}

}
