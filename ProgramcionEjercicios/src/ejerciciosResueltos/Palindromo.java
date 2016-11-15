/**
 * 
 */
package ejerciciosResueltos;
import java.util.*;

/**
 * @author Uriel Guzman
 *
 */
public class Palindromo {

	/**
	 * @param args
	 * Ctrl+ Space para que Eclipse me de los nombres de variables
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textOriginal, textInvertido = "";
		
		Scanner inputText = new Scanner(System.in);
		
		System.out.println("Escribe un texto para ver si es un palíndromo");
        textOriginal = inputText.nextLine();        
       
        int longitudTexto = textOriginal.length();
        
        for (int i = longitudTexto - 1; i >= 0; i--)
        {
        	/*charAt regresa el caracter localizado en la posicion especificada en el String, la 
        	 *primera posición parte de 0*/
        	textInvertido = textInvertido + textOriginal.charAt(i);
        }
        
        /*equals.IgnoreCase omite si hay mayúsculas o minúsculas en el texto*/
        if (textOriginal.equalsIgnoreCase(textInvertido))
        {
        	 System.out.println("El texto escrito es palíndromo.");
        }
        else
        {
        	 System.out.println("El texto escrito no es palíndromo.");
        }

	}

}
