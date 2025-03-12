package ut5_POO;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*** Crea un circulo
//		Circulo c1 = new Circulo();
//		c1.setRadio(2.9);
//		System.out.println("Los datos del circulo: " + c1.toString());
		
		//*** Crea un televisor
//		Televisor tv1 = new Televisor();
//		Televisor tv2 = new Televisor();
//		tv1.subirCanal();
//		tv1.subirVolumen();
//		tv1.subirColor();
//		System.out.println(tv1.toString());
//		
//		 // Cambios adicionales para probar
//        tv1.bajarCanal();
//        tv1.bajarVolumen();
//        tv1.bajarColor();
//        System.out.println(tv1.toString());
//        
//		  // prueba de límites
//        for (int i = 0; i < 12; i++) {
//            tv1.subirCanal();
//        }
//        System.out.println(tv1.toString());
//
//        for (int i = 0; i < 12; i++) {
//            tv1.bajarCanal();
//        }
//        System.out.println(tv1.toString());
//
//        // prueba de volumen
//        for (int i = 0; i < 20; i++) {
//            tv1.subirVolumen();
//        }
//        System.out.println(tv1.toString());
//
//        for (int i = 0; i < 20; i++) {
//            tv1.bajarVolumen();
//        }
//        System.out.println(tv1.toString());
//
//        // prueba de color
//        for (int i = 0; i < 10; i++) {
//            tv1.subirColor();
//        }
//        System.out.println(tv1.toString());
//
//        for (int i = 0; i < 10; i++) {
//            tv1.bajarColor();
//        }
//        System.out.println(tv1.toString());
		
		
		Cliente c1 = new Cliente("Pepe","Pérez Hernández","C/Falsa, 123","Valdezorras",new Date(1990,01,01));
		Cuentas cuenta1 = new Cuentas(12345645,1524.12f,1.2f,c1);
		cuenta1.mostrarCuenta();
		}

	}


