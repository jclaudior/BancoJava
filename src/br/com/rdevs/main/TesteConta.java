package br.com.rdevs.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.rdevs.model.Conta;
import br.com.rdevs.model.ContaCorrente;

public class TesteConta {

public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente("João",1234,"22","26/07/2020");
        contaCorrente.depositar(1000);
        
        contaCorrente.sacar(2000);
        contaCorrente.getTipo();
        
        ContaCorrente contaCorrente2 = new ContaCorrente("Maria");
        contaCorrente2.depositar(1000);
        
        List<Conta> contas = new ArrayList<>();
        
        contas.add(contaCorrente2);
        contas.add(contaCorrente);
        contas.sort(null);
        
        System.out.println(contas.get(0).getTitular());
        System.out.println(contaCorrente.recuperarDadosParaImpressao());
        
	}

}
