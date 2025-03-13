package ut6_EventosDeportivos;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    

    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ArrayList<Participante> getJugadores() {
		return jugadores;
	}



	public void setJugadores(ArrayList<Participante> jugadores) {
		this.jugadores = jugadores;
	}



	public int getPuntos() {
		return puntos;
	}



	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public void añadirJugador(Participante jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Participante jugador) throws JugadorNoEncontradoException {
        if (!jugadores.remove(jugador)) {
            throw new JugadorNoEncontradoException("Jugador no encontrado: " + jugador);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(nombre).append(", Puntos: ").append(puntos).append("\nJugadores:\n");
        for (Participante jugador : jugadores) {
            sb.append(jugador.toString()).append("\n");
        }
        return sb.toString();
    }
}