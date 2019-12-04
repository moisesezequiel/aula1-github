package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
// ligada com as entities Conta
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("ENTRE COM O NUMERO DA CONTA ");

		int numero = sc.nextInt();

		System.out.print("ENTRE COM O NOME DO USUARIO");

		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("DESEJA FAZER DEPOSITO INICIAL (y/n)");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("QUAL VALOR DO DEPOSITO");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}

		System.out.println();

		System.out.println("DADOS DA CONTA ");
		System.out.println(conta);

		System.out.println();
		System.out.print("entre com o valor de deposito");

		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		
		System.out.println("Conta atualizada ");
		System.out.println(conta);


		System.out.println();
		System.out.print("entre com o valor de Saque");

		double ValorSaque = sc.nextDouble();
		conta.sacar(ValorSaque);
		
		System.out.println("SAQUE REALIZADO COM SUCESSO");
		System.out.println("Conta atualizada ");
		System.out.println(conta);
	

		sc.close();
	}
}
