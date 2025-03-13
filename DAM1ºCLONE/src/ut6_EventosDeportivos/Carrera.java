package ut6_EventosDeportivos;

import java.time.LocalDate;

public class Carrera extends EventoDeportivo<Participante> {
    private double distancia;

    public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public Participante obtenerGanador() {
        Participante ganador = null;
        double mejorTiempo = Double.MAX_VALUE;

        for (Participante participante : getParticipantes()) {
            if (participante.getTiempo() < mejorTiempo) {
                mejorTiempo = participante.getTiempo();
                ganador = participante;
            }
        }
        return ganador; // Retorna el ganador como Participante
    }
    
   
    
    
}