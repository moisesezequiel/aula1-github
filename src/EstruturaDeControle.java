import java.util.Scanner;


public class EstruturaDeControle {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("QUANTAS HORAS SAO AGORA ??");
	    hora = sc.nextInt();
		
	    if (hora<12) {
			System.out.println("BOOOM DIA CARAIO");
		} else { 
			if (hora >= 12 && hora <= 18) {
				System.out.println("boa tardeeee");
			} else {
				System.out.println("BOA NOITE ZZZZ");
			}

		}
	}

}
