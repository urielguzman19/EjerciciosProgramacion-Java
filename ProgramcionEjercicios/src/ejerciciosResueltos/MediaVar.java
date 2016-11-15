package ejerciciosResueltos;
import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

/*Programa que obtiene la Media General y la Desviaci�n Est�ndar
 *de n cantidad de n�meros reales */
public class MediaVar {
	private static BufferedReader KeyboardInput = 
    new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter Output = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=0;
	    double desviacionStdNumeros, mediaNumeros=0.0; 
	    double sumaNumeros=0.0; double varianza=0.0; double rango=0.0;
	    
	    Output.println("�Cu�ntos numeros reales quieres leer?");
	    /*Leemos la cantidad de numeros a ingresar, a su
	      vez este sera el tama�o del arreglo*/
		n=Integer.parseInt(KeyboardInput.readLine());
		
		/*Arreglo de numeros tama�o n de tipo double*/
		double [] indiceNumeros = new double [n];
		
		/*Ciclo para pedir y guardar los n N�meros en el Arreglo*/
		for (int i = 0; i < n; i++){
         Output.print("Escribe tu n�mero " 
                      + (i+1)  + " : " );
         Output.flush();
         indiceNumeros[i] = Double.parseDouble(KeyboardInput.readLine());
         /*Calculamos la Sumatoria Total de los n�meros guardados en el Arreglo*/
         sumaNumeros = sumaNumeros + indiceNumeros[i];      
                  
        } 
		 /*Calculamos la media de los numeros le�dos*/
		 mediaNumeros=sumaNumeros/n; 
		 
		 /*Ciclo para calcular la Varianza de los n�meros guardados*/
		 for(int i=0; i<n; i++){		
			 rango = Math.pow(indiceNumeros[i]-mediaNumeros,2);
			 varianza = varianza + rango;
		 }
		
		 /*Varianza final de los numeros guardados*/
	     varianza=varianza/(n-1);
	     
	     /*Una vez obtenida la varianza, obtenemos la desviacion
	       estandar por medio de su ra�z cuadrada*/
	     desviacionStdNumeros=Math.sqrt(varianza);
	 
	    
	    /*Mandamos a imprimir los resultados de la media y la desviaci�n est�ndar*/
	    Output.println("------------------------------------------------------");
		Output.println("Media General" + ": " + mediaNumeros);
		Output.println("Desviaci�n Est�ndar" + ": " + desviacionStdNumeros);
		

	}

}
