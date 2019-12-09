package exercicioAbstrato.entities;

import exercicioAbstrato.enuns.Cores;

public class Circulo extends Area {

	private Double raio;


	public Circulo() {
		super();
	}


	public Circulo(Cores cores, Double raio) {
		super(cores);
		this.raio = raio;
	}


	public Double getRaio() {
		return raio;
	}


	public void setRaio(Double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}
