package ejerciciosResueltos;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Un casting es una operación especial
		 * que nos permite realizar una conversión entre diferentes tipos de datos en Java*/
		int a=1;
		double b=2.5;
		a= (int) b;
		System.out.println(a);
		
		/*El casting solo puede realizarse entre tipos de datos que sean compatibles*/
		char c3 = (char)122;
		System.out.println("Variable c3 = " + c3);
		
		//Define una variable del tipo int con el valor 250
        int numeroEntero = 250;
        //Define una variable del tipo short y castea la variable numero
        short s = (short) numeroEntero;
        System.out.println(s);
		
		int myInt = 7;
		boolean result = true;
	    if (result == true)
		 {
		   do
		     System.out.println(myInt);
		   while (myInt > 10);		  
		   
		 }
	    /*Diferencia entre variables primitivas y variables de referencia a objetos
	     * -Variables primitivas almacenan los valores actuales que les son asignados
	     * -Variables de referencia a objetos- Almacenan las direcciones de memoria de los objetos
	     * a los cuales hacen referencia */
	    
	    /*Recordatorio de Operadores
	     * a -= b is equal to a = a – b
           a += b is equal to a = a + b 
           a *= b is equal to a = a * b
           a /= b is equal to a = a / b
         */
	    
        /*El casting tambíen se puede usar para transformar un objeto de una clase a otra clase 
         *siempre y cuando haya una relación de herencia  entre ambas.*/
	    
             

	}

}
