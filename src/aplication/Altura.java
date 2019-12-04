package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
	
//fazer um programa para ler um numero inteiro N e a altura de N pessoas
//Armazene as N alturas em um Vetor. em seguida mostrar a altura media das pessoas 
	
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("informe a quantidade de pessoas");
		int n = sc.nextInt();
		
		double [] vetor = new double [n];
		
		for (int i = 0; i < n; i++) {
			vetor[i]= sc.nextDouble();
		}
		 
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma+= vetor[i];
		}
		double media = soma/n;
		
		System.out.printf("A MEDIA DOS NUMEROS E : %.2f%n" ,media);
		sc.close();
	}

}
