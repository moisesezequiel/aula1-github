import java.util.Scanner;

public class EstruturaSwithCase {

	public static void main(String[] args) {

		// crie um programa que descreva qual dia da senana voce está
		// Primeiro exemplo usando If Else

		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE O DIA DA SEMANA QUE VOCE ESTÁ");
		int x = sc.nextInt();
		String dia;

		// resultado da logica usando if else
		// if (x == 1) {
		// dia = "domingo";
		// } else if (x == 2) {
		// dia = "SEGUNDA";
		// }else if (x == 3) {
		// dia= "Terca";
		// }else if(x == 4){
		// dia = "Quarda";
		// }else if (x == 5){
		// dia = "quinta";
		// }else if (x == 6){
		// dia = "Sexta";
		// }else if (x == 7){
		// dia = "sabado";
		// }else {
		// dia = "Dia Invalido";
		// }
		switch (x) {
		case 1:
			dia = "domingo ";
			break;
		case 2:
			dia = "Segunda ";
			break;
		case 3:
			dia = "Terca ";
			break;
		case 4:
			dia = "Quarta ";
			break;
		case 5:
			dia = "Quinta ";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado ";
			break;

		default:
			dia = "invalido";
			break;
		}

		System.out.println("Dia da semana Escolhido foi " + dia);
		sc.close();
	}
}
