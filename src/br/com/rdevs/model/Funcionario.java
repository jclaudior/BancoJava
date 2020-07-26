package br.com.rdevs.model;

public abstract class Funcionario {
	protected String nome;
    protected String cpf;
    protected double salario;
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
    
    public abstract double getBonificacao();
}
