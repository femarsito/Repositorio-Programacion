package ut5_POO_Practicar2;

public class Carroceria {
	private String color;
	private String condicion;
	
	public Carroceria(String color, String condicion) {
		this.color = color;
		this.condicion = condicion;
	}

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

	@Override
	public String toString() {
		return "Carroceria [color=" + color + ", condicion=" + condicion + "]";
	}
	
	
}
