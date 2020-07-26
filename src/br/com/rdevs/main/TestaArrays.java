package br.com.rdevs.main;

import br.com.rdevs.model.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente contaCorrentes[] = new ContaCorrente[10];
		for(int i = 0; i < 10; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.depositar(i*100);
			contaCorrentes[i] = conta;
		}
		
		double media = 0;
		for(int i = 0; i < 10; i++) {
			media += contaCorrentes[i].getSaldo();
		}
		media /= contaCorrentes.length;
		
		System.out.println(media);

	}

}
