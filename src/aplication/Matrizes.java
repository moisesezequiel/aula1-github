package aplication;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
//manipulando matrizes
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTRE COM OS DADOS DA MATRIZ");
		
		int n = sc.nextInt();
		int[][] mat = new int [n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				
				mat [i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("main diagonal : ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i] [i] + " ");
		}
		System.out.println();
		
		
		int contarNegativos = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				 if (mat [i] [j] <0) {
					contarNegativos ++;
				}
			}
		}
		System.out.println("numeros negativos " + contarNegativos);
		sc.close();
		
	}

}
