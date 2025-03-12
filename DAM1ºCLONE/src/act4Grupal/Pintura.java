package act4Grupal;

import java.util.Objects;

public class Pintura extends Obra {
	private double ancho;
	private double alto;
	private String soporte;
	
	 public Pintura(String titulo, int numInventario, String autor, int anio, double ancho, double alto, String soporte) {
	        super(titulo, numInventario, autor, anio);
	        this.ancho = ancho;
	        this.alto = alto;
	        this.soporte = soporte;
	    }

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}

	@Override
	public String toString() {
        return "Pintura{" +
                "titulo='" + titulo + '\'' +
                ", numeroInventario='" + numInventario + '\'' +
                ", autor=" + autor +
                ", anio=" + anio +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", soporte='" + soporte + '\'' +
                '}';
    }
	
	 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pintura other = (Pintura) obj;
		return Double.doubleToLongBits(alto) == Double.doubleToLongBits(other.alto)
				&& Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho)
				&& Objects.equals(soporte, other.soporte);
	}

	    // Método para calcular la superficie de la pintura
	    public double superficie() {
	        return ancho * alto; // Área de la pintura
	    }
	
}
