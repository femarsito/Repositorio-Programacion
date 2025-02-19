package ut5_POO_TipExamen;
import java.util.*;
public class Coche {
	private String marca;
	private int numero;
	private float precioCoste;
	private float precioVenta;
	private Carroceria carroceria;
	private Motor motor;
	private ArrayList<Ruedas> ruedas = new ArrayList<>();
	private ArrayList<Reparacion> reparacion = new ArrayList<>();
	
	//Constructor
	public Coche(String marca, int numero, float precioCoste, float precioVenta) {
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}
	
	//Sobrecarga de constructor
	public Coche(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor,
			ArrayList<Ruedas> ruedas, ArrayList<Reparacion> reparacion) {
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
		this.carroceria = carroceria;
		this.motor = motor;
		this.ruedas = ruedas;
		this.reparacion = reparacion;
	}

	//Getters y Setters
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

	public ArrayList<Reparacion> getReparacion() {
		return reparacion;
	}

	public void setReparacion(ArrayList<Reparacion> reparacion) {
		this.reparacion = reparacion;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", numero=" + numero + ", precioCoste=" + precioCoste + ", precioVenta="
				+ precioVenta + ", carroceria=" + carroceria + ", motor=" + motor + ", ruedas=" + ruedas
				+ ", reparacion=" + reparacion + "]";
	}
	
	public void hacerRuedas(){
		Scanner leer = new Scanner(System.in);
	System.out.println("Cuantas ruedas lleva el coche?");
	int numRuedas = leer.nextInt();
	for (int i = 0; i<numRuedas; i++) {
		System.out.println("Introduce el tamaño de la rueda");
		float tamaño = leer.nextInt();
		System.out.println("Introduce el estado de la rueda:");
		String condicionR = leer.next();
		Ruedas rueda = new Ruedas (tamaño, condicionR); //Llamar a la clase
		ruedas.add(rueda); //Pasar array auxiliar al principal
	}
	}
}
