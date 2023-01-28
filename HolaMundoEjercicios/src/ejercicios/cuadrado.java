package ejercicios;


public class cuadrado {
	
	public int ID;
	public float f;
	
	public cuadrado() {
		this(170465);
	}

	public cuadrado(int ID) {
		this.ID = ID;
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

}

