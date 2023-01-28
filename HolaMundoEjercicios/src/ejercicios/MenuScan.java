package ejercicios;

import java.util.Scanner;

public class MenuScan {
	
	public static void main(String[] args) {
		
		
		Scanner escanear = new Scanner(System.in);
		String pr;
		int a,b,c;
		System.out.println("Â¿Que figura desea? 1.Cuadrado    o    2.Circulo");
		pr = escanear.nextLine();
		a = Integer.parseInt(pr);
		
		if(a == 1) {
			System.out.println("Introduzca el valor del lado (entero)");
			pr = escanear.nextLine();
			cuadrado cuad = new cuadrado();
			b = Integer.parseInt(pr);
			cuad.cambLong(b);
			
			System.out.println("Calcular:   1.Diagonal   Ã³   2.Perimetro   Ã³   3.Area");
			pr = escanear.nextLine();
			c = Integer.parseInt(pr);
			
			if(c == 1) {
				System.out.println("Diagonal: " +cuad.calcDiag());
			}
			
			if(c == 2) {
				System.out.println("PerÃ­metro: " +cuad.calcPeri());
			}
			
			if(c == 3) {
				System.out.println("Ãrea: " +cuad.calcArea());
			}
		}
		
		if(a == 2) {
			System.out.println("Introduzca el valor del radio (entero)");
			pr = escanear.nextLine();
			circulo circ = new circulo();
			b = Integer.parseInt(pr);
			circ.cambRadio(b);
			
			System.out.println("Calcular:   1.Circunferencia   Ã³   2.Area");
			pr = escanear.nextLine();
			c = Integer.parseInt(pr);
			
			if(c == 1) {
				System.out.println("Circunferencia: " +circ.calcCircunf());
			}
			
			if(c == 2 ) {
				System.out.println("Ãrea: " +circ.calcAreaCirc());
			}
		}
	}
}
