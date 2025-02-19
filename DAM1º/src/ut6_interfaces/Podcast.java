package ut6_interfaces;

public class Podcast implements Reproducible {
	
	@Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast");
    }
	
	@Override
    public void pausar() {
        System.out.println("Pausando podcast");
    }
	
	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.PODCAST;
   }
	

}
