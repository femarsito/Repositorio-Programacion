package ut6_EventosDeportivos;

import java.util.ArrayList;
import java.time.LocalDate;

public class TorneoDeFutbol extends EventoDeportivo<Equipo> {
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void inscribirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    @Override
    public Equipo obtenerGanador() {
        Equipo ganador = null;
        int maxPuntos = -1;

        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() > maxPuntos) {
                maxPuntos = equipo.getPuntos();
                ganador = equipo;
            }
        }
        return ganador; // Retorna el equipo ganador
    }
   
}