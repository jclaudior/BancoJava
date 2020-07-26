package br.com.rdevs.main;

import br.com.rdevs.model.Diretor;

public class TesteDiretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diretor diretor = new Diretor();
		
		diretor.setSalario(20000);
		System.out.println(diretor.getBonificacao());
	}

}
