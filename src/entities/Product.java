package entities;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Product(String nome , double preco , int quantidade){
		this.nome= nome;
		this.preco = preco;
		this.quantidade= quantidade;
	}
	
	public Product(String nome , double preco ){
		this.nome= nome;
		this.preco = preco;
	}
	public double totalEmEstoque(){
		return preco* quantidade;
	}
	
	//adiciona a quantidade do parametro com a quantidade da classe;
	public void addProdutos(int quantidade){
		this.quantidade+= quantidade;
	}
	//remove a quantidade do parametro com a quantidade da classe
	public void removerProdutos(int quantidade){
		this.quantidade -= quantidade;
	}
	
	public String toString(){
		return nome
				+", $"
				+String.format("%.2f", preco)
				+" ,"
				+quantidade
				+" unidades , total: $"
				+String.format("%.2f", totalEmEstoque());
	}
}
  