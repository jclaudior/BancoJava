package br.com.rdevs.model;

public class Diretor extends Funcionario{
	private int numeroDeFuncionariosGerenciados;
    private String login;
    private int senha;

    public Diretor(){

    }

    public void setNumeroDeFuncionarioGerenciados(int numero){
        this.numeroDeFuncionariosGerenciados = numero;
    }

    public int getNumeroDeFuncionarioGerenciados(){
        return this.numeroDeFuncionariosGerenciados;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(String login, int senha){
        if(senha == this.senha && login.equals(this.login)){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public double getBonificacao() {
    	return this.salario * 0.15;
    }
}
