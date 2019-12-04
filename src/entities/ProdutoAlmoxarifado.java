package entities;

public class ProdutoAlmoxarifado {

	private String name;
	private double preco;
	
	public ProdutoAlmoxarifado(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
