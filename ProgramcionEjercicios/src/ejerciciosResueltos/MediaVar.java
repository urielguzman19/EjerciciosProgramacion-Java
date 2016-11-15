package ejerciciosResueltos;
import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

/*Programa que obtiene la Media General y la Desviación Estándar
 *de n cantidad de números reales */
public class MediaVar {
	private static BufferedReader KeyboardInput = 
    new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter Output = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=0;
	    double desviacionStdNumeros, mediaNumeros=0.0; 
	    double sumaNumeros=0.0; double varianza=0.0; double rango=0.0;
	    
	    Output.println("¿Cuántos numeros reales quieres leer?");
	    /*Leemos la cantidad de numeros a ingresar, a su
	      vez este sera el tamaño del arreglo*/
		n=Integer.parseInt(KeyboardInput.readLine());
		
		/*Arreglo de numeros tamaño n de tipo double*/
		double [] indiceNumeros = new double [n];
		
		/*Ciclo para pedir y guardar los n Números en el Arreglo*/
		for (int i = 0; i < n; i++){
         Output.print("Escribe tu número " 
                      + (i+1)  + " : " );
         Output.flush();
         indiceNumeros[i] = Double.parseDouble(KeyboardInput.readLine());
         /*Calculamos la Sumatoria Total de los números guardados en el Arreglo*/
         sumaNumeros = sumaNumeros + indiceNumeros[i];      
                  
        } 
		 /*Calculamos la media de los numeros leídos*/
		 mediaNumeros=sumaNumeros/n; 
		 
		 /*Ciclo para calcular la Varianza de los números guardados*/
		 for(int i=0; i<n; i++){		
			 rango = Math.pow(indiceNumeros[i]-mediaNumeros,2);
			 varianza = varianza + rango;
		 }
		
		 /*Varianza final de los numeros guardados*/
	     varianza=varianza/(n-1);
	     
	     /*Una vez obtenida la varianza, obtenemos la desviacion
	       estandar por medio de su raíz cuadrada*/
	     desviacionStdNumeros=Math.sqrt(varianza);
	 
	    
	    /*Mandamos a imprimir los resultados de la media y la desviación estándar*/
	    Output.println("------------------------------------------------------");
		Output.println("Media General" + ": " + mediaNumeros);
		Output.println("Desviación Estándar" + ": " + desviacionStdNumeros);
		

	}

}
