package br.com.rdevs.model;

public class ContaPoupanca extends Conta{ 
	
	
	
	public ContaPoupanca(String titular, int numero, String agencia, String dtaAbertura) {
		super(titular, numero, agencia, dtaAbertura);
		// TODO Auto-generated constructor stub
	}
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String titular) {
		super();
		this.setTitular(titular);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Poupança";
	}   
	
	public double calcularRendimento(){
        return this.getSaldo() * 0.1; 
    }

}
