package exercicio1.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exercicio1.enuns.NivelDeTrabalho;

public class Trabalhador {

	private String nome;
	private NivelDeTrabalho nivel;
	private Double baseSalarial;
	
	private Departamento departamento;
	//lista de contratos que o trabalhador possui iniciando ela vazia 
	private List<ContratosPorHoras> contratos = new ArrayList<ContratosPorHoras>();
	
	
	public Trabalhador(){
		
	}


	public Trabalhador(String nome, NivelDeTrabalho nivel, Double baseSalarial,
			Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public NivelDeTrabalho getNivel() {
		return nivel;
	}


	public void setNivel(NivelDeTrabalho nivel) {
		this.nivel = nivel;
	}


	public Double getBaseSalarial() {
		return baseSalarial;
	}


	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<ContratosPorHoras> getContratos() {
		return contratos;
	}
	
	//metodo que recebe um contrato como argumento e assicia esse contrato com o a lista de contratos do trabalhador
	public void addContratos (ContratosPorHoras contrato){
		contratos.add(contrato);
	}
	//metodo que recebe um contrato como argumento e remove esse contrato da lista de contratos do trabalhador
	public void removerContrato(ContratosPorHoras contrato){
		contratos.remove(contrato);
	}
	
	//metodo de calcular quanto o trabalhador ganhou em um determinado mes 
	//o salario desse trabalhador é o salario base dele mais o valor dos contratos que ele possiu em um determinado mes
	
	public double income (int ano , int mes){

		double soma = baseSalarial;
		Calendar cal = Calendar.getInstance();
		
		for ( ContratosPorHoras  c : contratos) {
			
			cal.setTime(c.getData());
			
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1+ cal.get(Calendar.MONTH);
			
			if (ano == c_ano && mes == c_mes) {
				
				soma = soma + c.valorTotal();
				
			}
		
		}
		return soma;
		
	}
}
