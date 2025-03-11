package ut6_excepCuentaBancaria;

public class CuentaBancaria {
	  private double saldo;

	    public CuentaBancaria() {
	        this.saldo = 0.0;
	    }

	    public void depositar(double cantidad) throws IllegalArgumentException {
	        if (cantidad < 0) {
	            throw new IllegalArgumentException("La cantidad a depositar no puede ser negativa");
	        }
	        saldo += cantidad;
	        System.out.println("Se ha depositado " + cantidad + ". El saldo actual es de: " + saldo);
	    }

	    public void retirar(double cantidad) throws IllegalArgumentException {
	        if (cantidad < 0) {
	            throw new IllegalArgumentException("La cantidad a retirar no puede ser negativa");
	        }
	        if (cantidad > saldo) {
	            throw new IllegalArgumentException("Saldo insuficiente. El saldo actual es de: " + saldo);
	        }
	        saldo -= cantidad;
	        System.out.println("Se ha retirado " + cantidad + ". El saldo actual es de: " + saldo);
	    }

	    public double getSaldo() {
	        return saldo;
	    }
}
