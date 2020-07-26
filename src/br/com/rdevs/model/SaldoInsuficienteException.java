package br.com.rdevs.model;

public class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}

}
