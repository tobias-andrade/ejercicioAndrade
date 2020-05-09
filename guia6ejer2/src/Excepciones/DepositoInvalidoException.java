package Excepciones;

public class DepositoInvalidoException extends Exception {

	private double cantidadInvalida;

	public DepositoInvalidoException(double monto) {
		super();
		this.cantidadInvalida = monto;
	}

	public double getMonto() {
		return this.cantidadInvalida;
	}
	
	
}
