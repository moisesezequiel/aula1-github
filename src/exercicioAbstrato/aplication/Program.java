package exercicioAbstrato.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicioAbstrato.entities.Area;
import exercicioAbstrato.entities.Circulo;
import exercicioAbstrato.entities.Retangulo;
import exercicioAbstrato.enuns.Cores;

public class Program {

	public static void main(String[] args) {
		 
		/**
		 * FAZER UM PROGRAMA PARA LER O DADOS DE (N) FIGURAS (N FORNECIDOS PELO USUARIO )
		 * E DEPOIS MOSTRAR AS AREAS DESTAS FIGURAS NA MESMA ORDEM EM QUE FORAM DIGITADAS*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Area> list = new ArrayList<>();
		
		System.out.print("ENTRE COM OS NUMEROS DE AREAS A SEREM CALCULADAS");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("AREA #" +i+ "DADOS");
			System.out.print("RETANGULO OU CIRCULO (r/c)");
			char ch = sc.next().charAt(0);
			System.out.print("QUAL A COR (BLACK /BLUE/RED) :");
			Cores cores = Cores.valueOf(sc.next());
			
			if (ch== 'r') {
				System.out.print("LARGURA : ");
				double width = sc.nextDouble();
				
				System.out.print("ALTURA : ");
				double height = sc.nextDouble();
				
				list.add(new Retangulo(cores, width, height));
				
			} else {
				 System.out.print("RAIO  : ");
				 double radius = sc.nextDouble();
				 list.add(new Circulo(cores, radius));
			}
		}
		System.out.println();
		System.out.println("AREAS TOTAIS");
		
		for (Area area : list) {
			System.out.println(String.format("%.2f",area.area()));
			
		}
		sc.close();
		
	}

}
