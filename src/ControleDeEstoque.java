import java.util.Locale;
import java.util.Scanner;

import entities.Product;



public class ControleDeEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("ENTRE COM OS DADOS DO PRODUTO");
		System.out.print ("NOME ");
	
		String nome = sc.nextLine();
		
		System.out.print("PRECO");
		
		double preco = sc.nextDouble();
		
		System.out.print("QUANTIDADE EM NO ESTOQUE");
		
		int quantidade = sc.nextInt();
		
		Product produto = new Product(nome, preco, quantidade);
		
		System.out.println("Dados do produto " +produto);
		
		
		System.out.println("ADICIONANDO  MAIS UNIDADES DO PRODUTO NO ESTOQUE ");
		
		quantidade= sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		
		System.out.println("dados atualizados"+produto);
		
		
		System.out.println();
		
		
		System.out.println("REMOVENDO UNDADES DO PRODUTO NO ESTOQUE ");
		
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
	System.out.println();
		
	
	System.out.println("dados atualizados "+ produto);
		
		
		
		sc.close();
	}

}
