package ut6_interfaces;

public class Musica implements Reproducible {

	@Override
    public void reproducir() {
        System.out.println("Reproduciendo cancion");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando cancion");
    }

    @Override
    public TipoContenido obtenerTipoContenido() {
        return TipoContenido.MUSICA;
    }
}
