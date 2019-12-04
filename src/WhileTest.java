import java.util.Scanner;


public class WhileTest {

	public static void main(String[] args) {
		// criar um programa que some todos os numeros que foram pedidos e os some depois que o 0 for digitado
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero a ser somado");
		
		int x = sc.nextInt();	
		int soma = 0;
		
		while (x!=0) {
			
			
			soma = soma +x;
			
			x= sc.nextInt();
			
		}
		System.out.println("o total da soma de todos os numeoros é " + soma);
		
		sc.close();
	}

}
