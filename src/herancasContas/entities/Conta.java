package herancasContas.entities;

public abstract class Conta {

	private Integer numero;
	private String nome ;
	protected Double saldo;
	
	public Conta(){
		
	}

	public Conta(Integer numero, String nome, Double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}
	// cria o metodo de deposito/ saque para administrar o saldo , as classes SET sao deletadas 
	public void deposito (double valor){
		saldo += valor;
	}
	
	public void saque (double valor){
		saldo -= valor +5.0	;
	}
}
