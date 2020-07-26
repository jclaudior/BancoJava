package br.com.rdevs.contas;

import br.com.rdevs.model.ContaCorrente;
import br.com.rdevs.model.SeguroDeVida;

public interface Imposto {
	double calculaImpostos(ContaCorrente contaCorrente);
	double calculaImpostos(ContaCorrente contaCorrente, SeguroDeVida seguroDeVida);
}
