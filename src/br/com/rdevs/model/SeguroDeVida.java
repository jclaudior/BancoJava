package br.com.rdevs.model;

public class SeguroDeVida implements Tributavel{
	private final double taxa = 42;
	private int numeroApolice;
	private String titular;
	private double valor;

	
	
	public SeguroDeVida() {
	
	}



	public SeguroDeVida(int numeroApolice, String titular, double valor) {
		this.numeroApolice = numeroApolice;
		this.titular = titular;
		this.valor = valor;
	}



	public int getNumeroApolice() {
		return numeroApolice;
	}



	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public double getTaxa() {
		return taxa;
	}



	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return (this.valor * 0.02)+this.taxa;
	}
	
}
