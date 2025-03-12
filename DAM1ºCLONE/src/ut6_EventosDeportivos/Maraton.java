package ut6_EventosDeportivos;
import java.time.LocalDate;
import java.util.*;
public class Maraton extends EventoDeportivo{

	public Maraton(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
    }
	@Override
    public Participante obtenerGanador() {
        // TODO Auto-generated method stub
		 ArrayList<Participante> listaParticipantes = getParticipantes();
		    Participante primerParticipante = listaParticipantes.get(0);
		    
		    return primerParticipante;    }
}
