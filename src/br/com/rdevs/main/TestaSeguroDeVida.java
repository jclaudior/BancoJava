package br.com.rdevs.main;

import br.com.rdevs.contas.ManipuladorDeSeguroDeVida;
import br.com.rdevs.model.SeguroDeVida;

public class TestaSeguroDeVida {

	public static void main(String[] args) {
		
		ManipuladorDeSeguroDeVida manipuladorSeguro = new ManipuladorDeSeguroDeVida();
		
		SeguroDeVida seguroDeVida = manipuladorSeguro.criaSeguro(1234, "Joao Claudio", 200);
		
		System.out.println(seguroDeVida.getNumeroApolice());
		System.out.println(seguroDeVida.getTitular());
		System.out.println(seguroDeVida.getValor());
		
	}

}
