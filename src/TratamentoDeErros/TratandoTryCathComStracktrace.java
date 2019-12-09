package TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratandoTryCathComStracktrace {

	public static void main(String[] args) {

		metodo1();
		System.out.println("FIM DO PROGRAMA");

	}

	public static void metodo1() {
		System.out.println("####### INICIO METODO 1 ######");
		method2();
		System.out.println("####### FIM METODO 1 ######");
	}

	public static void method2() {
		System.out.println("####### INICIO METODO 2 ######");
		Scanner sc = new Scanner(System.in);

		try {

			// ler nomes separados por espaço e adicionando eles no vetor
			String[] vetor = sc.nextLine().split(" ");

			// lendo a posicao que foi adicionado o nome
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		}
		// trata o erro de posicao no caso se for uma posicao que nao existe
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("POSICAO DIGITADA NAO DECLARADA");
			
			//esse metodo ajuda a saber onde esta declarado o erro 
			
			e.printStackTrace();
			sc.next();
			
		} catch (InputMismatchException e) {
			System.out.println("POSICAO DEVE SER PERGUNTADA COM NUMEROS ");

		}
		sc.close();
		System.out.println("####### FIM METODO 2 ######");
	}
}
