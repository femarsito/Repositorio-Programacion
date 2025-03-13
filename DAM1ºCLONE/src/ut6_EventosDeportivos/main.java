package ut6_EventosDeportivos;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        try {
            // Crear participantes
            Participante p1 = new Participante("Juan", "Pérez", 20);
            Participante p2 = new Participante("Ana", "Gómez", 22);
            Participante p3 = new Participante("Luis", "Martínez", 15);
            Participante p4 = new Participante("María", "López", 16);

            // Crear una carrera
            Carrera carrera = new Carrera("Maratón", LocalDate.of(2025, 03, 13), "Parque Central", 42.195);
            carrera.inscribirParticipante(p1);
            carrera.inscribirParticipante(p2);
            carrera.inscribirParticipante(p3);
            carrera.inscribirParticipante(p4); 

            // Asignar tiempos a participantes
            p1.setTiempo(120); 
            p2.setTiempo(130); 
            p3.setTiempo(140); 
            p4.setTiempo(150); // Asignar tiempo que sea válido a María

            // Mostrar información de la carrera
            System.out.println("Información de la Carrera:");
            System.out.println("Carrera: " + carrera.getNombre() + ", Fecha: " + carrera.getFecha() +
                               ", Lugar: " + carrera.getLugar() + ", Distancia: " + carrera.getDistancia() + " km");
            System.out.println("Participantes:");
            for (Participante participante : carrera.getParticipantes()) {
                System.out.println(" - " + participante);
            }
            System.out.println("Ganador: " + carrera.obtenerGanador());

            TorneoDeFutbol torneo = new TorneoDeFutbol("Torneo de Verano", LocalDate.of(2023, 11, 20), "Estadio Nacional");
            Equipo equipo1 = new Equipo("Equipo A");
            Equipo equipo2 = new Equipo("Equipo B");

            equipo1.añadirJugador(p1);
            equipo1.añadirJugador(p2);
            equipo2.añadirJugador(p3);
            equipo2.añadirJugador(p4);

            torneo.inscribirEquipo(equipo1);
            torneo.inscribirEquipo(equipo2);

            equipo1.setPuntos(10);
            equipo2.setPuntos(15);

            System.out.println();
            System.out.println("Información del Torneo de Fútbol:");
            System.out.println("Torneo: " + torneo.getNombre() + ", Fecha: " + torneo.getFecha() +
                               ", Lugar: " + torneo.getLugar());
            System.out.println("Equipos:");
            for (Equipo equipo : torneo.getEquipos()) {
                System.out.println(" - " + equipo);
            }
            System.out.println("Ganador: " + torneo.obtenerGanador());
            System.out.println();

            // Eliminar un jugador
            System.out.println("Intentando eliminar a Juan Pérez del Equipo A:");
            equipo1.eliminarJugador(p1);
            System.out.println("Después de eliminar a Juan Pérez del Equipo A:");
            System.out.println(equipo1);

            // Intentar eliminar un jugador que no existe
            System.out.println();
            System.out.println("Intentando eliminar a Juan Pérez nuevamente:");
            equipo1.eliminarJugador(p1); // Lanzará excepción

        } catch (ParticipanteNoValidoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (JugadorNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}