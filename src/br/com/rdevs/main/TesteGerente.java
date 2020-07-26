package br.com.rdevs.main;

import br.com.rdevs.model.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		
		gerente.setSalario(10000);
		System.out.println(gerente.getBonificacao());
	}

}
