package herancasContas.entities;

public class ContaPoupanca  extends Conta {

	private Double taxaDeJuros;
	
	public ContaPoupanca (){
		super();
	}

	public ContaPoupanca(Integer numero, String nome, Double saldo,
			Double taxaDeJuros) {
		super(numero, nome, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	//atualiza o saldo da conta vezes a taxa de juros
	public void atualizarSaldo(){
		saldo += saldo * taxaDeJuros;
	}
	@Override
	public void saque (double valor){
		saldo -= valor;
	}
}
