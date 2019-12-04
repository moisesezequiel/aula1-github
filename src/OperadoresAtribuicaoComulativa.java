import java.util.Locale;
import java.util.Scanner;



public class OperadoresAtribuicaoComulativa {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		System.out.println("DIGITE QUANTOS MINUTOS VOCE CONSUMIU NA SUA FRANQUIA ");
		int minutos = sc.nextInt();
		
		
		double conta= 50.0;
		if (minutos> 100) {
			conta += (minutos- 100)* 2.0;
			
		} 
		System.out.printf("O  Valor total a ser pago é %.2f%n", conta );
		
		sc.close();
	}

}
