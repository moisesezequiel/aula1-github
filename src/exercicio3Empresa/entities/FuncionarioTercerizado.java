package exercicio3Empresa.entities;

public class FuncionarioTercerizado extends Funcionario{

	private Double adicionalTerceirazado ;
	
	public FuncionarioTercerizado (){
		super();
	}

	public FuncionarioTercerizado(String name, Integer horas,
			Double valorPorHora, Double adicionalTerceirazado) {
		super(name, horas, valorPorHora);
		this.adicionalTerceirazado = adicionalTerceirazado;
	}

	public Double getAdicionalTerceirazado() {
		return adicionalTerceirazado;
	}

	public void setAdicionalTerceirazado(Double adicionalTerceirazado) {
		this.adicionalTerceirazado = adicionalTerceirazado;
	}
	
	//FUNCIONARIO TERCEIRIZADO GANHA O SALARIO NORMAL MAIS O ADICIONAL *110%
	@Override
	public double pagamento(){
		return super.pagamento()+ adicionalTerceirazado *1.1;
	}
}
