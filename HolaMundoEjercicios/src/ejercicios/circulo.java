package ejercicios;

public class circulo {

	public int rad;
	public float d;
	
	public circulo() {
		this(170465);
	}
	
	public circulo(int rad) {
		this.rad = rad;
	}
	
	public float calcCircunf() {
		d = rad;
		return (float) (2*3.14*d);
	}

	public float calcAreaCirc() {
		d = rad;
		return (float) 3.14*d*d;
	}
	
	public void cambRadio(int radio) {
		rad = radio;
	}
}
