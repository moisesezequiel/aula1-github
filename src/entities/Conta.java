package entities;

public class Conta {
	
	private int id;
	private String Titular ;
	private  double saldo ;
	
	
	
	
	public Conta(int id, String titular, double depositoInicial) {
		this.id = id;
		Titular = titular;
		depositar(depositoInicial);
	}
	 
	public Conta(int id, String titular) {
		this.id = id;
		Titular = titular;
	}


	public int getId() {
		return id;
	}
	
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor){
		saldo += valor;
	}
	public void sacar(double valor ){
		saldo -= valor + 5.0;
	}
	
	public String toString(){
		return "Conta "
				+ id
				+",titular: "
				+Titular
				+" , Saldo : $ "
				+String.format("%.2f", saldo);
				
	}

}
