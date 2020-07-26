package br.com.rdevs.contas;


import br.com.rdevs.model.Tributavel;

public class ManipuladorDeTributaveis{

	public double calculaImpostos(Tributavel tributavels[]) {
		double valor = 0;
		for(int i = 0; i< tributavels.length; i++) {
			valor += tributavels[i].getValorImposto();
		}
		return valor;
	}

	
	

}
