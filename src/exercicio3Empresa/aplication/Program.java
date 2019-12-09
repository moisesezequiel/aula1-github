package exercicio3Empresa.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio3Empresa.entities.Funcionario;
import exercicio3Empresa.entities.FuncionarioTercerizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		System.out.print(" ENTRE COM OS NUMEROS DE FUNCIONARIOS DA EMPRESA");
		int n = sc.nextInt();
	
		for ( int i=1 ; i<=n ;i++){ 
			System.out.println("FUNCIONARIO # " + i + "REGISTRADO ");
			System.out.print("ESSE FUNCIONARIO É TERCEIRIZADO ? (S/N)");
			char ch = sc.next().charAt(0);
			System.out.print("NOME DO FUNCIONARIO : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("HORAS TRABALHADAS :");
			int horas = sc.nextInt();
			System.out.println("VALOR POR HORAS : ");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.println("VALOR ADICIONAL ");
				double adicional = sc.nextDouble();
				lista.add(new FuncionarioTercerizado(nome, horas, valorPorHora, adicional));
			}
			else {
				lista.add( new Funcionario(nome, horas, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("LISTA DE PAGAMENTO ");
		for (Funcionario fun : lista) {
			System.out.println(fun.getName() + " - $ " + String.format("%.2f",fun.pagamento()));
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
