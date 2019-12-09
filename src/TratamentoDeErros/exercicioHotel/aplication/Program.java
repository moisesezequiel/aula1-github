package TratamentoDeErros.exercicioHotel.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import TratamentoDeErros.exercicioHotel.entities.Reserva;
import TratamentoDeErros.exercicioHotel.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try{
				System.out.print("ENTRE COM O NUMERO DO QUARTO");
				int numero = sc.nextInt();
			
				System.out.println("EFETUOU CHECK IN NO DIA (dd/MM/yyyy) : ");
				Date checkIn = sdf.parse(sc.next());
			
				System.out.print("EFETUOU O CHECK OUT NO DIA (dd/MM/yyyy) : ");
				Date checkOut = sdf.parse(sc.next());
			
				Reserva reserva = new Reserva(numero, checkIn, checkOut);
				System.out.println("Reserva  :" + reserva);
				
				System.out.println();
				System.out.println("ENTRE COM OS DADOS ATUALIZADOS DA RESERVA ");
			
				System.out.println("EFETUOU CHECK IN NO DIA (dd/MM/yyyy) : ");
				checkIn = sdf.parse(sc.next());
			
				System.out.print("EFETUOU O CHECK OUT NO DIA (dd/MM/yyyy) : ");
				checkOut = sdf.parse(sc.next());
			
				reserva.atualizarDatas(checkIn, checkOut);
					System.out.println("Reserva  :" + reserva);
					
		}	
		catch (ParseException e ){
		System.out.println("FORMATO INVALIDO DE DATA");
			
		}catch (DomainException e) {
			System.out.println("error na reserva  " + e.getMessage() );
		} catch (RuntimeException e) {
			System.out.println("ERRO INESPERADO");
		}
		

		sc.close();
	}

}
