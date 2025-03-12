package ut5_POO_Proyect_Profesor;

public class Curso {
private String nombre;
private String numero;

public Curso (String nombre, String numero) {
	this.nombre = nombre;
	this.numero = numero;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}


}
