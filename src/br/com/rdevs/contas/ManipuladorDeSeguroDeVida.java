package br.com.rdevs.contas;

import br.com.rdevs.model.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {
	private SeguroDeVida seguroDeVida;
	
	
	public  SeguroDeVida criaSeguro (int numeroApolice, String titular, double valor) {
		if(numeroApolice > 0 && titular != "" && valor > 0 ) {
			this.seguroDeVida = new SeguroDeVida(numeroApolice,titular,valor);
			return this.seguroDeVida;
		}else {
			return null;
		}
	}
}
