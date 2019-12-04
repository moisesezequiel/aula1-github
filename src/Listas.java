import java.util.ArrayList;
import java.util.List;


public class Listas {

	public static void main(String[] args) {

		List <String> lista = new ArrayList<>();
		
		lista.add("bob");
		lista.add("moises ");
		lista .add("camila");
		lista.add("marco");
		lista.add(3, "Juarez ");
		
		System.out.println(lista.size());
		
		for (String apelido : lista) {
			System.out.println(apelido);
		}
		
		System.out.println("----------------------------------------");		
		
		//ENCONTRANDO POSICAO 
		
		System.out.println("procurando o indice do bobo" + lista.indexOf("bob"));
	
	} 

}
