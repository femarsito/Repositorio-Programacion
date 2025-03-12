package retojueves;

/**
 * Clase que representa un artista con su información básica.
 */
public class Artista {
    private String nombre;
    private String lugarNacimiento;
    private int anoNacimiento;
    private Integer anoFallecimiento;

    public Artista(String nombre, String lugarNacimiento, int anoNacimiento, Integer anoFallecimiento) {
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.anoFallecimiento = anoFallecimiento;
    }

    public String getNombre() { return nombre; }
    public String getLugarNacimiento() { return lugarNacimiento; }
    public int getAnoNacimiento() { return anoNacimiento; }
    public Integer getAnoFallecimiento() { return anoFallecimiento; }

    @Override
    public String toString() {
        return nombre + " (" + anoNacimiento + " - " + (anoFallecimiento != null ? anoFallecimiento : "Vivo") + ")";
    }
}
