package br.com.rdevs.model;

public class ContaCorrente extends Conta implements Tributavel{
	
	
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String titular, int numero, String agencia, String dtaAbertura) {
		super(titular, numero, agencia, dtaAbertura);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String titular) {
		super();
		this.setTitular(titular);
	}

	@Override
	public boolean sacar(double valor) {
		return super.sacar(valor+0.10)?true:false;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo()*0.01;
	}
	
}
