package retojueves;

/**
 * Clase que representa una escultura.
 */
public class Escultura extends Obra {
    private String material;
    private double altura;

    public Escultura(String titulo, int numeroInventario, Artista autor, int anoRealizacion, String material, double altura) {
        super(titulo, numeroInventario, autor, anoRealizacion);
        this.material = material;
        this.altura = altura;
    }

    public double getAltura() { return altura; }

    @Override
    public void muestra() {
        System.out.println("Escultura: " + titulo + " de " + autor + " en " + material + " con altura de " + altura + " metros.");
    }
}
