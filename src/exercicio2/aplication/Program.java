package exercicio2.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exercicio2.entities.Comentario;
import exercicio2.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("ESTOU TENDO UMA VIAGEM FODA!");
		Comentario c2 = new Comentario("Wow ISSO E FODA");
		
		Post p1 = new Post(
				sdf.parse("08/01/2019 20:51:44"),
				"VIAJANDO PRA EUROPA ",
				"VOU VISITAR ESSE PAIS",
				12);
		p1.addComentarios(c1);
		p1.addComentarios(c2);
		System.out.println(p1);
	}
}
