package br.com.rdevs.main;

import br.com.rdevs.contas.ManipuladorDeTributaveis;
import br.com.rdevs.model.ContaCorrente;
import br.com.rdevs.model.SeguroDeVida;
import br.com.rdevs.model.Tributavel;

public class TesteManipulaImposto {

	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente("Joao");
		corrente.depositar(1000);
		
		SeguroDeVida seguro = new SeguroDeVida();
		seguro.setNumeroApolice(123);
		seguro.setTitular("Joao");
		seguro.setValor(100);
		
		Tributavel tributavel[] = {corrente, seguro};
		ManipuladorDeTributaveis manipulador = new ManipuladorDeTributaveis();
		System.out.println(manipulador.calculaImpostos(tributavel));
	}

}
