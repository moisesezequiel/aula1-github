package TratamentoDeErros.exercicioHotel.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(){
		
	}

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	//PEGO A DIFERENCA DAS DATAS EM MILI-SENGUNDOS
	public long duracao(){
		long diferenca = (long) checkOut.getTime() - checkIn.getTime();
		
		//RETORNA O VALOR DE MILI-SEGUNDOS CONVERTIDO EM DIAS
		 return TimeUnit.DAYS.convert(diferenca, TimeUnit.MICROSECONDS);
	}
	public String atualizarDatas(Date checkIn, Date checkOut){
		Date agora = new Date();
		if (checkIn .before(agora) || checkOut.before(agora)) {
			return "ERRO NA RESERVA  A DATA DA RESERVA DEVE SER COM DATAS FUTURAS ";
			
		}if (!checkOut.after(checkIn)) {
			return "A DATA DE CHECK OUT DEVE SER DEPOIS DA DATA DE CHECK IN ";
		}
				
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}
	
	@Override
	public String toString(){
		return " QUARTO " + numeroQuarto 
				+ " CheckIn efetuado : "+ sdf.format(checkIn)
				+ " CheckOut Efetuado : "+ sdf.format(checkOut)
				+" , "
				+duracao() + " NOITES TOTAIS ";
		
	}
}
