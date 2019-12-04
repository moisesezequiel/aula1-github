import java.util.Scanner;


public class CalculaMaior {

	public static void main(String[] args) {
		//associando metodos mesmo nao tendo o mesmo nome de parametros eles mesmo sao as mesma coisa

		Scanner sc = new Scanner(System.in);
		
	System.out.println("informe 3 numeros e veremos qual dele e o maior");
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		
		//metodo chamando o max logo abaixo msm nao tendo o mesmo nome de parametros os 2 sao a mesma coisa
		int maior = max(a,b,c);
		
		resultado(maior);
	}

	public static int max(int numero1 , int numero2 , int numero3){
		int variavelLocal;
		
		if (numero1 > numero2 && numero1> numero3) {
			variavelLocal = numero1;
			
		} 
		else if (numero2> numero3){
			variavelLocal= numero2;
		}
		else {
			variavelLocal= numero3;
		}
		return variavelLocal;
	}
	// metodo usado para escrever na tela o maior numero e sendo declarado na linha 21 
	public static void resultado (int valor) {
		System.out.println("o resultado do scanner dos 3 numeros é " + valor);
	}
}