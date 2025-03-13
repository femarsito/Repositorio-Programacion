package ut6_EventosDeportivos;

public class Participante {
    private String nombre;
    private String apellido;
    private int edad;
    private double tiempo; // Tiempo en segundos

    public Participante(String nombre, String apellido, int edad) throws ParticipanteNoValidoException {
        if (nombre == null || apellido == null || edad < 14) {
            throw new ParticipanteNoValidoException("Participante no válido");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tiempo = Double.MAX_VALUE; // Inicializar tiempo a un valor alto
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", Edad: " + edad + ", Tiempo: " + tiempo + " segundos";
    }
}