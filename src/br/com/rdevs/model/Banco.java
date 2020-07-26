package br.com.rdevs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	List<Conta> contas; 
	Map<String, Conta> contasMapeadas;
	
	public Banco(){
		contas = new ArrayList<Conta>();
		contasMapeadas = new HashMap();
	}
	
	public void adicionar(Conta conta) {
		this.contas.add(conta);
		this.contasMapeadas.put(conta.getTitular(), conta);
	}
	
	public Conta pega(int index) {
		return this.contas.get(index);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorTitular(String nome) {
		return this.contasMapeadas.get(nome);
	}
}
