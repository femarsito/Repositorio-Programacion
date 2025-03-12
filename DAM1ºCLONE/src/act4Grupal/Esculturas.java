package act4Grupal;

public class Esculturas extends Obra {

	private String material;
	private float altura;
	
	
	public Esculturas(String titulo, int numInventario, String autor, int anio, String material, float altura) {
		super(titulo, numInventario, autor, anio);
		this.material = material;
		this.altura = altura;
	}

	public Esculturas(String titulo, int numInventario, String autor, int anio) {
		super(titulo, numInventario, autor, anio);
		
	}
	
    public String getMaterial() {
        return material;
    }
    
    public float getAltura() {
        return altura;
    }

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Esculturas [material=" + material + ", altura=" + altura + "]";
	}
    
	public double superficie() {
		return 0;
	}
}
