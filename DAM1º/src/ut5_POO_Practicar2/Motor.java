package ut5_POO_Practicar2;

public class Motor {
	private String numBastidor;

	public Motor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	@Override
	public String toString() {
		return "Motor [numBastidor=" + numBastidor + "]";
	}
	
}
