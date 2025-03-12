package ut5_POO_Proyect_Profesor;
import java.util.ArrayList;
public class Profesor {
	
private String nombre;
private ArrayList<Curso> listaCurso ;

public Profesor (String nombre, ArrayList<Curso> ListaCursos) {
	this.nombre = nombre;
	ArrayList<Curso> listaCurso = new ArrayList<Curso>();
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public ArrayList<Curso> getCurso() {
	return listaCurso;
}

public void setCurso(ArrayList<Curso> curso) {
	this.listaCurso = curso;
}


}
