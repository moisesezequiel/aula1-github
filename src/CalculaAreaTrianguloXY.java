import java.util.Locale;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;


public class CalculaAreaTrianguloXY {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		double t1,t2,t3,z1,z2,z3;
		
		System.out.println("entre com as areas do seu primeiro Triangulo");
		t1=sc.nextDouble();
		t2=sc.nextDouble();
		t3= sc.nextDouble();
		
		System.out.println("entre com as areas do seu segundo triangulo");
		
		z1=sc.nextDouble();
		z2= sc.nextDouble();
		z3= sc.nextDouble();
		
		double p = (t1+ t2 +t3)/2.0;
		double areaT = Math.sqrt(p* (p-t1)*(p-t2)*(p-t3));
		
		p = (z1+ z2 +z3)/2.0;
		double areaZ = Math.sqrt(p* (p-z1)*(p-z2)*(p-z3));
		
		
		
		System.out.println("area do triangulo Y = " + areaT);
		System.out.println("area do Triangulo Z  = "+ areaZ);
		
		
		if (areaT> areaZ) {
			System.out.println("a o triangulo preoduminante e o T");
		} else {
			System.out.println("o triangulo predominante e o Z");
		}
		
		}
}