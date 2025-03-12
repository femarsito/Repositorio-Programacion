package ut5_POO_TipExamen;

public class Carroceria {
//Atributos de Carroceria
	private String color;
	private String condicion;
	
	//Constructor de Carroceria
	public Carroceria(String color, String condicion) {
		super();
		this.color = color;
		this.condicion = condicion;
	}

	//Getter y Setters de Carroceria
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	
}
