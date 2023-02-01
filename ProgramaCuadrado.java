package constructor;

public class ProgramaCuadrado {

public static void main(String[] args) {
		
		Cuadrado cuad = new Cuadrado();
		
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
