import java.util.Iterator;
import java.util.Scanner;


public class TesteFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite quantas vezes o laco sera repetido");
		int n = sc.nextInt();
		int soma =0;
		
		for (int i = 0; i <n ; i++) {
			
			System.out.println("digite o proximo numero ");
			int x = sc.nextInt();
			soma = soma + x ;
			
		}
		
		System.out.println("o total de soma de todos os numeroas "+soma );
		sc.close();
	}

}
