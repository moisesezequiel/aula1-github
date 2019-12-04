	import java.util.Locale;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import entities.Triangulo;


public class CalculaAreaTrianguloPOO {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		Triangulo t ,z ;
		t = new Triangulo();
		z = new Triangulo();
		
		
		System.out.println("entre com as areas do seu primeiro Triangulo");
		t.a =sc.nextDouble();
		t.b =sc.nextDouble();
		t.c= sc.nextDouble();
		
		System.out.println("entre com as areas do seu segundo triangulo");
		
		z.a=sc.nextDouble();
		z.b= sc.nextDouble();
		z.c= sc.nextDouble();
		
		
		double areaT = t.area();
		
	
		double areaZ = z.area();
		
		
		
		System.out.println("area do triangulo Y = " + areaT);
		System.out.println("area do Triangulo Z  = "+ areaZ);
		
		
		if (areaT> areaZ) {
			System.out.println("a o triangulo preoduminante e o T");
		} else {
			System.out.println("o triangulo predominante e o Z");
		}
		
		}
}