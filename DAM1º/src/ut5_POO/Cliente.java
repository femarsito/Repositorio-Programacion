package ut5_POO;

import java.util.*;

public class Cliente {
private String nombre;
private String apellidos;
private String direccion;
private String localidad;
private Date fnacimiento;

public Cliente(String nombre, String apellido, String direccion, String localidad, Date fnacimiento) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.direccion = direccion;
	this.localidad = localidad;
	this.fnacimiento = fnacimiento;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellidos;
}

public void setApellido(String apellido) {
	this.apellidos= apellido;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getLocalidad() {
	return localidad;
}

public void setLocalidad(String localidad) {
	this.localidad = localidad;
}

public Date getFnacimiento() {
	return fnacimiento;
}

public void setFnacimiento(Date fnacimiento) {
	this.fnacimiento = fnacimiento;
}

public String nombreCompleto() {
	return nombre + " " + apellidos;
}

public String direccionCompleta() {
	return direccion + ", " + localidad;
}

}
