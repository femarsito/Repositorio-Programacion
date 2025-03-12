package ut3_RelacionEjercicio;

import java.util.Scanner;

public class act13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca el día de su partida:");
		int dia1 = leer.nextInt();

		System.out.println("Introduzca la hora de su partida: ");
		int hora1 = leer.nextInt();

		System.out.println("Introduzca el minuto de su partida: ");
		int minuto1 = leer.nextInt();

		leer.nextLine();
		
		System.out.println("Introduzca si es am o pm: ");

		String mañanaOTarde1 = leer.nextLine();
		System.out.println("Introduzca el día de su llegada:");

		int dia2 = leer.nextInt();
		System.out.println("Introduzca la hora de su llegada :");

		int hora2 = leer.nextInt();
		System.out.println("Introduzca el minuto de su llegada: ");

		int minuto2 = leer.nextInt();
		leer.nextLine();

		System.out.println("Introduzca si es am o pm: ");

		String mañanaOTarde2 = leer.nextLine();

		if (mañanaOTarde1 == ("pm") && hora1 != 12) {
          hora1 += 12; 
          
		}else if (mañanaOTarde1 == ("am") && hora1 == 12){
			hora1 = 0;}

        if (mañanaOTarde2 == ("pm") && hora2 != 12) {
            hora2 += 12; 
        }else if (mañanaOTarde2 == ("am") && hora2 == 12){
            hora2 = 0; 
        }

        int minutosA = (dia1 * 24 * 60) + (hora1 * 60) + minuto1;
        int minutosB = (dia2 * 24 * 60) + (hora2 * 60) + minuto2;
        int tiempo = minutosB - minutosA;
        int horas = tiempo / 60;
        int minutos = tiempo - (horas*60);
        int dias = horas / 24;
        horas = horas - dias;
        if (tiempo < 0) {
        	System.out.println("La fecha no concuerda");
        }else System.out.println("El tiempo transcurrido es de " + dias + " dias, " + horas + " horas " + minutos + " minutos");

 leer.close();
	}

}
