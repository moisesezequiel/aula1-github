package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoAlmoxarifado;

public class Almoxarifado {
//FAZER UM PROGRAMA PARA LER UM NUMERO INTEIRO N E OS DADOS (NOME E PRECO ) DE N PRODUTOS 
	//ARMAZENE OS N PRODUTOS EM UM VETOR EM SEGUIDA MOSTRAR O PRECO MEDIO DOS PRODUTOS
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a quantidade de itens ");
		int n = sc.nextInt();
		ProdutoAlmoxarifado[] vetor = new ProdutoAlmoxarifado[n];
		
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.println("digite o nome do produto");
			String name = sc.nextLine();
			
			System.out.println("digite o preco do produto");
			double preco = sc.nextDouble();
			vetor[i]= new ProdutoAlmoxarifado(name, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma+= vetor[i].getPreco();
		}
		
		double media = soma/n;
		
		System.out.printf("A MEDIA DO PRECO DOS ITENS É : %.2f%n" , media);
		sc.close();

	}

}
