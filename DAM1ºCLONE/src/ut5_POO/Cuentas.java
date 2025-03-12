package ut5_POO;

public class Cuentas {
private long numero;
private float saldo, interesAnual;
private Cliente cliente;

public Cuentas(long numero, float saldo, float interesAnual, Cliente cliente) {
	this.numero = numero;
	this.saldo = saldo;
	this.interesAnual = interesAnual;
	this.cliente = cliente;
}

public long getNumero () {
	return numero;
}

public void setNumero (long numero) {
	this.numero=numero;
}

public float getSaldo () {
	return saldo;
}

public void setSaldo (float saldo) {
	this.saldo=saldo;
}

public void setInteresAnual(float interesAnual) {
	this.interesAnual=interesAnual;	
}

public float getInteresAnual () {
	return interesAnual;
		}

public void ingreso(int cantidad) {
	saldo += cantidad;
}

public Cliente leerTitular() {
	return this.cliente;
}

public boolean enRojos() {
	if(saldo<0) {
		return true;
	}else {
		return false;
	}
}

public void mostrarCuenta() {
	System.out.println("El número de esta cuenta es: "+ numero+ " tiene "+saldo+" euros, con un interés del "+ interesAnual+ "%. Además esta cuenta pertenece a "+ cliente.nombreCompleto());
}

}
