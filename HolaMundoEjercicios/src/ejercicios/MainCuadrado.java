package ejercicios;


public class MainCuadrado {
		
	public static void main(String[] args) {
		
		cuadrado cuad = new cuadrado();
		
		System.out.println("Lado: " +cuad.ID);
		System.out.println("Diagonal: " +cuad.calcDiag());
		System.out.println("PerÃ­metro: " +cuad.calcPeri());
		System.out.println("Ãrea: " +cuad.calcArea());
		cuad.cambLong(90);
		
		System.out.println("Lado: " +cuad.ID);
		System.out.println("Diagonal: " +cuad.calcDiag());
		System.out.println("PerÃ­metro: " +cuad.calcPeri());
		System.out.println("Ãrea: " +cuad.calcArea());
		

}

}