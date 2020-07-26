package br.com.rdevs.main;

import br.com.rdevs.model.Banco;
import br.com.rdevs.model.Conta;
import br.com.rdevs.model.ContaCorrente;
import br.com.rdevs.model.ContaPoupanca;

public class TestaBanco {
	public static void main(String[]args) {
		Banco banco = new Banco();
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setTitular("joao");
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setTitular("Maria");
		
		banco.adicionar(contaCorrente);
		banco.adicionar(contaPoupanca);
		
		Conta contaPega1 = banco.pega(0);
		System.out.println(contaPega1.recuperarDadosParaImpressao());
		
		System.out.println("Quantidade de contas no Banco: "+banco.pegaQuantidadeDeContas());
		
		Conta contaPega2 = banco.buscaPorTitular("Maria");
		System.out.println(contaPega2.recuperarDadosParaImpressao());
	}
}
