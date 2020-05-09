package paquete;

import Excepciones.DatoInvalido;
import Excepciones.DepositoInvalidoException;
import Excepciones.ExtraccionInvalidaException;

public class CuentaBancaria {

	private double saldo;
	private String titular;
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
		this.saldo= 0;
	}
	
	public void depositar(double monto) throws DepositoInvalidoException {
			if(monto > 0)
				this.saldo += monto;
			else
				throw new DepositoInvalidoException(monto);
	}
	
	public void extraer(double monto) throws ExtraccionInvalidaException{
		if(monto > 0) {
			if(monto<this.saldo)
				this.saldo -= monto;
			else
				throw new ExtraccionInvalidaException(new DatoInvalido(monto, this.saldo));
		}else {
			if((-1*monto)<this.saldo)
				this.saldo += monto;
			else
				throw new ExtraccionInvalidaException(new DatoInvalido(monto, this.saldo));
		}
	}
}
