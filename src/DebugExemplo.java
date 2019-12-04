import java.util.Locale;
import java.util.Scanner;


//aplica o break pont e executa a linha pulando pra proxima com f6

public class DebugExemplo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a  largura");
		double largura = sc.nextDouble();
		
		System.out.println("DIGITE O COMPRIMENTO");
		double comprimento = sc.nextDouble();
		
		System.out.println("digite o metro quadrado ");
		double metroQuadrado = sc.nextDouble();
		
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area  = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();
		
		
	}

}
