package br.com.rdevs.model;

public abstract class Secretaria extends Funcionario{
	@Override
    public double getBonificacao() {
    	return this.salario * 0.10;
    }
}
