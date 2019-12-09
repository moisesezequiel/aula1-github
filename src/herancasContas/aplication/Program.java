package herancasContas.aplication;

import herancasContas.entities.Conta;
import herancasContas.entities.ContaEmpresarial;
import herancasContas.entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {

		//Conta acc = new Conta(001, "Moisés", 100.0);
		ContaEmpresarial C1 = new ContaEmpresarial(002, "Camila", 60.0, 1.000);

		// UPCASTING (Atribuindo uma subclasse a uma classe Mae)

	//	Conta c1 = acc;
		Conta acc2 = new ContaEmpresarial(003, "Ronaldo", 50.0, 800.00);
		Conta acc3 = new ContaPoupanca(004, "Israel", 300.00, 0.15);

		// DONWCASTING (força um objeto da SuperClasse se transformar em um
		// objeto da subClasse

		ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
		acc4.emprestimo(200.0);

		if (acc3 instanceof ContaEmpresarial) {
			ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
			acc5.deposito(200.0);
			System.out.println("DEPOSITO");
		}
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.atualizarSaldo();
			System.out.println("CONTA POUPANÇA");

		}
		//CONTA CRIADA SACANDO O VALOR + 5.O DO SALDO TOTAL
		
	//	Conta conta = new Conta(121, "moises", 1000.0);
//		conta.saque(200.0);
//		System.out.println(conta.getSaldo());
		
	   // OUTRA CONTA USANDO O MESMO METODO DE SACAR SOBRESCRITO E NAO DESCONTANDO 5 REAIS DO VALOR TOTAL
		
       Conta contaPoup = new ContaPoupanca(12, "Camila", 1000.0, 0.01);
       contaPoup.saque(200.0);
       System.out.println(contaPoup.getSaldo());
       
       //MESMO METODO DE SAQUE MAIS ACUMUDANDO +5 NO SAQUE PELA LOGICA DA SUPERCLASSE
       
       Conta contEmpresarial = new ContaEmpresarial(12, "Israel", 1000.0, 5000.0);
       contEmpresarial.saque(200.0);
       System.out.println(contEmpresarial.getSaldo());
	}
	// QUANDO A CLASSE E ABSTRATA ELA NAO PODE SER INSTANCIADA 
	//APENAS AS SUBCLASSES DELA
	
//	Conta acc1 = new Conta(1254, "alex", 1000.0);
	
	Conta aac2 = new ContaPoupanca(588, "maria", 1000.0, 0.01);
	Conta aac3 = new ContaEmpresarial(99890, "Bob", 1000.0, 500.0);
}
