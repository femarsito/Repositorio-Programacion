package ut6_interfaces;

public class Serie implements Reproducible {
	  @Override
	    public void reproducir() {
	        System.out.println("Reproduciendo episodio");
	    }

	    @Override
	    public void pausar() {
	        System.out.println("Pausando episodio");
	    }

	    @Override
	    public TipoContenido obtenerTipoContenido() {
	        return TipoContenido.SERIE;
	    }

	
}
