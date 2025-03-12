package ut5_POO_Practicar2;
import java.util.ArrayList;
public class Estandar extends Coche {
	private int puertas;

	public Estandar(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor,
			ArrayList<Ruedas> ruedas, int puertas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
		this.puertas = puertas;
		}
	

	public int getPuertas() {
		return puertas;
	}

	
		

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	
}
