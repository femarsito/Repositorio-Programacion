package ut5_POO_TipExamen;

import java.util.ArrayList;

public class Deportivo extends Coche {

	//Constructores heredados de la clase Coche, haciendo sobrecarga
	public Deportivo(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor,
			ArrayList<Ruedas> ruedas, ArrayList<Reparacion> reparacion) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas, reparacion);
	}

	public Deportivo(String marca, int numero, float precioCoste, float precioVenta) {
		super(marca, numero, precioCoste, precioVenta);
	}

	
}
