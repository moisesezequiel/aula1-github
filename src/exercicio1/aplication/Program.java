package exercicio1.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio1.entities.ContratosPorHoras;
import exercicio1.entities.Departamento;
import exercicio1.entities.Trabalhador;
import exercicio1.enuns.NivelDeTrabalho;

public class Program {

	public static void main(String[] args) throws ParseException {

		//LER OS DADOS de um trabalhador com o N  contratos (N fornecidos pelo usuario ). Depois , Solicitar 
		//do usuario um mes e mostrar qual foi o salario do funcionario nesse mes , conforme exemplo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");	
		
		
		System.out.print("ENTRE COM O NOME DO DEPARTAMENTO :");
		String nomeDepartamento= sc.nextLine();
		
		System.out.println("DADOS DO TRABALHADOR");
		System.out.print("Nome : ");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.print("NIVEL EMPRESARIAL (JUNIOR / PLENO / SENIOR ) ?");
		String nivelTrabalhador = sc.nextLine();
		
		System.out.print("BASE SALARIAL :");
		double baseSalarial = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelDeTrabalho.valueOf(nivelTrabalhador), baseSalarial, new Departamento(nomeDepartamento));
		
		System.out.print("QUANTOS CONTRATOS ESSE TRABALHADOR TEM ? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("ENTROU NO CONTRATO " + i + " na data :");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
	
			
			System.out.print("Valor por hora :");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duracao (horas):");
			int horas = sc.nextInt();
			
			ContratosPorHoras contrato = new ContratosPorHoras(dataContrato, valorPorHora, horas);
			trabalhador.addContratos(contrato);
		}
		
		System.out.println();
		System.out.print("ENTRE COM O MES E ANO PARA CALCULAR O SALARIO");

		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));   
		
		System.out.println("Nome "+ trabalhador.getNome());
		System.out.println("Departamento : "+ trabalhador.getDepartamento().getName());
		System.out.println("Salario referente ao mes "+ mesEAno + ": " + String.format("%.2f",trabalhador.income(ano, mes)));
		sc.close();
	}

}
