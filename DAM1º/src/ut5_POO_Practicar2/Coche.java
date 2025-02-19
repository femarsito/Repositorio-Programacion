package ut5_POO_Practicar2;
import java.util.ArrayList;
import java.util.Date;
public class Coche {
	private String marca;
	 private int numero;
	 private float precioCoste;
	 private float precioVenta;
	 private Carroceria carroceria;// Relación de composición (1 a 1)
	 private Motor motor;// Relación de composición (1 a 1)
	 private ArrayList<Ruedas> ruedas; //Pq puede tener de 4-5 ruedas
	 
	 
	 public Coche(String marca, int numero, float precioCoste, float precioVenta) {
		super();
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}


	public Coche(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor,
			ArrayList<Ruedas> ruedas) {
		
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
		this.carroceria = carroceria;
		this.motor = motor;
		this.ruedas = ruedas;
		}
	
	

	@Override
	public String toString() {
		return "Coche [marca=" + marca + "\n "+ "numero=" + numero + "\n " + ", precioCoste=" + precioCoste + "\n " + ", precioVenta="
				+ precioVenta + "\n " + "carroceria=" + carroceria.toString() + "\n " + ", motor=" + motor.toString() + "\n " + ", ruedas=" + ruedas.toString() + "\n " + "]";
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getPrecioCoste() {
		return precioCoste;
	}
	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Carroceria getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public ArrayList<Ruedas> getRuedas() {
		return ruedas;
	}


	public void setRuedas(ArrayList<Ruedas> ruedas) {
		this.ruedas = ruedas;
	}
	
}
