package retojueves;

/**
 * Clase que representa una pintura.
 */
public class Pintura extends Obra {
    private double ancho;
    private double alto;
    private String soporte;

    public Pintura(String titulo, int numeroInventario, Artista autor, int anoRealizacion, double ancho, double alto, String soporte) {
        super(titulo, numeroInventario, autor, anoRealizacion);
        this.ancho = ancho;
        this.alto = alto;
        this.soporte = soporte;
    }

    public double superficie() { return ancho * alto; }

    @Override
    public void muestra() {
        System.out.println("Pintura: " + titulo + " de " + autor + " en " + soporte + " con dimensiones " + ancho + "x" + alto + " metros.");
    }
}
