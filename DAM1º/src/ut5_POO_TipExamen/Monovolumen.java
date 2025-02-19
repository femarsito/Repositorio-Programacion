package ut5_POO_TipExamen;

import java.util.ArrayList;

public class Monovolumen extends Coche {

	private int plazas;

	public Monovolumen(String marca, int numero, float precioCoste, float precioVenta, int plazas) {
		super(marca, numero, precioCoste, precioVenta);
		this.plazas = plazas;
	}

	//Constructor Monovolumen con atributs heredados de la clase Coche
	public Monovolumen(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria,
			Motor motor, ArrayList<Ruedas> ruedas, ArrayList<Reparacion> reparacion, int plazas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas, reparacion);
		this.plazas = plazas;
	}

	//Getters y Setter de Monovolumen
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	
}
