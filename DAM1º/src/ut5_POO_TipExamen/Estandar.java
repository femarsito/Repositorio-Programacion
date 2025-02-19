package ut5_POO_TipExamen;

import java.util.ArrayList;

public class Estandar extends Coche{

	private int puertas;

	//Constructor de Estandar con atributos heredados de la clase Coche
	
	public Estandar(String marca, int numero, float precioCoste, float precioVenta, int puertas) {
		super(marca, numero, precioCoste, precioVenta);
		this.puertas = puertas;
	}
	
	//Constructor sobre cargado de Estandar con los demas atributos heredados de Coche
	public Estandar(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor,
			ArrayList<Ruedas> ruedas, ArrayList<Reparacion> reparacion, int puertas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas, reparacion);
		this.puertas = puertas;
	}

	

	//Getters y Setters de Estandar
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	
	
	
}
