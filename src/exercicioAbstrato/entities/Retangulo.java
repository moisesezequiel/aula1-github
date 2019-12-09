package exercicioAbstrato.entities;

import exercicioAbstrato.enuns.Cores;

public class Retangulo extends Area {

	private Double largura ;
	private Double altura;
	
	public  Retangulo() {
		super ();
	}
	
	public Retangulo(Cores cores, double largura, double altura) {
		super(cores);
		this.largura = largura;
		this.altura = altura;
	}


	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}

}
