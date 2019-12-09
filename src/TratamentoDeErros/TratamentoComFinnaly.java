package TratamentoDeErros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TratamentoComFinnaly {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
			//O BLOCO FINNALY INDEPENDENTE SE DER CERTO OU ERRADO ELE VAI SER EXECUTADO
		} finally {
			if (sc != null) {
				sc.close();
				
			}
			System.out.println("BLOCO FINNALY EXECUTADO");
		}
	}
}
