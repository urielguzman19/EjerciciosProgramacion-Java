package ejerciciosResueltos;
import java.util.*;
import java.io.*;
/*Calculadora que realiza operaciones básicas con dos números*/
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int x = 0;
		int y = 0;
		int sum;
		
		/*Define un flujo de datos de salida*/
		PrintStream out;
		/*Define un flujo de datos de entrada*/
		Scanner input;
		/*Instancia y crea un objeto de la clase Calculadora */
		Calculadora calc= new Calculadora();
		
		try{
			/*Crea un flujo de salida de datos que se guardan en un txt llamado
			 *calclog (Registro de Cálculos)*/
			out = new PrintStream("calclog.txt");
			/*Menú de opciones presentado al usuario*/
			do{
			    System.out.println("Programa Calculadora");
			    System.out.println("---------------------\n");
			    System.out.println("1. Suma");
			    System.out.println("2. Resta");
			    System.out.println("3. Multiplicación");
			    System.out.println("4. División");
			    System.out.println("5. Residuo");
			    System.out.println("6. Potencia");
			    System.out.println("7. Salir del Programa\n");
			    System.out.println("Escoge una Opción: ");
			    
			    /*Lee la opcion ingresada por el usuario*/
			    input=new Scanner(System.in);
			    choice= input.nextInt();
			    
			    /*Mientras se ingrese un valor diferente a 99 o 
			     *diferente al rango [1,6] manda mensaje de advertencia*/
			    while ((choice < 1 || choice > 6) && choice!=7){
			    	System.out.println("Por favor ingresa 1, 2, 3, 4, 5 o 6");
			    	choice=input.nextInt();
			    }
			    if(choice!=7){
			    	System.out.println("Por favor ingresa 2 números: ");
			    	x=input.nextInt();
			    	y=input.nextInt();
			    }
			    
			    /*Manda llamar y ejecutar cada una de las funciones
			     *que realizan las operaciones de acuerdo a la opción ingresada
			     *por el usuario*/
			    switch(choice){
			       case 1:
			    	   /*Llama la función add pasándole
			    	    *los parametros con los valores de x y y
			    	    *sum guarda el resultado de la función*/
			    	   sum=calc.add(x, y);
			    	   System.out.printf("La SUMA es %d\n\n", sum);
			    	   out.println(x + " + " + y + " = " + sum);
			       break;
			       
			       case 2:
			    	   sum=calc.sub(x, y);
			    	   System.out.printf("La RESTA es %d\n\n", sum);
			    	   out.println(x + " - " + y + " = " + sum);
				   break;
				   
			       case 3:
			    	   sum=calc.multi(x, y);
			    	   System.out.printf("La MULTIPLICACIÓN es %d\n\n", sum);
			    	   out.println(x + " * " + y + " = " + sum);
				   break;
				   
			       case 4:
			    	   sum=calc.div(x, y);
			    	   System.out.printf("La DIVISIÓN es %d\n\n", sum);
			    	   out.println(x + " / " + y + " = " + sum);
				   break;
				   
			       case 5:
			    	   sum=calc.mod(x, y);
			    	   System.out.printf("El RESIDUO es %d\n\n", sum);
			    	   out.println(x + " % " + y + " = " + sum);
				   break;
				   
			       case 6:
			    	   sum=calc.pow(x, y);
			    	   System.out.printf("La POTENCIA es %d\n\n", sum);
			    	   out.println(x + " ^ " + y + " = " + sum);
				   break;
			       
			    }
			    
			    
			}
			while(choice!=7);
			input.close();
			System.out.println("Finalizando programa...");
			
			
		}
		catch(Exception e){
			System.out.println("ERROR: ¡Algo ocurrió!");
			e.printStackTrace();
			
		}		

	}
	/*Función que implementa la suma*/
	public int add(int num1, int num2){
		int suma;
		suma = num1 + num2;
		
		return suma;		
	}
	/*Función que implementa la resta*/
	public int sub(int num1, int num2){
		int resta;
		resta = num1 - num2;
		
		return resta;
	}
	/*Función que implementa el producto*/
	public int multi(int num1, int num2){
		int multi;
		multi = num1 * num2;
		
		return multi;		
	}
	/*Función que implementa la division*/
	public int div(int num1, int num2){
		int div;
		
		div = num1 / num2;
		
		return div;
		
	}
	/*Función que implementa el residuo*/
	public int mod (int num1, int num2){
		int mod;
		mod = num1 % num2;
		
		return mod;
		
	}
	/*Función que implementa la potencia*/
	public int pow (int base, int exp){
		int pow = 1;
		
		/*Si exponente vale 0 la potencia vale 1*/
		if(exp == 0){
		   pow = 1;
		}
		/*Mientras potencia sea mayor a 0 se calcula  mediante asignacion del
		 * producto a su multiplicacion por la base*/
		while(exp > 0){
			pow = pow * base;
			exp--;
		}
		return pow;
	}


}
