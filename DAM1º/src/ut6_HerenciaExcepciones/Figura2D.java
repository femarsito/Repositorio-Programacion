package ut6_HerenciaExcepciones;

public abstract class Figura2D {
	private int numeroLados;

	public Figura2D(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public abstract double area();
}
