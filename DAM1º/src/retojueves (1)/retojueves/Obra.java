package retojueves;

/**
 * Clase abstracta que representa una obra artística.
 */
public abstract class Obra {
    protected String titulo;
    protected int numeroInventario;
    protected Artista autor;
    protected int anoRealizacion;

    public Obra(String titulo, int numeroInventario, Artista autor, int anoRealizacion) {
        this.titulo = titulo;
        this.numeroInventario = numeroInventario;
        this.autor = autor;
        this.anoRealizacion = anoRealizacion;
    }

    public int getNumeroInventario() { return numeroInventario; }
    public abstract void muestra();
}
