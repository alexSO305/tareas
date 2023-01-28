package ejercicios;


public class MainCirculo {
	
	public static void main(String[] args) {
		circulo circ = new circulo();
		
		System.out.println("Radio: " +circ.rad);
		System.out.println("Circunferencia: " +circ.calcCircunf());
		System.out.println("Ãrea: " +circ.calcAreaCirc());
		circ.cambRadio(528);
		
		System.out.println("Radio: " +circ.rad);
		System.out.println("Circunferencia: " +circ.calcCircunf());
		System.out.println("Ãrea: " +circ.calcAreaCirc());

}
	
}
