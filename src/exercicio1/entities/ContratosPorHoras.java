package exercicio1.entities;

import java.util.Date;

public class ContratosPorHoras {

	private Date data;
	private Double valorPorHoras;	
	private Integer horas;
	
	public ContratosPorHoras(){
		
	}

	public ContratosPorHoras(Date data, Double valorPorHoras, Integer horas) {
		this.data = data;
		this.valorPorHoras = valorPorHoras;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHoras() {
		return valorPorHoras;
	}

	public void setValorPorHoras(Double valorPorHoras) {
		this.valorPorHoras = valorPorHoras;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public double valorTotal(){
		return valorPorHoras * horas;
	}
}
