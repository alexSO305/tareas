package constructor;

public class Cuadrado {

	public int ID;
	public float f;
	
	public Cuadrado() {
		this(170465);
	}

	public 	Cuadrado(int ID) {
		this.ID = ID;
	}
	
	public Cuadrado(double side) {
		// TODO Auto-generated constructor stub
	}

	public float calcDiag() {
		f = ID;
		return (float) Math.sqrt(2*f*f);
	}
	
	public int calcPeri() {
		return ID*4;
	}
	
	public int calcArea() {
		return ID*ID;
	}

	public void cambLong(int lado) {
		ID = lado;
	}

	public static String obtenerArea() {
		// TODO Auto-generated method stub
		return null;
	}
}
