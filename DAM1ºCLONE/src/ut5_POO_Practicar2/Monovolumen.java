package ut5_POO_Practicar2;

import java.util.ArrayList;

public class Monovolumen extends Coche {
	private int plazas;

	

	public Monovolumen(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria,
			Motor motor, ArrayList<Ruedas> ruedas, int plazas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
		// TODO Auto-generated constructor stub
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
}
