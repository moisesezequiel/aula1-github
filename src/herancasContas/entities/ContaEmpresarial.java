package herancasContas.entities;

public class ContaEmpresarial extends Conta {

	
	private Double limiteDeposito;
	
	public ContaEmpresarial() {
		super();
	}

	//inicia o construtor pegando os atributos da classe mae que seria a classe Conta 
	
	public ContaEmpresarial(Integer numero, String nome, Double saldo,
			Double limiteDeposito) {
		super(numero, nome, saldo);
		this.limiteDeposito = limiteDeposito;
	}

	public Double getLimiteDeposito() {
		return limiteDeposito;
	}

	public void setLimiteDeposito(Double limiteDeposito) {
		this.limiteDeposito = limiteDeposito;
	}
	
	// recebe um valor e verifica se esse valor e menor do que o limite de deposito e soma esse
	//valor no saldo da conta , mais esse atributo de saldo tem que ser protected
	
	 public void emprestimo(double valor){
		 if (valor <= limiteDeposito) {
			 saldo += valor -10.0;
		}
	 }
	 
	 //chama o metodo de saque da superclasse (5.0) de desconto
	 @Override
		public void saque (double valor){
		 super.saque(valor);
		 saldo -= 2.0;
		}
}
