package act4Grupal;

public class Artista {
	private String nombre;
	private String lugarNacimiento;
	private String nacimiento;
	private String muerte;
	
	public Artista(String nombre, String lugarNacimiento, String nacimiento, String muerte) {
		this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.nacimiento = nacimiento;
        this.muerte = muerte;
	}
	
	public String getNombre() {
        return nombre;
    }
	
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }
    
    public String getNacimiento() {
        return nacimiento;
    }
    
    public String getMuerte() {
        return muerte;
    }
    
    public String getBiografia() {
        return "Nombre: " + nombre + "\nLugar de Nacimiento: " + lugarNacimiento + "\nNacimiento: " + nacimiento + "\nMuerte: " + muerte;
    }

	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", lugarNacimiento=" + lugarNacimiento + ", nacimiento=" + nacimiento
				+ ", muerte=" + muerte + "]";
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Artista)) return false;
        Artista artista = (Artista) obj;
        return nombre.equals(artista.nombre);
    }
    
}
