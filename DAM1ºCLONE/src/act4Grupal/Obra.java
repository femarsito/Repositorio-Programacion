package act4Grupal;

import java.util.Objects;

public class Obra {

	protected String titulo;
	protected int numInventario;
	protected String autor;
	protected int anio;
	
	public Obra(String titulo, int numInventario, String autor, int anio) {
		this.titulo = titulo;
        this.numInventario = numInventario;
        this.autor = autor;
        this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumInventario() {
		return numInventario;
	}

	public void setNumInventario(int numInventario) {
		this.numInventario = numInventario;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Obra [titulo=" + titulo + ", numInventario=" + numInventario + ", autor=" + autor + ", anio=" + anio
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, autor, numInventario, titulo);
	}

	 @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obra other = (Obra) obj;
		return anio == other.anio && Objects.equals(autor, other.autor) && numInventario == other.numInventario
				&& Objects.equals(titulo, other.titulo);
	}
	
	
}
