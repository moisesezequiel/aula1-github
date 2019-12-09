package TratamentoDeErros.exercicioHotel.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import TratamentoDeErros.exercicioHotel.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("ENTRE COM O NUMERO DO QUARTO");
		int numero = sc.nextInt();

		System.out.println("EFETUOU CHECK IN NO DIA (dd/MM/yyyy) : ");
		Date checkIn = sdf.parse(sc.next());

		System.out.print("EFETUOU O CHECK OUT NO DIA (dd/MM/yyyy) : ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out
					.println("A DATA DE CHECK OUT DEVE SER DEPOIS DA DATA DE CHECK IN ");
		} else {
			Reserva reserva = new Reserva(numero, checkIn, checkOut);

			System.out.println("Reserva  :" + reserva);
			System.out.println();
			System.out.println("ENTRE COM OS DADOS ATUALIZADOS DA RESERVA ");

			System.out.println("EFETUOU CHECK IN NO DIA (dd/MM/yyyy) : ");
			checkIn = sdf.parse(sc.next());

			System.out.print("EFETUOU O CHECK OUT NO DIA (dd/MM/yyyy) : ");
			checkOut = sdf.parse(sc.next());

			String error = reserva.atualizarDatas(checkIn, checkOut);

			if (error != null) {
				System.out.println("ERROR NA RESERVA " + error);
			} else {
				System.out.println("Reserva  :" + reserva);
			}

		}

		sc.close();
	}

}
