package TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratandoTryCatch {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		try{
	
		//ler nomes separados por espaço e adicionando eles no vetor
		String [] vetor = sc.nextLine().split(" ");
		
		//lendo a posicao que foi adicionado o nome 
		int posicao = sc.nextInt();
		System.out.println(vetor [posicao]);
		}
		//trata o erro de posicao no caso se for uma posicao que nao existe
		catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("POSICAO DIGITADA NAO DECLARADA");
		}
		catch (InputMismatchException e) {
			System.out.println("POSICAO DEVE SER PERGUNTADA COM NUMEROS ");

		}
		
		System.out.println("FIM DO PROGRAMA");
		sc.close();
	}

}
