package ut5_POO_TipExamen;

public class Ruedas {
//Atributos de Ruedas
	private float tamaño;
	private String condicion;
	
	//Constructor de Ruedas
	public Ruedas(float tamaño, String condicion) {
		super();
		this.tamaño = tamaño;
		this.condicion = condicion;
	}

	//Getter y Setters de Ruedas
	public float getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	
}
