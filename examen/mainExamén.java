package examen;

import java.util.Scanner;


public class mainExamén {
	public static void main (String[]args) {
		Scanner cadena= new Scanner (System.in);
		Exámen prueba= new Exámen();
		String palabra;
		
		palabra = cadena.nextLine();
		System.out.println("palabra con mayuscula inicial es:"+prueba.primeraMayuscula(palabra));
	
		palabra = cadena.nextLine();
	    System.out.println("palabra con cadena invertida es:"+prueba.invertirCadena(palabra));
		
	    
	   palabra = cadena.nextLine();
	   System.out.println("las vocales en mayuscula son:"+prueba.vocalesMayuscula(palabra));
	   
}
}