package br.com.rdevs.main;

import java.util.HashMap;
import java.util.Map;

import br.com.rdevs.model.Conta;
import br.com.rdevs.model.ContaCorrente;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
			c1.depositar(10000);
		Conta c2 = new ContaCorrente();
			c2.depositar(3000);
		
		Map<String, Conta> mapaDeContas = new HashMap();
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
			
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}

}
