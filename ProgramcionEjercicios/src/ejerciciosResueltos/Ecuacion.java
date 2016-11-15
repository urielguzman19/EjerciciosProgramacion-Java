package ejerciciosResueltos;
import java.io.*;
import java.util.Scanner;

public class Ecuacion {
/*Pedir los coeficientes de una ecuación de 2º grado, y muestre
 *sus soluciones reales. Si no existen,
  indicarlo entonces.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*objeto de la clase Scanner asociado al
		 *dispositivo de entrada(Teclado) usado para leer entradas*/
		Scanner scanner = new Scanner(System.in);
		
		double a,b,c; // coeficientes ax^2+bx+c=0
		double x1,x2,d; // soluciones y determinante
		System.out.println("Introduzca primer coeficiente (a):");
		a=scanner.nextDouble();
		System.out.println("Introduzca segundo coeficiente: (b):");
		b=scanner.nextDouble();
		System.out.println("Introduzca tercer coeficiente: (c):");
		c=scanner.nextDouble();
		
		// calculamos el determinante
		d=((b*b)-4*a*c);
		if(d<0){
		  System.out.println("No existen soluciones reales");
		  System.out.println("Determinante: (d) es igual a: "+d);
		}
		else{
		// si es diferente de 0 se obtienen los coeficientes
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Solución x1: " + x1);
			System.out.println("Solución x2: " + x2);
		}

	}

}
