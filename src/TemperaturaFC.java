import java.util.Locale;
import java.util.Scanner;

public class TemperaturaFC {

	public static void main(String[] args) {

		// fazer um programa que ler a temperatura em Celsius e mostrar o
		// equivalente em Fareheirt, e perguntar se o usuario deseja repetir s
		// ou nao

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.println("DIGITE O VALOR  DA TEMPERATURA EM CELCIUS : ");

			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;

			System.out.printf("Equivalente a Fahrenheit: %.1f%n", f);
			System.out.println("deseja Continuar (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}