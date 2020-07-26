package br.com.rdevs.model;

public abstract class Conta implements Comparable<Conta> {
	private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dtaAbertura;
    protected static int identificador;
	protected int identificadorConta;

    public Conta() {
    	identificador++;
	    this.identificadorConta = identificador;
	}

	public Conta(String titular, int numero, String agencia, String dtaAbertura) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.dtaAbertura = dtaAbertura;
		identificador++;
	    this.identificadorConta = identificador;
	}

	public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getAgencia (){
        return this.agencia;
    }
    

    public double getSaldo(){
        return this.saldo;
    }

    public void setDtaAbertura(String dtaAbertura){
        this.dtaAbertura = dtaAbertura;
    }

    public String getDtaAbertura(){
        return this.dtaAbertura;
    }

    public int getIdentificador() {
    	return this.identificadorConta;
    }

   
    
    public boolean sacar(double valor){
    	try {
    		if(this.saldo < valor) {
    			throw new SaldoInsuficienteException("Saldo insuficiente tente um valor menor!");
    		}else {
    			this.saldo -= valor;
    			return true;
    		}
        } catch(IllegalArgumentException e) {
        	System.out.println("Erro ao sacar! "+ e.getMessage() );
            return false;
        } catch(RuntimeException e) {
        	System.out.println("Erro ao sacar! "+ e.getMessage() );
            return false;
        }
    }

    public boolean depositar(double valor){
        try {
        	 this.saldo += valor;
        	 return true;
        }
        catch(IllegalArgumentException e) {
        	System.out.println("Erro ao depositar! "+ e.getMessage() );
        	return false;
        }    
    }

    
    
   public boolean transferir(double valorTransferencia, Conta conta) {
		if (valorTransferencia <= 0 || this.saldo < valorTransferencia) {
			return false;
		} else {
			this.saldo -= valorTransferencia;
			conta.saldo += valorTransferencia;
			return true;
		}
	}

    public String recuperarDadosParaImpressao(){
        String dados = "Nome Titular: " + this.titular +
        "\nNumero da Conta: "+this.numero+"\nAgencia: "+this.agencia+
        "\nSaldo: "+this.saldo+"\nData abertura: "+this.dtaAbertura;
        return dados;
    }
    
    @Override
    public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

    
    
    public abstract String getTipo();
}
